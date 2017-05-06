package com.jing.emperor.domain.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.DbConstants;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.convert.EmpCarConvert;
import com.jing.emperor.domain.car.service.EmpCarDomainServiceInterface;
import com.jing.emperor.domain.mapper.EmpCarMapper;
import com.jing.emperor.domain.mapper.EmpCarUserMapper;
import com.jing.emperor.domain.model.CreateEmpCarVo;
import com.jing.emperor.domain.model.EmpCar;
import com.jing.emperor.domain.model.EmpCarExample;
import com.jing.emperor.domain.model.EmpCarUser;
import com.jing.emperor.domain.model.EmpCarUserExample;
import com.jing.emperor.domain.model.EmpCarVo;
import com.jing.emperor.domain.model.QueryEmpCarVo;
import com.jing.emperor.domain.model.UpdateEmpCarVo;
import com.jing.emperor.domain.model.EmpCarExample.Criteria;

/**
 * 车辆信息 服务
 * @author liangjun
 *
 */
@Component
public class EmpCarDomainServiceImpl implements EmpCarDomainServiceInterface {

	@Resource
	private EmpCarMapper empCarMapper;
	
	@Resource
	private EmpCarUserMapper empCarUserMapper;
	
	@Override
	public String saveEmpCar(CreateEmpCarVo createEmpCarVo,Pvg pvg) throws EmporerCarException {
		if(null!=createEmpCarVo){
			EmpCar car=EmpCarConvert.convertCreateVoToEntity(createEmpCarVo);
			car.setGmtCreate(new Date());
			car.setCreator(pvg.getLoginId());
			car.setModifier(pvg.getLoginId());
			car.setGmtModified(new Date());
			if(null!=car){
				empCarMapper.insert(car);
				return String.valueOf(car.getId());
			}
		}
		return null;
	}

	@Override
	public EmpCarVo selectCarById(String id) throws EmporerCarException {
		if(StringUtil.isNotEmpty(id)){
			EmpCar car=empCarMapper.selectByPrimaryKey(Integer.parseInt(id));
			return EmpCarConvert.convertEntityToVo(car);
		}
		return null;
	}

	@Override
	public PageResultModel<List<EmpCarVo>> selectCarByQueryVo(QueryEmpCarVo queryVo) throws EmporerCarException {
		if(null==queryVo){
			throw new EmporerCarException("传入查询参数为null");
		}
		PageResultModel<List<EmpCarVo>> pageResult=new PageResultModel<>();
		List<EmpCarVo> result=new ArrayList<>();
		EmpCarExample query=new EmpCarExample();
		Criteria crteria=query.createCriteria();
		if(StringUtil.isNotEmpty(queryVo.getCarNo())){
			crteria.andCarNoEqualTo(queryVo.getCarNo());
		}
		if(StringUtil.isNotEmpty(queryVo.getOrgId())){
			crteria.andOrgIdEqualTo(queryVo.getOrgId());
		}
		if(StringUtil.isNotEmpty(queryVo.getUserId())){
			EmpCarUserExample example = new EmpCarUserExample();
			example.createCriteria().andUserIdEqualTo(queryVo.getUserId());
			List<EmpCarUser> carUsers=empCarUserMapper.selectByExample(example);
			List<String> carNos=new ArrayList<String>();
			if(ListUtil.isNotEmpty(carUsers)){
				carUsers.forEach(carUser->carNos.add(carUser.getCarNo()));
			}
			if(ListUtil.isNotEmpty(carNos)){
				crteria.andCarNoIn(carNos);
			}
		}
		PageHelper.startPage(queryVo.getPageStart()*queryVo.getPageSize(), queryVo.getPageSize());
		List<EmpCar> list=empCarMapper.selectByExample(query);
		PageInfo<EmpCar> page=new PageInfo<>(list);
		if(ListUtil.isNotEmpty(list)){
			list.forEach(empCar->result.add(EmpCarConvert.convertEntityToVo(empCar)));
		}
		pageResult.setTotalSize(page.getTotal());
		return pageResult;
	}

	@Override
	public String updateCar(UpdateEmpCarVo updateVo) throws EmporerCarException {
		EmpCar empCar=empCarMapper.selectByPrimaryKey(Integer.parseInt(updateVo.getId()));
		if(null!=empCar){
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			empCar.setGmtModified(new Date());
			empCar.setModifier(pvg.getLoginId());
			if(StringUtil.isNotEmpty(updateVo.getCarBrand())){
				empCar.setCarBrand(updateVo.getCarBrand());
			}
			if(StringUtil.isNotEmpty(updateVo.getCarInsuranceInfo())){
				empCar.setCarInsuranceInfo(updateVo.getCarInsuranceInfo());
			}
			if(null!=updateVo.getCarBuyerDate()){
				empCar.setCarBuyDate(updateVo.getCarBuyerDate());
			}
			empCarMapper.updateByPrimaryKey(empCar);
			return String.valueOf(empCar.getId());
		}
		return null;
	}

	@Override
	public boolean deleteById(String id) throws EmporerCarException {
		EmpCar empCar=empCarMapper.selectByPrimaryKey(Integer.parseInt(id));
		if(null!=empCar){
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			empCar.setGmtModified(new Date());
			empCar.setModifier(pvg.getLoginId());
			empCar.setIsDeleted(DbConstants.YES);
			empCarMapper.updateByPrimaryKey(empCar);
			return true;
		}
		return false;
	}

	@Override
	public List<String> selectUserByCarNo(String carNo) throws EmporerCarException {
		List<String> result=new ArrayList<>();
		if(StringUtil.isNotEmpty(carNo)){
			EmpCarUserExample example = new EmpCarUserExample();
			example.createCriteria().andCarNoEqualTo(carNo);
			List<EmpCarUser> carUsers=empCarUserMapper.selectByExample(example);
			if(ListUtil.isNotEmpty(carUsers)){
				carUsers.forEach(carUser->result.add(carUser.getUserId()));
			}
		}
		return result;
	}

	@Override
	public EmpCarVo selectEmpCarByCarNo(String carNo) throws EmporerCarException {
		EmpCarExample query=new EmpCarExample();
		query.createCriteria().andCarNoEqualTo(carNo);
		List<EmpCar> entityList=empCarMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(entityList)){
			return EmpCarConvert.convertEntityToVo(entityList.get(0));
		}
		return null;
	}
	

}

package com.jing.emperor.domain.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.convert.EmpCarOrderConvert;
import com.jing.emperor.domain.mapper.EmpCarOrderMapper;
import com.jing.emperor.domain.mapper.EmpCarUserMapper;
import com.jing.emperor.domain.model.CreateEmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarOrder;
import com.jing.emperor.domain.model.EmpCarOrderExample;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarUser;
import com.jing.emperor.domain.model.EmpCarUserExample;
import com.jing.emperor.domain.model.QueryEmpCarOrderVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarOrderExample.Criteria;
import com.jing.emperor.domain.service.EmpCarOrderDomainServiceInterface;

/**
 * 发车订单信息
 * @author liangjun
 *
 */
@Component
public class EmpCarOrderDomainServiceImpl implements EmpCarOrderDomainServiceInterface {

	@Resource
	private EmpCarOrderMapper empCarOrderMapper;
	
	@Resource
	private EmpCarUserMapper empCarUserMapper;
	
	@Override
	public String saveEmpCarOrder(CreateEmpCarOrderVo createEmpCarOrderVo) throws EmporerCarException {
		EmpCarOrder record=EmpCarOrderConvert.convertCreateVotoEntity(createEmpCarOrderVo);
		Pvg pvg=new Pvg();
		pvg.setLoginId("liangjun.huanglj");
		pvg.setOrg("12");
		Date currentDate=new Date();
		record.setCreator(pvg.getLoginId());
		record.setModifier(pvg.getLoginId());
		record.setGmtCreate(currentDate);
		record.setGmtModified(currentDate);
		empCarOrderMapper.insert(record);
		if(null==record.getId()){
			return null;
		}
		return String.valueOf(record.getId());
	}

	@Override
	public EmpCarOrderVo selectCarOrderById(String id) throws EmporerCarException {
		EmpCarOrder empCarOrder=empCarOrderMapper.selectByPrimaryKey(Integer.parseInt(id));
		return EmpCarOrderConvert.convertEntityToVo(empCarOrder);
	}

	@Override
	public PageResultModel<List<EmpCarOrderVo>> selectCarOrderByQueryVo(QueryEmpCarOrderVo queryVo)
			throws EmporerCarException {
		EmpCarOrderExample query=new EmpCarOrderExample();
		Criteria criteria=query.createCriteria();
		if(StringUtil.isNotEmpty(queryVo.getCarNo())){
			criteria.andCarNoEqualTo(queryVo.getCarNo());
		}
		if(StringUtil.isNotEmpty(queryVo.getOrgId())){
			criteria.andOrgIdEqualTo(queryVo.getOrgId());
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
				criteria.andCarNoIn(carNos);
			}
		}
		PageHelper.startPage((queryVo.getPageStart()-1)*queryVo.getPageSize(),queryVo.getPageSize());
		List<EmpCarOrder> orderList=empCarOrderMapper.selectByExample(query);
		List<EmpCarOrderVo> orderVoList=new ArrayList<EmpCarOrderVo>();
		PageResultModel<List<EmpCarOrderVo>> pageResult=new PageResultModel<List<EmpCarOrderVo>>();
		if(ListUtil.isNotEmpty(orderList)){
			orderList.forEach(order->orderVoList.add(EmpCarOrderConvert.convertEntityToVo(order)));
		}
		PageInfo<EmpCarOrder> page=new PageInfo<>();
		pageResult.setValue(orderVoList);
		pageResult.setTotalSize(page.getTotal());
		return pageResult;
	}

	@Override
	public String updateCarOrder(UpdateEmpCarOrderVo updateVo) throws EmporerCarException {
		if(null==updateVo||StringUtil.isEmpty(updateVo.getOrderId())){
			throw new EmporerCarException("订单ID为空，不允许更新");
		}
		EmpCarOrder carOrder=empCarOrderMapper.selectByPrimaryKey(Integer.parseInt(updateVo.getOrderId()));
		if(null!=carOrder){
			EmpCarOrderConvert.convertUpdateVotoEntity(updateVo, carOrder);
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			carOrder.setGmtModified(new Date());
			carOrder.setModifier(pvg.getLoginId());
			empCarOrderMapper.updateByPrimaryKey(carOrder);
			return String.valueOf(carOrder.getId());
		}
		return null;
	}

}

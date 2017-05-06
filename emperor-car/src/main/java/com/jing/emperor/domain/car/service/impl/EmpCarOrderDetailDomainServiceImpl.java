package com.jing.emperor.domain.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.convert.EmpCarOrderDetailConvert;
import com.jing.emperor.domain.car.service.EmpCarOrderDetailDomainServiceInterface;
import com.jing.emperor.domain.mapper.EmpCarOrderDetailMapper;
import com.jing.emperor.domain.model.CreateEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderDetail;
import com.jing.emperor.domain.model.EmpCarOrderDetailExample;
import com.jing.emperor.domain.model.EmpCarOrderDetailExample.Criteria;
import com.jing.emperor.domain.model.EmpCarOrderDetailVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderDetailVo;

/**
 * 订单名细
 * @author liangjun
 */
@Component
public class EmpCarOrderDetailDomainServiceImpl implements EmpCarOrderDetailDomainServiceInterface {

	@Resource
	private EmpCarOrderDetailMapper empCarOrderDetailMapper;
	
	@Override
	public String saveEmpCarOrderDetail(CreateEmpCarOrderDetailVo createEmpCarOrderDetailVo,Pvg pvg)
			throws EmporerCarException {
		EmpCarOrderDetail entity=EmpCarOrderDetailConvert.convertCreateVotoEntity(createEmpCarOrderDetailVo);
		if(null!=entity){
			Date currentDate=new Date();
			entity.setCreator(pvg.getLoginId());
			entity.setGmtCreate(currentDate);
			entity.setModifier(pvg.getLoginId());
			entity.setGmtModified(currentDate);
			empCarOrderDetailMapper.insert(entity);
			if(null!=entity.getId()){
				return String.valueOf(entity.getId());
			}
		}
		return null;
	}

	@Override
	public EmpCarOrderDetailVo selectCarOrderDetailById(String id) throws EmporerCarException {
		return EmpCarOrderDetailConvert.convertEntityToVo(empCarOrderDetailMapper.selectByPrimaryKey(Integer.parseInt(id)));
	}

	@Override
	public List<EmpCarOrderDetailVo> selectCarOrderDetailByQueryVo(QueryEmpCarOrderDetailVo queryVo)
			throws EmporerCarException {
		if(null==queryVo){
			throw new EmporerCarException("查询参数为null");
		}
		EmpCarOrderDetailExample query=new EmpCarOrderDetailExample();
		Criteria criteria=query.createCriteria();
		if(StringUtil.isNotEmpty(queryVo.getCustomerId())){
			criteria.andCustomerIdEqualTo(queryVo.getCustomerId());
		}
		if(StringUtil.isNotEmpty(queryVo.getOrderId())){
			criteria.andOrderIdEqualTo(queryVo.getOrderId());
		}
		if(ListUtil.isNotEmpty(queryVo.getStatus())){
			criteria.andStatusIn(queryVo.getStatus());
		}
		List<EmpCarOrderDetail> detailList=empCarOrderDetailMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(detailList)){
			List<EmpCarOrderDetailVo> result=new ArrayList<EmpCarOrderDetailVo>();
			detailList.forEach(orderDetail->result.add(EmpCarOrderDetailConvert.convertEntityToVo(orderDetail)));
		}
		return null;
	}

	@Override
	public String updateCarOrderDetail(UpdateEmpCarOrderDetailVo updateVo) throws EmporerCarException {
		if(StringUtil.isEmpty(updateVo.getId())&&(StringUtil.isEmpty(updateVo.getCustomerId())||StringUtil.isEmpty(updateVo.getId()))){
			throw new EmporerCarException("订单ID&&客户ID与订单明细ID不能同时为空");
		}
		EmpCarOrderDetailExample query=new EmpCarOrderDetailExample();
		Criteria criteria=query.createCriteria();
		if(StringUtil.isNotEmpty(updateVo.getCustomerId())&&StringUtil.isNotEmpty(updateVo.getOrderId())){
			criteria.andCustomerIdEqualTo(updateVo.getCustomerId()).andOrderIdEqualTo(updateVo.getOrderId());
		}
		if(StringUtil.isNotEmpty(updateVo.getId())){
			criteria.andIdEqualTo(Integer.parseInt(updateVo.getId()));
		}
		List<EmpCarOrderDetail> entityList=empCarOrderDetailMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(entityList)){
			EmpCarOrderDetail detailEntity=entityList.get(0);
			empCarOrderDetailMapper.updateByPrimaryKey(EmpCarOrderDetailConvert.convertUpdateVotoEntity(updateVo, detailEntity));
			return String.valueOf(detailEntity.getId());
		}
		return null;
	}

}

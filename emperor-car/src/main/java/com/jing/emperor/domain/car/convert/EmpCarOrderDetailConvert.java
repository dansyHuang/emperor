package com.jing.emperor.domain.car.convert;

import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.DbConstants;
import com.jing.emperor.domain.model.CreateEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderDetail;
import com.jing.emperor.domain.model.EmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderDetailVo;

/**
 * 发车订单 类型转换
 * @author liangjun
 *
 */
public class EmpCarOrderDetailConvert {

	public static EmpCarOrderDetail convertCreateVotoEntity(CreateEmpCarOrderDetailVo createVo){
		if(null==createVo){
			return null;
		}
		EmpCarOrderDetail carOrder=new EmpCarOrderDetail();
		carOrder.setCustomerId(createVo.getCustomerId());
		carOrder.setIsDeleted(DbConstants.NO);
		carOrder.setOrderId(createVo.getOrderId());
		carOrder.setPrice(createVo.getPrice());
		carOrder.setStatus(EmpCarOrderDetailStatusEnum.WAIT_START.getStatus());
		carOrder.setTravelId(createVo.getTravelId());
		carOrder.setType(createVo.getType());
		return carOrder;
	}
	
	public static EmpCarOrderDetail convertUpdateVotoEntity(UpdateEmpCarOrderDetailVo updateVo,EmpCarOrderDetail carOrder){
		if(null==updateVo){
			return carOrder;
		}
		if(StringUtil.isNotEmpty(updateVo.getType())){
			carOrder.setType(updateVo.getType());
		}
		if(StringUtil.isNotEmpty(updateVo.getStatus())){
			carOrder.setStatus(updateVo.getStatus());
		}
			
		return carOrder;
	}
	//实体转换为vo
	public static EmpCarOrderDetailVo convertEntityToVo(EmpCarOrderDetail entity){
		if(null==entity){
			return null;
		}
		EmpCarOrderDetailVo vo=new EmpCarOrderDetailVo();
		vo.setCreator(entity.getCreator());
		vo.setCustomerId(entity.getCustomerId());
		vo.setGmtCreate(entity.getGmtCreate());
		vo.setOrderId(entity.getOrderId());
		vo.setId(String.valueOf(entity.getId()));
		vo.setPrice(entity.getPrice());
		vo.setStatus(entity.getStatus());
		vo.setStatusDesc(EmpCarOrderDetailStatusEnum.getInstance(entity.getStatus()).getDescription());
		vo.setTravelId(entity.getTravelId());
		vo.setType(entity.getType());
		vo.setTypeDesc(EmpCarOrderDetailStatusEnum.getInstance(entity.getType()).getDescription());
		vo.setTravelId(entity.getTravelId());
		return vo;
	}
}

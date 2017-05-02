package com.jing.emperor.domain.car.convert;

import com.jing.emperor.common.DbConstants;
import com.jing.emperor.domain.model.CreateEmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarOrder;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderVo;

/**
 * 发车订单 类型转换
 * @author liangjun
 *
 */
public class EmpCarOrderConvert {

	public static EmpCarOrder convertCreateVotoEntity(CreateEmpCarOrderVo createVo){
		if(null==createVo){
			return null;
		}
		EmpCarOrder carOrder=new EmpCarOrder();
		carOrder.setActualAmount(createVo.getActualAmount());
		carOrder.setActualCustomerCount(createVo.getActualCustomerCount());
		carOrder.setCarNo(createVo.getCarNo());
		carOrder.setEndPointId(createVo.getEndPoint());
		carOrder.setIsDeleted(DbConstants.NO);
		carOrder.setOrderCustomerCount(createVo.getOrderCustomerCount());
		carOrder.setStartPointId(createVo.getStartPoint());
		carOrder.setTotalAmount(createVo.getTotalAmount());
		carOrder.setStatus(EmpCarOrderStatusEnum.WAIT_START.getStatus());
		return carOrder;
	}
	
	public static EmpCarOrder convertUpdateVotoEntity(UpdateEmpCarOrderVo updateVo,EmpCarOrder carOrder){
		if(null==updateVo){
			return carOrder;
		}
		if(0!=updateVo.getActualAmount()){
			carOrder.setActualAmount(updateVo.getActualAmount());
		}
		if(0!=updateVo.getActualCustomerCount()){
			carOrder.setActualCustomerCount(updateVo.getActualCustomerCount());
		}
		if(0!=updateVo.getOrderCustomerCount()){
			carOrder.setOrderCustomerCount(updateVo.getOrderCustomerCount());
		}
		if(0!=updateVo.getTotalAmount()){
			carOrder.setTotalAmount(updateVo.getTotalAmount());
		}
		if(null!=updateVo.getStatus()){
			carOrder.setStatus(updateVo.getStatus().getStatus());
		}
		if(null!=updateVo.getEndTime()){
			carOrder.setEndTime(updateVo.getEndTime());
		}
		if(null!=updateVo.getStartTime()){
			carOrder.setStartTime(updateVo.getStartTime());
		}
		return carOrder;
	}
	//实体转换为vo
	public static EmpCarOrderVo convertEntityToVo(EmpCarOrder entity){
		if(null==entity){
			return null;
		}
		EmpCarOrderVo vo=new EmpCarOrderVo();
		vo.setId(String.valueOf(entity.getId()));
		vo.setActualAmount(entity.getActualAmount());
		vo.setActualCustomerCount(entity.getActualCustomerCount());
		vo.setEndPoint(entity.getEndPointId());
		vo.setEndTime(entity.getEndTime());
		vo.setOrderCustomerCount(entity.getOrderCustomerCount());
		vo.setStartPoint(entity.getStartPointId());
		vo.setTatalAmount(entity.getTotalAmount());
		vo.setGmtCreate(entity.getGmtCreate());
		vo.setCreator(entity.getCreator());
		vo.setCarNo(entity.getCarNo());
		return vo;
	}
}

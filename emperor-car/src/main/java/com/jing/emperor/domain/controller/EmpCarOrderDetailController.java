package com.jing.emperor.domain.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.ResultModel;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.convert.EmpCarOrderDetailStatusEnum;
import com.jing.emperor.domain.car.convert.EmpCarOrderStatusEnum;
import com.jing.emperor.domain.model.CreateEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderVo;
import com.jing.emperor.domain.service.impl.EmpCarDomainServiceImpl;
import com.jing.emperor.domain.service.impl.EmpCarOrderDetailDomainServiceImpl;
import com.jing.emperor.domain.service.impl.EmpCarOrderDomainServiceImpl;

/**
 * 车辆发车订单详情
 * @author liangjun
 *
 */
@RestController
@RequestMapping("/api")
public class EmpCarOrderDetailController {
	
	Logger logger=LoggerFactory.getLogger(EmpCarOrderDetailController.class);

	@Resource
	private EmpCarOrderDetailDomainServiceImpl empCarOrderDetailDomainService;
	
	@Resource
	private EmpCarOrderDomainServiceImpl empCarOrderDomainService;
	
	@Resource
	private EmpCarDomainServiceImpl empCarDomainServiceImpl;
	
	@RequestMapping(value="/carorderdetail",method=RequestMethod.POST)
	public ResultModel<String> createEmpCarOrderDetail(@RequestBody @Valid CreateEmpCarOrderDetailVo record){
		ResultModel<String> result=new ResultModel<String>();
		try {
			//校验当前是否有未完成的行程
			QueryEmpCarOrderDetailVo queryVo=new QueryEmpCarOrderDetailVo();
			queryVo.setCustomerId(record.getCustomerId());
			queryVo.setOrderId(record.getOrderId());
			List<String> status=new ArrayList<String>();
			status.add(EmpCarOrderStatusEnum.STARTING.getStatus());
			status.add(EmpCarOrderStatusEnum.WAIT_START.getStatus());
			List<EmpCarOrderDetailVo> existOrderDetails=empCarOrderDetailDomainService.selectCarOrderDetailByQueryVo(queryVo);
			if(ListUtil.isNotEmpty(existOrderDetails)){
				throw new EmporerCarException("当前存在未完成的订单，请先完成或取消订单");
			}
			//校验当前车位是否已满
			EmpCarOrderVo carOrderVo=empCarOrderDomainService.selectCarOrderById(record.getOrderId());
			if(null==carOrderVo){
				throw new EmporerCarException("未找到当前与之匹配的行程");
			}
			EmpCarVo carVo=empCarDomainServiceImpl.selectEmpCarByCarNo(carOrderVo.getCarNo());
			if(null==carVo){
				throw new EmporerCarException("未找到当前与之匹配的车辆");
			}
			int totalSeats=carVo.getCarSeats();
			if(carOrderVo.getOrderCustomerCount()+1>totalSeats){
				throw new EmporerCarException("车位已满，请选择其他车辆");
			}
			//更新预订座位数
			UpdateEmpCarOrderVo updateVo=new UpdateEmpCarOrderVo();
			updateVo.setOrderCustomerCount(carOrderVo.getOrderCustomerCount()+1);
			empCarOrderDomainService.updateCarOrder(updateVo);
			//保存订单明细
			String id=empCarOrderDetailDomainService.saveEmpCarOrderDetail(record);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController createEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping(value="/carorderdetail/cancel/{id}",method=RequestMethod.PUT)
	public ResultModel<Boolean> cancelOrder(@PathVariable(name ="id") String id){
		ResultModel<Boolean> result=new ResultModel<Boolean>();
		try {
			UpdateEmpCarOrderDetailVo updateVo=new UpdateEmpCarOrderDetailVo();
			updateVo.setId(id);
			updateVo.setStatus(EmpCarOrderDetailStatusEnum.CANCEL.getStatus());
			empCarOrderDetailDomainService.updateCarOrderDetail(updateVo);
			result.setValue(true);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController modifyEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping(value="/carorderdetail/finish",method=RequestMethod.PUT)
	public ResultModel<Boolean> finishOrder(@PathVariable(name ="id") String id){
		ResultModel<Boolean> result=new ResultModel<Boolean>();
		try {
			UpdateEmpCarOrderDetailVo updateVo=new UpdateEmpCarOrderDetailVo();
			updateVo.setId(id);
			updateVo.setStatus(EmpCarOrderDetailStatusEnum.FINISH.getStatus());
			empCarOrderDetailDomainService.updateCarOrderDetail(updateVo);
			result.setValue(true);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController modifyEmpCarOrder",e);
		}
		return result;
	}
	
	
	@RequestMapping("/carorderdetail/{id}")
	public ResultModel<EmpCarOrderDetailVo> getCarOrderById(@PathVariable(name ="id") String id){
		ResultModel<EmpCarOrderDetailVo> result=new ResultModel<EmpCarOrderDetailVo>();
		try {
			EmpCarOrderDetailVo carVo=empCarOrderDetailDomainService.selectCarOrderDetailById(id);
			result.setValue(carVo);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController getCarOrderById",e);
		}
		return result;
	}
	
	
	
}

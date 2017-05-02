package com.jing.emperor.domain.controller;

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
import com.jing.emperor.domain.car.convert.EmpCarOrderStatusEnum;
import com.jing.emperor.domain.model.CreateEmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderVo;
import com.jing.emperor.domain.model.QueryEmpCarVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderVo;
import com.jing.emperor.domain.service.impl.EmpCarOrderDomainServiceImpl;

/**
 * 车辆发车订单
 * @author liangjun
 *
 */
@RestController
@RequestMapping("/api")
public class EmpCarOrderController {
	
	Logger logger=LoggerFactory.getLogger(EmpCarOrderController.class);

	@Resource
	private EmpCarOrderDomainServiceImpl empCarOrderDomainService;
	
	@RequestMapping(value="/carorder",method=RequestMethod.POST)
	public ResultModel<String> createEmpCarOrder(@RequestBody @Valid CreateEmpCarOrderVo record){
		ResultModel<String> result=new ResultModel<String>();
		try {
			String id=empCarOrderDomainService.saveEmpCarOrder(record);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController createEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping(value="/carorder/up",method=RequestMethod.PUT)
	public ResultModel<String> modifyEmpCarOrder(@RequestBody @Valid UpdateEmpCarOrderVo updateVo){
		ResultModel<String> result=new ResultModel<String>();
		try {
			String id=empCarOrderDomainService.updateCarOrder(updateVo);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController modifyEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping(value="/carorder/start_travel",method=RequestMethod.PUT)
	public ResultModel<String> startCar(){
		ResultModel<String> result=new ResultModel<String>();
		try {
			UpdateEmpCarOrderVo updateVo =new UpdateEmpCarOrderVo();
			updateVo.setStatus(EmpCarOrderStatusEnum.STARTING);
			String id=empCarOrderDomainService.updateCarOrder(updateVo);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController modifyEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping(value="/carorder/end_travel",method=RequestMethod.PUT)
	public ResultModel<String> endTravel(){
		ResultModel<String> result=new ResultModel<String>();
		try {
			UpdateEmpCarOrderVo updateVo =new UpdateEmpCarOrderVo();
			updateVo.setStatus(EmpCarOrderStatusEnum.FINISH);
			String id=empCarOrderDomainService.updateCarOrder(updateVo);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController modifyEmpCarOrder",e);
		}
		return result;
	}
	
	@RequestMapping("/carorder/{id}")
	public ResultModel<EmpCarOrderVo> getCarOrderById(@PathVariable(name ="id") String id){
		ResultModel<EmpCarOrderVo> result=new ResultModel<EmpCarOrderVo>();
		try {
			EmpCarOrderVo carVo=empCarOrderDomainService.selectCarOrderById(id);
			result.setValue(carVo);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController getCarOrderById",e);
		}
		return result;
	}
	
	@RequestMapping("/carorders/{pageNumber}/{pageSize}")
	public PageResultModel<List<EmpCarOrderVo>> queryAllCarOrder(
			@PathVariable(name="pageNumber") int pageNumber,@PathVariable(name="pageSize") int pageSize){
		PageResultModel<List<EmpCarOrderVo>> result=new PageResultModel<List<EmpCarOrderVo>>();
		QueryEmpCarOrderVo queryVo =new QueryEmpCarOrderVo();
		queryVo.setPageSize(pageSize);
		queryVo.setPageStart((pageNumber-1)*pageSize);
		try {
			result=empCarOrderDomainService.selectCarOrderByQueryVo(queryVo);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController queryAllCarOrder",e);
		}
		return result;
		
	}
	
	@RequestMapping("/carorder/user/{userId}/{pageNumber}/{pageSize}")
	public PageResultModel<List<EmpCarOrderVo>> queryCarOrderByUserId(@PathVariable(name="userId") String userId
			,@PathVariable(name="pageNumber") int pageNumber,@PathVariable(name="pageSize") int pageSize){
		PageResultModel<List<EmpCarOrderVo>> result=new PageResultModel<List<EmpCarOrderVo>>();
		QueryEmpCarOrderVo queryVo =new QueryEmpCarOrderVo();
		queryVo.setUserId(userId);
		queryVo.setPageSize(pageSize);
		queryVo.setPageStart((pageNumber)*pageSize);
		try {
			PageResultModel<List<EmpCarOrderVo>> pageResult=empCarOrderDomainService.selectCarOrderByQueryVo(queryVo);
			if(null!=pageResult&&pageResult.getTotalSize()>0){
				result.setValue(pageResult.getValue());
			}
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController queryCarOrderByUserId",e);
		}
		return result;
		
	}
	
	@RequestMapping("/carorder/org/{orgId}/{pageNumber}/{pageSize}")
	public PageResultModel<List<EmpCarOrderVo>> queryCarOrderByOrgId(@PathVariable(name="orgId") String orgId
			,@PathVariable(name="pageNumber") int pageNumber,@PathVariable(name="pageSize") int pageSize){
		PageResultModel<List<EmpCarOrderVo>> result=new PageResultModel<List<EmpCarOrderVo>>();
		QueryEmpCarOrderVo queryVo =new QueryEmpCarOrderVo();
		queryVo.setOrgId(orgId);
		queryVo.setPageSize(pageSize);
		queryVo.setPageStart((pageNumber)*pageSize);
		try {
			PageResultModel<List<EmpCarOrderVo>> pageResult=empCarOrderDomainService.selectCarOrderByQueryVo(queryVo);
			if(null!=pageResult&&pageResult.getTotalSize()>0){
				result.setValue(pageResult.getValue());
			}
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarOrderController queryCarByOrgId",e);
		}
		return result;
		
	}
}

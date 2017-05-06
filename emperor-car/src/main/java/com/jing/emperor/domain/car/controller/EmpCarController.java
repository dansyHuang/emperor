package com.jing.emperor.domain.car.controller;

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
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.ResultModel;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.car.service.impl.EmpCarDomainServiceImpl;
import com.jing.emperor.domain.model.CreateEmpCarVo;
import com.jing.emperor.domain.model.EmpCarVo;
import com.jing.emperor.domain.model.QueryEmpCarVo;
import com.jing.emperor.domain.model.UpdateEmpCarVo;

/**
 * 车辆信息
 * @author liangjun
 *
 */
@RestController
@RequestMapping("/api")
public class EmpCarController {
	
	Logger logger=LoggerFactory.getLogger(EmpCarController.class);

	@Resource
	private EmpCarDomainServiceImpl empCarDomainService;
	
	@RequestMapping(value="/car",method=RequestMethod.POST)
	public ResultModel<String> createEmpCar(@RequestBody @Valid CreateEmpCarVo record){
		ResultModel<String> result=new ResultModel<String>();
		try {
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			String id=empCarDomainService.saveEmpCar(record,pvg);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController createEmpCar",e);
		}
		return result;
	}
	
	@RequestMapping(value="/car/up",method=RequestMethod.PUT)
	public ResultModel<String> modifyEmpCar(@RequestBody @Valid UpdateEmpCarVo updateVo){
		ResultModel<String> result=new ResultModel<String>();
		try {
			String id=empCarDomainService.updateCar(updateVo);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController modifyEmpCar",e);
		}
		return result;
	}
	
	@RequestMapping("/car/{id}")
	public ResultModel<EmpCarVo> getCarById(@PathVariable(name ="id") String id){
		ResultModel<EmpCarVo> result=new ResultModel<EmpCarVo>();
		try {
			EmpCarVo carVo=empCarDomainService.selectCarById(id);
			result.setValue(carVo);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController getCarById",e);
		}
		return result;
	}
	
	@RequestMapping("/cars/{pageNumber}/{pageSize}")
	public PageResultModel<List<EmpCarVo>> queryAllCar(
			@PathVariable(name="pageNumber") int pageNumber,@PathVariable(name="pageSize") int pageSize){
		PageResultModel<List<EmpCarVo>> result=new PageResultModel<List<EmpCarVo>>();
		QueryEmpCarVo queryVo =new QueryEmpCarVo();
		queryVo.setPageSize(pageSize);
		queryVo.setPageStart((pageNumber-1)*pageSize);
		try {
			result=empCarDomainService.selectCarByQueryVo(queryVo);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController queryAllCar",e);
		}
		return result;
		
	}
	
	@RequestMapping("/car/user/{userId}")
	public ResultModel<List<EmpCarVo>> queryCarByUserId(@PathVariable(name="userId") String userId){
		ResultModel<List<EmpCarVo>> result=new ResultModel<List<EmpCarVo>>();
		QueryEmpCarVo queryVo =new QueryEmpCarVo();
		queryVo.setUserId(userId);
		queryVo.setPageSize(100);
		try {
			PageResultModel<List<EmpCarVo>> pageResult=empCarDomainService.selectCarByQueryVo(queryVo);
			if(null!=pageResult&&pageResult.getTotalSize()>0){
				result.setValue(pageResult.getValue());
			}
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController queryCarByUserId",e);
		}
		return result;
		
	}
	
	@RequestMapping("/car/org/{orgId}")
	public ResultModel<List<EmpCarVo>> queryCarByOrgId(@PathVariable(name="orgId") String orgId){
		ResultModel<List<EmpCarVo>> result=new ResultModel<List<EmpCarVo>>();
		QueryEmpCarVo queryVo =new QueryEmpCarVo();
		queryVo.setOrgId(orgId);
		queryVo.setPageSize(100);
		try {
			PageResultModel<List<EmpCarVo>> pageResult=empCarDomainService.selectCarByQueryVo(queryVo);
			if(null!=pageResult&&pageResult.getTotalSize()>0){
				result.setValue(pageResult.getValue());
			}
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController queryCarByOrgId",e);
		}
		return result;
		
	}
}

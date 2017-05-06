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
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.service.impl.EmpCarSiteTravelDomainServiceImpl;
import com.jing.emperor.domain.model.EmpCarSiteTravelVo;
import com.jing.emperor.domain.model.QueryTraveVo;

/**
 * 车辆信息
 * @author liangjun
 *
 */
@RestController
@RequestMapping("/api")
public class EmpCarSiteTravelController {
	
	Logger logger=LoggerFactory.getLogger(EmpCarSiteTravelController.class);

	@Resource
	private EmpCarSiteTravelDomainServiceImpl empCarSiteTravelDomainServiceImpl;
	
	@RequestMapping(value="/car/travel",method=RequestMethod.POST)
	public ResultModel<String> createEmpCarTravel(@RequestBody @Valid EmpCarSiteTravelVo createVo){
		ResultModel<String> result=new ResultModel<String>();
		try {
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			String id=empCarSiteTravelDomainServiceImpl.createTravel(createVo,pvg);
			result.setValue(id);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarSiteTravelController createEmpCarTravel",e);
		}
		return result;
	}
	
	
	
	@RequestMapping("/car/travel/{orgId}/{startId}/{endId}")
	public ResultModel<List<EmpCarSiteTravelVo>> queryCarByPoint(@PathVariable(name="orgId") String orgId
			,@PathVariable(name="startId") String startId,@PathVariable(name="endId") String endId){
		ResultModel<List<EmpCarSiteTravelVo>> result=new ResultModel<List<EmpCarSiteTravelVo>>();
		try {
			List<EmpCarSiteTravelVo> voList=empCarSiteTravelDomainServiceImpl.queryByStartAndEnd(orgId, startId, endId);
			if(ListUtil.isNotEmpty(voList)){
				result.setValue(voList);
			}
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController queryCarByOrgId",e);
		}
		return result;
		
	}
	@RequestMapping("/car/travel/{orgId}")
	public PageResultModel<List<EmpCarSiteTravelVo>> queryCarByOrgId(@PathVariable(name="orgId")String orgId,@PathVariable(name="pageStart")int pageStart
			,@PathVariable(name="pageSize")int pageSize){
		PageResultModel<List<EmpCarSiteTravelVo>> result=new PageResultModel<List<EmpCarSiteTravelVo>>();
		try {
			QueryTraveVo queryVo=new QueryTraveVo();
			queryVo.setOrgId(orgId);
			result=empCarSiteTravelDomainServiceImpl.queryByQueryVo(queryVo, pageStart, pageSize);
		} catch (EmporerCarException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpCarController queryCarByOrgId",e);
		}
		return result;
		
	}
}

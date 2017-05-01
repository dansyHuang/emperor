package com.jing.emperor.domain.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.ResultModel;
import com.jing.emperor.common.exception.EmporerOrgException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.model.EmpCreateOrgVo;
import com.jing.emperor.domain.model.EmpOrgVo;
import com.jing.emperor.domain.model.EmpUpdateOrgVo;
import com.jing.emperor.domain.service.impl.EmpOrgDomainServiceImpl;

/**
 * 行政区划controller
 * @author liangjun
 */
@RestController
@RequestMapping("/api")
public class EmpOrgController {
	
	private Logger logger=LoggerFactory.getLogger(EmpOrgController.class);
	
	@Resource
	private EmpOrgDomainServiceImpl empOrgDomainService;
	
	@RequestMapping("/org/{id}")
	public ResultModel<EmpOrgVo> getEmpOrg(@PathVariable(name ="id") String id){
		ResultModel<EmpOrgVo> result=new ResultModel<EmpOrgVo>();
		try {
			EmpOrgVo org=empOrgDomainService.selectById(id);
			org.setSubOrgs(getSubEmpOrg(id));
		 	result.setValue(org);
		} catch (EmporerOrgException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpOrgController getEmpOrg ",e);
		}
		return result;
	}
	
	private List<EmpOrgVo> getSubEmpOrg(String id) throws NumberFormatException, EmporerOrgException{
		List<EmpOrgVo> orgs=null;
		if(StringUtil.isNotEmpty(id)){
			orgs=empOrgDomainService.selectByPid(id);
			if(ListUtil.isNotEmpty(orgs)){
				for (EmpOrgVo vo : orgs) {
					vo.setSubOrgs(getSubEmpOrg(vo.getId()));
				}
			}
		}
		return orgs;
	}
	
	
	@RequestMapping("/suborg/{pid}/{pageNumber}/{pageSize}")
	public PageResultModel<List<EmpOrgVo>> getEmpOrgs(@NotEmpty(message="父节点ID不能为空") @PathVariable(name ="pid")String pid,
			@PathVariable(name ="pageSize")int pageSize,@PathVariable(name ="pageNumber")int pageNumber){
		PageResultModel<List<EmpOrgVo>> result=new PageResultModel<>();
		try {
			result=empOrgDomainService.selectPageByPid(pid,pageNumber,pageSize);
		} catch (EmporerOrgException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpOrgController getEmpOrgs ",e);
		}
		return result;
	}
	@RequestMapping(value="/org" ,method=RequestMethod.POST)
	public ResultModel<String> saveOrg(@RequestBody @Valid EmpCreateOrgVo record){
		ResultModel<String> result=new ResultModel<String>();
		try {
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			int id=empOrgDomainService.saveEmpOrg(record,pvg);
			result.setValue(String.valueOf(id));
		} catch (EmporerOrgException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpOrgController saveOrg ",e);
		}
		return result;
		
	}
	
	@RequestMapping(value="/org/up" ,method=RequestMethod.PUT)
	public ResultModel<String> updateOrg(@RequestBody @Valid EmpUpdateOrgVo record){
		ResultModel<String> result=new ResultModel<String>();
		try {
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			String id=empOrgDomainService.updateEmpOrg(record);
			result.setValue(id);
		} catch (EmporerOrgException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpOrgController updateOrg ",e);
		}
		return result;
		
	}
	
	@RequestMapping(value="/org/del/{id}" ,method=RequestMethod.DELETE)
	public ResultModel<Boolean> deleteOrg(@PathVariable(name ="id") String id){
		ResultModel<Boolean> result=new ResultModel<Boolean>();
		try {
			Pvg pvg=new Pvg();
			pvg.setLoginId("liangjun.huanglj");
			result.setValue(empOrgDomainService.deleteById(id));
		} catch (EmporerOrgException e) {
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
			logger.error("EmpOrgController deleteOrg ",e);
		}
		return result;
		
	}
	
}

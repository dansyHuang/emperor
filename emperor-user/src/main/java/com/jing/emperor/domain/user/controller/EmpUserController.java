package com.jing.emperor.domain.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
import com.jing.emperor.common.exception.EmporerUserException;
import com.jing.emperor.domain.model.CreateEmpUserVo;
import com.jing.emperor.domain.model.EmpUserVo;
import com.jing.emperor.domain.model.QueryUserVo;
import com.jing.emperor.domain.model.UpdateEmpUserVo;
import com.jing.emperor.domain.user.service.impl.EmpUserDomainServiceImpl;

/**
 * 用户controller
 * @author liangjun
 *
 */
@RestController
@RequestMapping("/api")
public class EmpUserController {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private EmpUserDomainServiceImpl empUserDomainServiceImpl;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResultModel<String> createEmpCar(@RequestBody @Valid CreateEmpUserVo record){
		ResultModel<String> result=new ResultModel<String>();
		Pvg pvg=new Pvg();
		pvg.setLoginId("liangjun.huanglj");
		try {
			String id=empUserDomainServiceImpl.createEmpUser(record, pvg);
			result.setValue(id);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController createEmpCar",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping(value="/user/up",method=RequestMethod.PUT)
	public ResultModel<String> modifyEmpUser(@RequestBody @Valid UpdateEmpUserVo updateVo){
		ResultModel<String> result=new ResultModel<String>();
		Pvg pvg=new Pvg();
		pvg.setLoginId("liangjun.huanglj");
		try {
			String id=empUserDomainServiceImpl.updateEmpUser(updateVo, pvg);
			result.setValue(id);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController modifyEmpUser",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/user/{id}")
	public ResultModel<EmpUserVo> getUserById(@PathVariable(name ="id") String id){
		ResultModel<EmpUserVo> result=new ResultModel<EmpUserVo>();
		Pvg pvg=new Pvg();
		pvg.setLoginId("liangjun.huanglj");
		try {
			EmpUserVo userVo=empUserDomainServiceImpl.queryUserById(id);
			result.setValue(userVo);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController modifyEmpUser",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping("/user/phone/{phoneNum}")
	public ResultModel<EmpUserVo> getUserByPhoneNum(@PathVariable(name ="phoneNum") String phoneNum){
		ResultModel<EmpUserVo> result=new ResultModel<EmpUserVo>();
		Pvg pvg=new Pvg();
		pvg.setLoginId("liangjun.huanglj");
		try {
			EmpUserVo userVo=empUserDomainServiceImpl.queryUserByPhoneNum(phoneNum);
			result.setValue(userVo);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController modifyEmpUser",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}
	
	
	@RequestMapping("/user/orgId/{orgId}")
	public ResultModel<List<EmpUserVo>> getUserByQuery(@PathVariable(name ="orgId") String orgId,HttpServletRequest request){
		ResultModel<List<EmpUserVo>> result=new ResultModel<List<EmpUserVo>>();
		try {
			String userName=request.getParameter("userName");
			String idCard=request.getParameter("idCard");
			String phoneNum=request.getParameter("phoneNum");
			String loginId=request.getParameter("loginId");
			QueryUserVo queryVo=new QueryUserVo();
			queryVo.setIdCard(idCard);
			queryVo.setLoginId(loginId);
			queryVo.setOrgId(orgId);
			queryVo.setPhoneNum(phoneNum);
			queryVo.setUserName(userName);
			List<EmpUserVo> userVos=empUserDomainServiceImpl.queryByQueryVo(queryVo);
			result.setValue(userVos);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController modifyEmpUser",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}
	

	@RequestMapping("/user/page/{orgId}")
	public PageResultModel<List<EmpUserVo>> getUserPageByQuery(@PathVariable(name ="orgId") String orgId,HttpServletRequest request){
		PageResultModel<List<EmpUserVo>> result=new PageResultModel<List<EmpUserVo>>();
		try {
			String userName=request.getParameter("userName");
			String idCard=request.getParameter("idCard");
			String phoneNum=request.getParameter("phoneNum");
			String loginId=request.getParameter("loginId");
			int pageSize=request.getParameter("per_page")==null?0:Integer.parseInt(request.getParameter("per_page"));
			int pageStart=request.getParameter("page")==null?0:Integer.parseInt(request.getParameter("page"));
			QueryUserVo queryVo=new QueryUserVo();
			queryVo.setIdCard(idCard);
			queryVo.setLoginId(loginId);
			queryVo.setOrgId(orgId);
			queryVo.setPageSize(pageSize);
			queryVo.setPageStart(pageStart);
			queryVo.setPhoneNum(phoneNum);
			queryVo.setUserName(userName);
			result=empUserDomainServiceImpl.queryPageByQueryVo(queryVo);
		} catch (EmporerUserException e) {
			logger.error("EmpUserController modifyEmpUser",e);
			result.setSuccces(false);
			result.setErrorMsg(e.getMessage());
		}
		return result;
	}

}

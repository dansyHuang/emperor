package com.jing.emperor.domain.user.service;

import java.util.List;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.ResultModel;
import com.jing.emperor.common.exception.EmporerUserException;
import com.jing.emperor.domain.model.CreateEmpUserVo;
import com.jing.emperor.domain.model.EmpUserVo;
import com.jing.emperor.domain.model.QueryUserVo;
import com.jing.emperor.domain.model.UpdateEmpUserVo;

/**
 * 用户服务
 * @author liangjun
 *
 */
public interface EmpUserDomainServiceInterface {

	/**
	 * 创建用户
	 * @param userVo
	 * @return
	 * @throws EmporerUserException
	 */
	public String createEmpUser(CreateEmpUserVo userVo,Pvg pvg) throws EmporerUserException;
	
	/**
	 * 根据手机号查询
	 * @param phoneNum
	 * @return
	 * @throws EmporerUserException
	 */
	public EmpUserVo queryUserByPhoneNum(String phoneNum) throws EmporerUserException;
	
	
	/**
	 * 根据Id查询
	 * @param phoneNum
	 * @return
	 * @throws EmporerUserException
	 */
	public EmpUserVo queryUserById(String id) throws EmporerUserException;
	
	/**
	 * 非分页查询
	 * @param queryVo
	 * @return
	 */
	public List<EmpUserVo> queryByQueryVo(QueryUserVo queryVo) throws EmporerUserException;
	
	/**
	 * 更新用户信息
	 * @param update
	 * @param pvg
	 * @return
	 * @throws EmporerUserException
	 */
	public String updateEmpUser(UpdateEmpUserVo update,Pvg pvg) throws EmporerUserException;
	
	/**
	 * 分页查询
	 * @param queryVo
	 * @return
	 */
	public PageResultModel<List<EmpUserVo>> queryPageByQueryVo(QueryUserVo queryVo) throws EmporerUserException;
}

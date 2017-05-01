package com.jing.emperor.domain.service;

import java.util.List;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerOrgException;
import com.jing.emperor.domain.model.EmpCreateOrgVo;
import com.jing.emperor.domain.model.EmpOrgVo;
import com.jing.emperor.domain.model.EmpUpdateOrgVo;

/**
 * 行政区划信息
 * @author liangjun
 */
public interface EmpOrgDomainServiceInterface {

	/**
	 * 保存区划信息
	 * @param org
	 * @return
	 * @throws EmporerOrgException
	 */
	public int saveEmpOrg(EmpCreateOrgVo org,Pvg pvg) throws EmporerOrgException;
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 * @throws EmporerOrgException
	 */
	public EmpOrgVo	 selectById(String id) throws EmporerOrgException;
	
	
	/**
	 * 根据parnetId查询，带分页
	 * @param parentId
	 * @return
	 * @throws EmporerOrgException
	 */
	public PageResultModel<List<EmpOrgVo>> selectPageByPid(String parentId,int pageSize,int pageNumber) throws EmporerOrgException;
	
	
	/**
	 * 根据parnetId查询，不带分页
	 * @param parentId
	 * @return
	 * @throws EmporerOrgException
	 */
	public List<EmpOrgVo> selectByPid(String parentId) throws EmporerOrgException;
	
	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 * @throws EmporerOrgException
	 */
	public boolean deleteById(String id) throws EmporerOrgException;
	
	
	
	/**
	 * 更新区域组织信息
	 * @param org
	 * @return
	 * @throws EmporerOrgException
	 */
	public String updateEmpOrg(EmpUpdateOrgVo org) throws EmporerOrgException;
	
	
}

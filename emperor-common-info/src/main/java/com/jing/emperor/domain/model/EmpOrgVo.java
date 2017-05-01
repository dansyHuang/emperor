package com.jing.emperor.domain.model;

import java.util.Date;
import java.util.List;

/**
 * 区域组织VO
 * @author liangjun
 */
public class EmpOrgVo {

	/**
	 * 区域名称
	 */
	private String name;
	
	/**
	 * 父节点ID
	 */
	private String parentId;
	
	/**
	 * 描述信息
	 */
	private String remark;
	
	/**
	 * 创建日期
	 */
	private Date gmtCreate;
	
	/**
	 * 创建人
	 */
	private String creator;
	
	private String id;
	
	private List<EmpOrgVo> subOrgs;
	
	
	public List<EmpOrgVo> getSubOrgs() {
		return subOrgs;
	}

	public void setSubOrgs(List<EmpOrgVo> subOrgs) {
		this.subOrgs = subOrgs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}

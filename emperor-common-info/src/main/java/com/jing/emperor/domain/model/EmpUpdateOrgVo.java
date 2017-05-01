package com.jing.emperor.domain.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 区域组织VO
 * @author liangjun
 */
public class EmpUpdateOrgVo {

	
	/**
	 * id
	 */
	private String id;
	/**
	 * 区域名称
	 */
	@NotEmpty(message="区域名称不能为空")
	private String name;
	
	/**
	 * 父节点ID
	 */
	@NotEmpty(message="父节点ID不能为空")
	private String parentId;
	
	/**
	 * 描述信息
	 */
	private String remark;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}

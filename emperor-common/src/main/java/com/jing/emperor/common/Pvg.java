package com.jing.emperor.common;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户pvg信息
 * @author liangjun
 */
public class Pvg {

	@NotEmpty(message="当前登录人不能为空")
	private String loginId;
	
	private String roleName;
	
	private String org;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}
	
	
	
}

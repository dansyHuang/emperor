package com.jing.emperor.domain.model;

import java.io.Serializable;

/**
 * 车站
 * @author liangjun
 *
 */
public class EmpCarSiteVo implements Serializable {

	private static final long serialVersionUID = 905763477872192917L;

	private String id;
	
	private String orgId;
	
	private String name;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

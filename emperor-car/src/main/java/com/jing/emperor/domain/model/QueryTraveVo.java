package com.jing.emperor.domain.model;

import java.io.Serializable;

/**
 * 行程价格查询
 * @author liangjun
 *
 */
public class QueryTraveVo implements Serializable{

	private static final long serialVersionUID = 672779553415534542L;

	private String orgId;
	
	private String startId;
	
	private String endId;

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getStartId() {
		return startId;
	}

	public void setStartId(String startId) {
		this.startId = startId;
	}

	public String getEndId() {
		return endId;
	}

	public void setEndId(String endId) {
		this.endId = endId;
	}
	
	
}

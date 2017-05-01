package com.jing.emperor.domain.model;

/**
 * 发车订单查询vo
 * @author liangjun
 *
 */
public class QueryEmpCarOrderVo {

	/**
	 * 车牌号
	 */
	private String carNo;
	
	/**
	 * 司机ID
	 */
	private String userId;
	
	private String orgId;
	
	
	private int pageStart=0;
	
	private int pageSize=10;
	
	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	
}

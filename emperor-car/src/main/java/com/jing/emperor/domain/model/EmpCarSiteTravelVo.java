package com.jing.emperor.domain.model;

import java.io.Serializable;

/**
 * @author liangjun
 *
 */
public class EmpCarSiteTravelVo implements Serializable{

	private static final long serialVersionUID = 4675485499212361638L;

	private String startPoint;
	
	private String endPoint;
	
	private float price;
	
	private String orgId;
	
	private String startId;
	
	private String endId;
	
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

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}


	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 发车订单
 * @author liangjun
 *
 */
public class EmpCarOrderVo implements Serializable {

	private static final long serialVersionUID = 942609257870642829L;
	
	private String id;
	
	private String startPoint;
	
	private String endPoint;
	
	//发车时间 
	private Date startTime;
	
	//结束时间
	private Date endTime;

	//预订人数
	private int orderCustomerCount;
	
	//实际乘车人数
	private int actualCustomerCount;
	
	//订单总车费
	private float tatalAmount;
	
	//实际总车费
	private float actualAmount;
	
	//创建时间
	private Date gmtCreate;

	//创建人
	private String creator;
	
	private String carNo;
	
	
	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getOrderCustomerCount() {
		return orderCustomerCount;
	}

	public void setOrderCustomerCount(int orderCustomerCount) {
		this.orderCustomerCount = orderCustomerCount;
	}

	public int getActualCustomerCount() {
		return actualCustomerCount;
	}

	public void setActualCustomerCount(int actualCustomerCount) {
		this.actualCustomerCount = actualCustomerCount;
	}

	public float getTatalAmount() {
		return tatalAmount;
	}

	public void setTatalAmount(float tatalAmount) {
		this.tatalAmount = tatalAmount;
	}

	public float getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(float actualAmount) {
		this.actualAmount = actualAmount;
	}
	
}

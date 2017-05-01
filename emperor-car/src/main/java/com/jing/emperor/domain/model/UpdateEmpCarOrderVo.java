package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import com.jing.emperor.domain.car.convert.EmpCarOrderStatusEnum;

/**
 * 发车订单
 * @author liangjun
 *
 */
public class UpdateEmpCarOrderVo implements Serializable {

	private static final long serialVersionUID = 942609257870642829L;
	
	@NotEmpty(message="订单ID不能为空")
	private String orderId;
	
	//发车时间 
	private Date startTime;
	
	//结束时间
	private Date endTime;

	//预订人数
	private int orderCustomerCount;
	
	//实际乘车人数
	private int actualCustomerCount;
	
	//订单总车费
	private float totalAmount;
	
	//实际总车费
	private float actualAmount;
	
	//订单状态
	private EmpCarOrderStatusEnum status;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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


	public float getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(float actualAmount) {
		this.actualAmount = actualAmount;
	}

	public EmpCarOrderStatusEnum getStatus() {
		return status;
	}

	public void setStatus(EmpCarOrderStatusEnum status) {
		this.status = status;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	
}

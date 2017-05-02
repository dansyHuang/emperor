package com.jing.emperor.domain.model;

import java.util.List;

/**
 * 订单查询
 * @author liangjun
 *
 */
public class QueryEmpCarOrderDetailVo {

	private String orderId;
	
	private String customerId;
	
	private List<String> status;
	
	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}

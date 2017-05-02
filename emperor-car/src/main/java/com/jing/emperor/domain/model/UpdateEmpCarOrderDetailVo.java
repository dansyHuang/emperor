package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 发车订单详情
 * @author liangjun
 *
 */
public class UpdateEmpCarOrderDetailVo implements Serializable {

	private static final long serialVersionUID = 942609257870642829L;
	
	private String orderId;
	
	private String customerId;
	
	private String id;
	
	private String type;
	
	private String status;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	
}

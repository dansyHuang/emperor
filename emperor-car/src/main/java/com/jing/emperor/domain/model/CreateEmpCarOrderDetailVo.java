package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 发车订单详情
 * @author liangjun
 *
 */
public class CreateEmpCarOrderDetailVo implements Serializable {

	private static final long serialVersionUID = 942609257870642829L;
	
	@NotEmpty(message="订单ID不能为空")
	private String orderId;
	
	@NotEmpty(message="客户ID不能为空")
	private String customerId;
	
	@NotEmpty(message="类型不能为空")
	private String type;
	
	private float price;
	
	private String status;
	

	@NotEmpty(message="行程ID不能为空")
	private String  travelId;


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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTravelId() {
		return travelId;
	}


	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}
	
}

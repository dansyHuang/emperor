package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 车辆更新信息
 * @author liangjun
 *
 */
public class UpdateEmpCarVo implements Serializable {

	private static final long serialVersionUID = 586787384907327069L;
	
	/**
	 * 车辆品牌
	 */
	private String carBrand;
	
	/**
	 * 车辆保险信息
	 */
	private String carInsuranceInfo;
	
	/**
	 * 车辆购买日期 
	 */
	private Date carBuyerDate;
	
	@NotEmpty(message="ID不能为空")
	private String id;


	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public String getCarInsuranceInfo() {
		return carInsuranceInfo;
	}


	public void setCarInsuranceInfo(String carInsuranceInfo) {
		this.carInsuranceInfo = carInsuranceInfo;
	}


	public Date getCarBuyerDate() {
		return carBuyerDate;
	}


	public void setCarBuyerDate(Date carBuyerDate) {
		this.carBuyerDate = carBuyerDate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
}

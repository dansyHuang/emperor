package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 车辆信息创建vo
 * @author liangjun
 *
 */
public class CreateEmpCarVo implements Serializable{

	private static final long serialVersionUID = -5150296703946782302L;
	
	/**
	 * 车牌号
	 */
	@NotEmpty(message="车牌号不能为空")
	private String carNo;
	
	/**
	 * 车辆品牌
	 */
	@NotEmpty(message="车辆品牌不能为空")
	private String carBrand;
	
	/**
	 * 车辆保险信息
	 */
	@NotEmpty(message="车辆保险信息不能为空")
	private String carInsuranceInfo;
	
	/**
	 * 车辆购买日期
	 */
	@NotNull(message="车辆购买日期不能为空")
	private Date carBuyerDate;
	
	/**
	 * 车辆座位数
	 */
	@Min(4)
	private int carSeats;
	
	/**
	 * 车辆类型
	 */
	@NotEmpty(message="车辆类型不能为空")
	private String carType;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

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

	public int getCarSeats() {
		return carSeats;
	}

	public void setCarSeats(int carSeats) {
		this.carSeats = carSeats;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
}

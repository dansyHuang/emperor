package com.jing.emperor.domain.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 车辆信息vo
 * @author liangjun
 *
 */
public class EmpCarVo implements Serializable{

	private static final long serialVersionUID = -5150296703946782302L;
	
	/**
	 * 车牌号
	 */
	private String carNo;
	
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
	
	/**
	 * 车辆座位数
	 */
	private int carSeats;
	
	/**
	 * 车辆类型
	 */
	private String carType;
	
	private String creator;
	
	private Date gmtCreate;
	
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

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

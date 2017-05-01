package com.jing.emperor.domain.car.convert;

//订单状态
public enum EmpCarOrderStatusEnum {

	 WAIT_START("wait_start", "人数已满，待发车"), STARTING("starting", "发车中"), END("end_travel", "已结单");

	private String status;
	
	private String description;

	EmpCarOrderStatusEnum(String status, String description) {
		this.status=status;
		this.description=description;
	}
	
	
	
	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public static EmpCarOrderStatusEnum getInstance(String status){
		for(EmpCarOrderStatusEnum carOrderStatus:EmpCarOrderStatusEnum.values()){
			if(carOrderStatus.getStatus().equals(status)){
				return carOrderStatus;
			}
		}
		return null;
	}
}

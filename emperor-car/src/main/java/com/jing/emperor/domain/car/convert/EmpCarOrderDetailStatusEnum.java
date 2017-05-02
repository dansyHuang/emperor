package com.jing.emperor.domain.car.convert;

//订单状态
public enum EmpCarOrderDetailStatusEnum {

	 WAIT_START("wait_start", "待发车"), STARTING("starting", "发车中"), FINISH("finish", "已结单"),CANCEL("cancel", "已取消");

	private String status;
	
	private String description;

	EmpCarOrderDetailStatusEnum(String status, String description) {
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



	public static EmpCarOrderDetailStatusEnum getInstance(String status){
		for(EmpCarOrderDetailStatusEnum carOrderStatus:EmpCarOrderDetailStatusEnum.values()){
			if(carOrderStatus.getStatus().equals(status)){
				return carOrderStatus;
			}
		}
		return null;
	}
}

package com.jing.emperor.domain.car.convert;

//订单状态
public enum EmpCarOrderDetailTypeStatusEnum {

	 TRANSFER_INTO("transfer_into", "转入"), TRANSFER_OUT("transfer_out", "转出"), NO_TRANSFER("no_transfer", "客户创建");

	private String type;
	
	private String description;

	EmpCarOrderDetailTypeStatusEnum(String type, String description) {
		this.type=type;
		this.description=description;
	}
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public static EmpCarOrderDetailTypeStatusEnum getInstance(String status){
		for(EmpCarOrderDetailTypeStatusEnum carOrderStatus:EmpCarOrderDetailTypeStatusEnum.values()){
			if(carOrderStatus.getType().equals(status)){
				return carOrderStatus;
			}
		}
		return null;
	}
}

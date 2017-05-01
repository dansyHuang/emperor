package com.jing.emperor.domain.car.convert;

import com.jing.emperor.domain.model.CreateEmpCarVo;
import com.jing.emperor.domain.model.EmpCar;
import com.jing.emperor.domain.model.EmpCarVo;

/**
 * 车辆信息转换
 * @author liangjun
 *
 */
public class EmpCarConvert {

	public static EmpCar convertCreateVoToEntity(CreateEmpCarVo vo){
		if(null==vo) {
			return null;
		}
		EmpCar car=new EmpCar();
		car.setCarBrand(vo.getCarBrand());
		car.setCarBuyDate(vo.getCarBuyerDate());
		car.setCarInsuranceInfo(vo.getCarInsuranceInfo());
		car.setCarSeats(vo.getCarSeats());
		car.setCarNo(vo.getCarNo());
		car.setCarType(vo.getCarType());
		return car;
	}
	
	public static EmpCarVo convertEntityToVo(EmpCar car){
		if(null==car){
			return null;
		}
		EmpCarVo carVo=new EmpCarVo();
		carVo.setCarBrand(car.getCarBrand());
		carVo.setCarBuyerDate(car.getCarBuyDate());
		carVo.setCarInsuranceInfo(car.getCarInsuranceInfo());
		carVo.setCarNo(car.getCarNo());
		carVo.setCarSeats(car.getCarSeats());
		carVo.setCarType(car.getCarType());
		carVo.setCreator(car.getCreator());
		carVo.setGmtCreate(car.getGmtCreate());
		return carVo;
	}
	
	
}

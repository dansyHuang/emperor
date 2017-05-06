package com.jing.emperor.domain.car.convert;

import com.jing.emperor.domain.model.EmpCarSiteTravel;
import com.jing.emperor.domain.model.EmpCarSiteTravelVo;

/**
 * 行程价格VO转换
 * @author liangjun
 *
 */
public class EmpSiteTravelConvert {

	/**
	 * entity到vo转换
	 * @param entity
	 * @return
	 */
	public static EmpCarSiteTravelVo covertEntityToVo(EmpCarSiteTravel entity){
		if(null==entity){
			return null;
		}
		EmpCarSiteTravelVo result=new EmpCarSiteTravelVo();
		result.setEndId(entity.getEndPoint());
		result.setOrgId(entity.getOrgId());
		result.setPrice(entity.getPrice());
		result.setStartId(entity.getStartPoint());
		return result;
	}
	
	/**
	 * entity到vo转换
	 * @param vo
	 * @return
	 */
	public static EmpCarSiteTravel covertVoToEntity(EmpCarSiteTravelVo vo){
		if(null==vo){
			return null;
		}
		EmpCarSiteTravel result=new EmpCarSiteTravel();
		result.setEndPoint(vo.getEndId());
		result.setOrgId(vo.getOrgId());
		result.setPrice(vo.getPrice());
		result.setStartPoint(vo.getStartId());
		return result;
	}
}

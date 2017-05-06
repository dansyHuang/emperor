package com.jing.emperor.domain.car.service;

import java.util.List;

import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.model.EmpCarSiteVo;

/**
 * @author liangjun
 * 车站管理
 */
public interface EmpCarSiteDomainServiceInterface {

	/**
	 * 车站查询
	 * @param orgId
	 * @return
	 * @throws EmporerCarException
	 */
	public List<EmpCarSiteVo>  queryByStartAndEnd(String orgId)throws EmporerCarException;
	
	
	/**
	 * 车站创建
	 * @param createVo
	 * @return
	 * @throws EmporerCarException
	 */
	public String createTravel(EmpCarSiteVo createVo,Pvg pvg)throws EmporerCarException;
	
	
	
}

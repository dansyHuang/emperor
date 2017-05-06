package com.jing.emperor.domain.car.service;

import java.util.List;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.model.EmpCarSiteTravelVo;
import com.jing.emperor.domain.model.QueryTraveVo;

/**
 * @author liangjun
 * 起始点与终点管理
 */
public interface EmpCarSiteTravelDomainServiceInterface {

	/**
	 * 根据起始点我终点查询价格
	 * @param startId
	 * @param endId
	 * @return
	 */
	public List<EmpCarSiteTravelVo>  queryByStartAndEnd(String orgId,String startId,String endId)throws EmporerCarException;
	
	/**
	 * 根据起始点我终点查询价格
	 * @param startId
	 * @param endId
	 * @return
	 */
	public PageResultModel<List<EmpCarSiteTravelVo>>  queryByQueryVo(QueryTraveVo queryVo ,int pageStart,int pageSize)throws EmporerCarException;
	
	/**
	 * 创建信息
	 * @param createVo
	 * @return
	 */
	public String createTravel(EmpCarSiteTravelVo createVo,Pvg pvg)throws EmporerCarException;
	
	
	
}

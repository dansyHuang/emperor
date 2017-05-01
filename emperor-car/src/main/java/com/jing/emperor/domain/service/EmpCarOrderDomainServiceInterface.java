package com.jing.emperor.domain.service;

import java.util.List;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.model.CreateEmpCarOrderVo;
import com.jing.emperor.domain.model.EmpCarOrderVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderVo;

/**
 * 发车订单信息
 * @author liangjun
 */
public interface EmpCarOrderDomainServiceInterface {

	/**
	 * 创建车辆信息
	 * @param car
	 * @return
	 * @throws EmporerCarException
	 */
	public String saveEmpCarOrder(CreateEmpCarOrderVo createEmpCarOrderVo) throws EmporerCarException;
	
	
	/**
	 * 根据ID查询车辆信息
	 * @param id
	 * @return
	 * @throws EmporerCarException
	 */
	public EmpCarOrderVo selectCarOrderById(String id) throws EmporerCarException;
	
	
	/**
	 * 根据queryVo查询，分页
	 * @param queryVo
	 * @return
	 * @throws EmporerCarException
	 */
	public PageResultModel<List<EmpCarOrderVo>> selectCarOrderByQueryVo(QueryEmpCarOrderVo queryVo) throws EmporerCarException;
	
	
	
	/**
	 * 更新订单信息
	 * @param updateVo
	 * @return
	 * @throws EmporerCarException
	 */
	public String updateCarOrder(UpdateEmpCarOrderVo updateVo) throws EmporerCarException;
	
	
	
	
	
}

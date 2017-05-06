package com.jing.emperor.domain.car.service;

import java.util.List;

import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.model.CreateEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.EmpCarOrderDetailVo;
import com.jing.emperor.domain.model.QueryEmpCarOrderDetailVo;
import com.jing.emperor.domain.model.UpdateEmpCarOrderDetailVo;

/**
 * 发车订单信息
 * @author liangjun
 */
public interface EmpCarOrderDetailDomainServiceInterface {

	/**
	 * 创建车辆信息
	 * @param car
	 * @return
	 * @throws EmporerCarException
	 */
	public String saveEmpCarOrderDetail(CreateEmpCarOrderDetailVo createEmpCarOrderDetailVo,Pvg pvg) throws EmporerCarException;
	
	
	/**
	 * 根据ID查询车辆信息
	 * @param id
	 * @return
	 * @throws EmporerCarException
	 */
	public EmpCarOrderDetailVo selectCarOrderDetailById(String id) throws EmporerCarException;
	
	
	/**
	 * 根据queryVo查询，分页
	 * @param queryVo
	 * @return
	 * @throws EmporerCarException
	 */
	public List<EmpCarOrderDetailVo> selectCarOrderDetailByQueryVo(QueryEmpCarOrderDetailVo queryVo) throws EmporerCarException;
	
	
	
	/**
	 * 更新订单信息
	 * @param updateVo
	 * @return
	 * @throws EmporerCarException
	 */
	public String updateCarOrderDetail(UpdateEmpCarOrderDetailVo updateVo) throws EmporerCarException;
	
	
	
	
	
}

package com.jing.emperor.domain.car.service;

import java.util.List;

import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.domain.model.CreateEmpCarVo;
import com.jing.emperor.domain.model.EmpCarVo;
import com.jing.emperor.domain.model.QueryEmpCarVo;
import com.jing.emperor.domain.model.UpdateEmpCarVo;

/**
 * 车辆信息
 * @author liangjun
 *
 */
public interface EmpCarDomainServiceInterface {

	/**
	 * 创建车辆信息
	 * @param car
	 * @return
	 * @throws EmporerCarException
	 */
	public String saveEmpCar(CreateEmpCarVo createEmpCarVo,Pvg pvg) throws EmporerCarException;
	
	
	/**
	 * 根据ID查询车辆信息
	 * @param id
	 * @return
	 * @throws EmporerCarException
	 */
	public EmpCarVo selectCarById(String id) throws EmporerCarException;
	
	
	/**
	 * 根据queryVo查询，分页
	 * @param queryVo
	 * @return
	 * @throws EmporerCarException
	 */
	public PageResultModel<List<EmpCarVo>> selectCarByQueryVo(QueryEmpCarVo queryVo) throws EmporerCarException;
	
	
	
	/**
	 * 更新车辆基本信息
	 * @param updateVo
	 * @return
	 * @throws EmporerCarException
	 */
	public String updateCar(UpdateEmpCarVo updateVo) throws EmporerCarException;
	
	
	/**
	 * 删除车辆信息
	 * @param id
	 * @return
	 * @throws EmporerCarException
	 */
	public boolean deleteById(String id) throws EmporerCarException;
	
	
	
	/**
	 * 根据车牌号查找对应的人员ID
	 * @param carNo
	 * @return
	 * @throws EmporerCarException
	 */
	public List<String> selectUserByCarNo(String carNo) throws EmporerCarException;
	
	
	/**
	 * 根据车牌号查找车辆
	 * @param carNo
	 * @return
	 * @throws EmporerCarException
	 */
	public EmpCarVo selectEmpCarByCarNo(String carNo) throws EmporerCarException;
	
	
}

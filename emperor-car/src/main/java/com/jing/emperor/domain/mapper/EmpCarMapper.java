package com.jing.emperor.domain.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.jing.emperor.domain.model.EmpCar;
import com.jing.emperor.domain.model.EmpCarExample;

public interface EmpCarMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	long countByExample(EmpCarExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int insert(EmpCar record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int insertSelective(EmpCar record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	List<EmpCar> selectByExample(EmpCarExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	EmpCar selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int updateByExampleSelective(@Param("record") EmpCar record, @Param("example") EmpCarExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int updateByExample(@Param("record") EmpCar record, @Param("example") EmpCarExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int updateByPrimaryKeySelective(EmpCar record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_car
	 * @mbg.generated  Mon May 01 17:09:28 CST 2017
	 */
	int updateByPrimaryKey(EmpCar record);
}
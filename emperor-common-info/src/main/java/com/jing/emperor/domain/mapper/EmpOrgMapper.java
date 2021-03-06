package com.jing.emperor.domain.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.jing.emperor.domain.model.EmpOrg;
import com.jing.emperor.domain.model.EmpOrgExample;

public interface EmpOrgMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	long countByExample(EmpOrgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int insert(EmpOrg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int insertSelective(EmpOrg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	List<EmpOrg> selectByExample(EmpOrgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	EmpOrg selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int updateByExampleSelective(@Param("record") EmpOrg record, @Param("example") EmpOrgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int updateByExample(@Param("record") EmpOrg record, @Param("example") EmpOrgExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int updateByPrimaryKeySelective(EmpOrg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_org
	 * @mbg.generated  Mon May 01 17:10:37 CST 2017
	 */
	int updateByPrimaryKey(EmpOrg record);
}
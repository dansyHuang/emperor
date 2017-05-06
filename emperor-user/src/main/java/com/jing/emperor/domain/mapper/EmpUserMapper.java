package com.jing.emperor.domain.mapper;

import com.jing.emperor.domain.model.EmpUser;
import com.jing.emperor.domain.model.EmpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	long countByExample(EmpUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int insert(EmpUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int insertSelective(EmpUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	List<EmpUser> selectByExample(EmpUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	EmpUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int updateByExampleSelective(@Param("record") EmpUser record, @Param("example") EmpUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int updateByExample(@Param("record") EmpUser record, @Param("example") EmpUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int updateByPrimaryKeySelective(EmpUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp_user
	 * @mbg.generated  Sat May 06 16:11:40 CST 2017
	 */
	int updateByPrimaryKey(EmpUser record);
}
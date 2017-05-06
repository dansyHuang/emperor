package com.jing.emperor.domain.mapper;

import com.jing.emperor.domain.model.EmpCarSite;
import com.jing.emperor.domain.model.EmpCarSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpCarSiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    long countByExample(EmpCarSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int insert(EmpCarSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int insertSelective(EmpCarSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    List<EmpCarSite> selectByExample(EmpCarSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    EmpCarSite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") EmpCarSite record, @Param("example") EmpCarSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int updateByExample(@Param("record") EmpCarSite record, @Param("example") EmpCarSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int updateByPrimaryKeySelective(EmpCarSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_car_site
     *
     * @mbg.generated Sat May 06 14:57:05 CST 2017
     */
    int updateByPrimaryKey(EmpCarSite record);
}
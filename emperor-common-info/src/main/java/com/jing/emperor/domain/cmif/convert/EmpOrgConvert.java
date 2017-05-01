package com.jing.emperor.domain.cmif.convert;

import java.util.Date;

import com.jing.emperor.common.DbConstants;
import com.jing.emperor.domain.model.EmpCreateOrgVo;
import com.jing.emperor.domain.model.EmpOrg;
import com.jing.emperor.domain.model.EmpOrgVo;
import com.jing.emperor.domain.model.EmpUpdateOrgVo;

/**
 * 区域组织信息转换
 * @author liangjun
 *
 */
public class EmpOrgConvert {

	/**
	 * @param empOrg
	 * @return
	 */
	public static EmpOrgVo convertEntityToVo(EmpOrg empOrg){
		if(null==empOrg){
			return null;
		}
		EmpOrgVo vo=new EmpOrgVo();
		vo.setId(String.valueOf(empOrg.getId()));
		vo.setCreator(empOrg.getCreator());
		vo.setGmtCreate(empOrg.getGmtCreate());
		vo.setName(empOrg.getName());
		vo.setParentId(String.valueOf(empOrg.getParentId()));
		vo.setRemark(empOrg.getRemark());
		return vo;
	}
	public static EmpOrg covnertCreateToEntity(EmpCreateOrgVo createVo){
		if(null==createVo){
			return null;
		}
		Date currentDate=new Date();
		EmpOrg empOrg=new EmpOrg();
		empOrg.setName(createVo.getName());
		empOrg.setParentId(createVo.getParentId());
		empOrg.setIsDeleted(DbConstants.NO);
		empOrg.setRemark(createVo.getRemark());
		empOrg.setGmtCreate(currentDate);
		empOrg.setGmtModified(currentDate);
		return empOrg;
	}
	
	public static EmpOrg covnertModifyToEntity(EmpUpdateOrgVo updateVo ,EmpOrg empOrg){
		if(null==updateVo){
			return null;
		}
		Date currentDate=new Date();
		empOrg.setName(updateVo.getName());
		empOrg.setParentId(updateVo.getParentId());
		empOrg.setRemark(updateVo.getRemark());
		empOrg.setGmtModified(currentDate);
		return empOrg;
	}
	
}

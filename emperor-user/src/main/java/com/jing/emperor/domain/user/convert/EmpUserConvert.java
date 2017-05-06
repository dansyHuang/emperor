package com.jing.emperor.domain.user.convert;

import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.DbConstants;
import com.jing.emperor.domain.model.CreateEmpUserVo;
import com.jing.emperor.domain.model.EmpUser;
import com.jing.emperor.domain.model.EmpUserVo;
import com.jing.emperor.domain.model.UpdateEmpUserVo;

/**
 * 用户模型转换
 * @author liangjun
 *
 */
public class EmpUserConvert {

	public static EmpUser covertCreateVoToEntity(CreateEmpUserVo createVo){
		if(null==createVo){
			return null;
		}
		EmpUser userEntity=new EmpUser();
		userEntity.setBirthDay(createVo.getBirthDay());
		userEntity.setIdCard(createVo.getIdCard());
		userEntity.setLoginId(createVo.getLoginId());
		userEntity.setMobileNum(createVo.getMobileNum());
		userEntity.setPhotoUrl(createVo.getPhotoUrl());
		userEntity.setPassword(createVo.getPassword());
		userEntity.setIsDeleted(DbConstants.NO);
		userEntity.setSex(createVo.getSex());
		userEntity.setOrgId(createVo.getOrgId());
		userEntity.setUserName(createVo.getUserName());
		return userEntity;
	}
	public static EmpUser covertUpdateVoToEntity(UpdateEmpUserVo updateVo,EmpUser userEntity){
		if(null!=updateVo.getBirthDay()){
			userEntity.setBirthDay(updateVo.getBirthDay());
		}
		if(StringUtil.isNotEmpty(updateVo.getIdCard())){
			userEntity.setIdCard(updateVo.getIdCard());
		}
		if(StringUtil.isNotEmpty(updateVo.getLoginId())){
			userEntity.setLoginId(updateVo.getLoginId());
		}
		if(StringUtil.isNotEmpty(updateVo.getMobileNum())){
			userEntity.setMobileNum(updateVo.getMobileNum());
		}
		if(StringUtil.isNotEmpty(updateVo.getPhotoUrl())){
			userEntity.setPhotoUrl(updateVo.getPhotoUrl());
		}
		if(StringUtil.isNotEmpty(updateVo.getPassword())){
			userEntity.setPassword(updateVo.getPassword());
		}
		if(StringUtil.isNotEmpty(updateVo.getSex())){
			userEntity.setSex(updateVo.getSex());
		}
		if(StringUtil.isNotEmpty(updateVo.getOrgId())){
			userEntity.setOrgId(updateVo.getOrgId());
		}
		if(StringUtil.isNotEmpty(updateVo.getUserName())){
			userEntity.setUserName(updateVo.getUserName());
		}
		return userEntity;
	}
	
	public static EmpUserVo convertEntityToVo(EmpUser entity){
		if(null==entity){
			return null;
		}
		EmpUserVo result=new EmpUserVo();
		result.setBirthDay(entity.getBirthDay());
		result.setCreator(entity.getCreator());
		result.setId(String.valueOf(entity.getId()));
		result.setGmtCreate(entity.getGmtCreate());
		result.setLoginId(entity.getLoginId());
		result.setMobileNum(entity.getMobileNum());
		result.setPassword(entity.getPassword());
		result.setPhotoUrl(entity.getPhotoUrl());
		result.setSex(entity.getSex());
		result.setUserName(entity.getUserName());
		result.setOrgId(entity.getOrgId());
		return result;
	}
}

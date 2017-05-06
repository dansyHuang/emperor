package com.jing.emperor.domain.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerUserException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.mapper.EmpUserMapper;
import com.jing.emperor.domain.model.CreateEmpUserVo;
import com.jing.emperor.domain.model.EmpUser;
import com.jing.emperor.domain.model.EmpUserExample;
import com.jing.emperor.domain.model.EmpUserExample.Criteria;
import com.jing.emperor.domain.model.EmpUserVo;
import com.jing.emperor.domain.model.QueryUserVo;
import com.jing.emperor.domain.model.UpdateEmpUserVo;
import com.jing.emperor.domain.user.convert.EmpUserConvert;
import com.jing.emperor.domain.user.service.EmpUserDomainServiceInterface;

@Component
public class EmpUserDomainServiceImpl implements EmpUserDomainServiceInterface {

	@Resource
	private EmpUserMapper empUserMapper;
	
	@Override
	public String createEmpUser(CreateEmpUserVo createVo,Pvg pvg) throws EmporerUserException {
		EmpUser user=EmpUserConvert.covertCreateVoToEntity(createVo);
		if(null==user){
			return null;
		}
		Date currentDate=new Date();
		user.setGmtCreate(currentDate);
		user.setGmtModified(currentDate);
		user.setCreator(pvg.getLoginId());
		user.setModifier(pvg.getLoginId());
		empUserMapper.insert(user);
		return String.valueOf(user.getId());
	}
	
	@Override
	public String updateEmpUser(UpdateEmpUserVo updateVo,Pvg pvg) throws EmporerUserException {
		if(StringUtil.isEmpty(updateVo.getId())){
			throw new EmporerUserException("用户ID不能为空");
		}
		EmpUser user=this.empUserMapper.selectByPrimaryKey(Integer.parseInt(updateVo.getId()));
		if(null==user){
			throw new EmporerUserException("未找到需要更新的用户");
		}
		EmpUserConvert.covertUpdateVoToEntity(updateVo, user);
		Date currentDate=new Date();
		user.setGmtModified(currentDate);
		user.setModifier(pvg.getLoginId());
		empUserMapper.updateByPrimaryKey(user);
		return String.valueOf(user.getId());
	}


	@Override
	public EmpUserVo queryUserByPhoneNum(String phoneNum) throws EmporerUserException {
		EmpUserExample query=new EmpUserExample();
		query.createCriteria().andMobileNumEqualTo(phoneNum);
		List<EmpUser> userList=this.empUserMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(userList)){
			EmpUser user=userList.get(0);
			return EmpUserConvert.convertEntityToVo(user);
		}
		
		return null;
	}
	
	@Override
	public EmpUserVo queryUserById(String id) throws EmporerUserException {
		EmpUser empUser=this.empUserMapper.selectByPrimaryKey(Integer.parseInt(id));
        return EmpUserConvert.convertEntityToVo(empUser);
	}

	@Override
	public List<EmpUserVo> queryByQueryVo(QueryUserVo queryVo) throws EmporerUserException {
		if(null==queryVo||StringUtil.isEmpty(queryVo.getOrgId())){
			throw new EmporerUserException("查询参数不能为null，且组织ID不能为空");
		}
		EmpUserExample query=new EmpUserExample();
		Criteria criteria=query.createCriteria();
		criteria.andOrgIdEqualTo(queryVo.getOrgId());
		if(StringUtil.isNotEmpty(queryVo.getPhoneNum())){
			criteria.andMobileNumEqualTo(queryVo.getPhoneNum());
		}
		if(StringUtil.isNotEmpty(queryVo.getIdCard())){
			criteria.andMobileNumEqualTo(queryVo.getIdCard());
		}
		if(StringUtil.isNotEmpty(queryVo.getLoginId())){
			criteria.andMobileNumEqualTo(queryVo.getLoginId());
		}
		if(StringUtil.isNotEmpty(queryVo.getUserName())){
			criteria.andMobileNumEqualTo(queryVo.getUserName());
		}
		List<EmpUser> userList=this.empUserMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(userList)){
			List<EmpUserVo> list=new ArrayList<EmpUserVo>();
			userList.forEach(user->list.add(EmpUserConvert.convertEntityToVo(user)));
			return list;
		}
		
		return null;
	}

	@Override
	public PageResultModel<List<EmpUserVo>> queryPageByQueryVo(QueryUserVo queryVo) throws EmporerUserException {
		if(null==queryVo||StringUtil.isEmpty(queryVo.getOrgId())){
			throw new EmporerUserException("查询参数不能为null，且组织ID不能为空");
		}
		EmpUserExample query=new EmpUserExample();
		PageResultModel<List<EmpUserVo>> pageResult=new PageResultModel<List<EmpUserVo>>();
		Criteria criteria=query.createCriteria();
		criteria.andOrgIdEqualTo(queryVo.getOrgId());
		if(StringUtil.isNotEmpty(queryVo.getPhoneNum())){
			criteria.andMobileNumEqualTo(queryVo.getPhoneNum());
		}
		if(StringUtil.isNotEmpty(queryVo.getIdCard())){
			criteria.andMobileNumEqualTo(queryVo.getIdCard());
		}
		if(StringUtil.isNotEmpty(queryVo.getLoginId())){
			criteria.andMobileNumEqualTo(queryVo.getLoginId());
		}
		if(StringUtil.isNotEmpty(queryVo.getUserName())){
			criteria.andMobileNumEqualTo(queryVo.getUserName());
		}
		PageHelper.startPage((queryVo.getPageStart()-1)*queryVo.getPageSize(), queryVo.getPageSize());
		List<EmpUser> userList=this.empUserMapper.selectByExample(query);
		PageInfo<EmpUser> page=new PageInfo<>(userList);
		if(ListUtil.isNotEmpty(userList)){
			List<EmpUserVo> list=new ArrayList<EmpUserVo>();
			userList.forEach(user->list.add(EmpUserConvert.convertEntityToVo(user)));
			pageResult.setValue(list);
			pageResult.setTotalSize(page.getTotal());
		}
		return pageResult;
	}

}

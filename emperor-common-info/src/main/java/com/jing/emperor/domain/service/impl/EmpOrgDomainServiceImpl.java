package com.jing.emperor.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jing.emperor.common.DbConstants;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerOrgException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.cmif.convert.EmpOrgConvert;
import com.jing.emperor.domain.mapper.EmpOrgMapper;
import com.jing.emperor.domain.model.EmpCreateOrgVo;
import com.jing.emperor.domain.model.EmpOrg;
import com.jing.emperor.domain.model.EmpOrgExample;
import com.jing.emperor.domain.model.EmpOrgVo;
import com.jing.emperor.domain.model.EmpUpdateOrgVo;
import com.jing.emperor.domain.service.EmpOrgDomainServiceInterface;

@Component
public class EmpOrgDomainServiceImpl implements EmpOrgDomainServiceInterface {

	@Resource
	private EmpOrgMapper empOrgMapper;
	
	@Override
	public int saveEmpOrg(EmpCreateOrgVo createVo,Pvg pvg) throws EmporerOrgException {
		EmpOrg record=EmpOrgConvert.covnertCreateToEntity(createVo);
		record.setCreator(pvg.getLoginId());
		record.setModifier(pvg.getLoginId());
		int id=empOrgMapper.insert(record);
		if(id==0){
			throw new EmporerOrgException("创建区域组织信息失败！");
		}
		return record.getId();
	}

	@Override
	public EmpOrgVo selectById(String id) throws EmporerOrgException {
		EmpOrg empOrg=empOrgMapper.selectByPrimaryKey(Integer.parseInt(id));
		EmpOrgVo result=EmpOrgConvert.convertEntityToVo(empOrg);
		return result;
	}

	@Override
	public PageResultModel<List<EmpOrgVo>> selectPageByPid(String parentId,int pageNumber,int pageSize) throws EmporerOrgException {
		EmpOrgExample query=new EmpOrgExample();
		query.createCriteria().andParentIdEqualTo(parentId);
		PageHelper.startPage((pageNumber-1)*pageSize, pageSize);
		List<EmpOrg> orgs=empOrgMapper.selectByExample(query);
		PageInfo<EmpOrg> page = new PageInfo<>(orgs);
		PageResultModel<List<EmpOrgVo>> pageResult=new PageResultModel<>();
		pageResult.setTotalSize(page.getTotal());
		List<EmpOrgVo> result=new ArrayList<>();
		if(ListUtil.isNotEmpty(orgs)){
			orgs.forEach(empOrg->{
				result.add(EmpOrgConvert.convertEntityToVo(empOrg));
			});
		}
		pageResult.setValue(result);
		return pageResult;
	}

	@Override
	public boolean deleteById(String id) throws EmporerOrgException {
		EmpOrg empOrg=empOrgMapper.selectByPrimaryKey(Integer.parseInt(id));
		if(null!=empOrg){
			empOrg.setIsDeleted(DbConstants.YES);
			empOrgMapper.updateByPrimaryKey(empOrg);
			return true;
		}
		return false;
	}

	@Override
	public String updateEmpOrg(EmpUpdateOrgVo org) throws EmporerOrgException {
		EmpOrg empOrg=empOrgMapper.selectByPrimaryKey(Integer.parseInt(org.getId()));
		if(null!=empOrg){
			empOrg.setName(org.getName());
			empOrg.setRemark(org.getRemark());
			empOrg.setParentId(org.getParentId());
			empOrgMapper.updateByPrimaryKey(empOrg);
			return String.valueOf(empOrg.getId());
		}
		return null;
	}

	@Override
	public List<EmpOrgVo> selectByPid(String parentId) throws EmporerOrgException {
		EmpOrgExample query=new EmpOrgExample();
		query.createCriteria().andParentIdEqualTo(parentId);
		List<EmpOrg> orgs=empOrgMapper.selectByExample(query);
		List<EmpOrgVo> result=new ArrayList<>();
		if(ListUtil.isNotEmpty(orgs)){
			orgs.forEach(empOrg->{
				result.add(EmpOrgConvert.convertEntityToVo(empOrg));
			});
		}
		return result;
	}
	
	

}

package com.jing.emperor.domain.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jing.emperor.common.DbConstants;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.service.EmpCarSiteDomainServiceInterface;
import com.jing.emperor.domain.mapper.EmpCarSiteMapper;
import com.jing.emperor.domain.model.EmpCarSite;
import com.jing.emperor.domain.model.EmpCarSiteExample;
import com.jing.emperor.domain.model.EmpCarSiteVo;

/**
 * @author liangjun
 */
@Component
public class EmpCarSiteDomainServiceImpl implements EmpCarSiteDomainServiceInterface {

	@Resource
	private EmpCarSiteMapper empCarSiteMapper;
	
	@Override
	public List<EmpCarSiteVo> queryByStartAndEnd(String orgId) throws EmporerCarException {
		EmpCarSiteExample query =new EmpCarSiteExample();
		query.createCriteria().andOrgIdEqualTo(orgId);
		List<EmpCarSite> entityList=empCarSiteMapper.selectByExample(query);
		if(ListUtil.isNotEmpty(entityList)){
			List<EmpCarSiteVo> list=new ArrayList<EmpCarSiteVo>();
			entityList.forEach(entity->{
				EmpCarSiteVo siteVo=new EmpCarSiteVo();
				siteVo.setName(entity.getName());
				siteVo.setOrgId(entity.getOrgId());
				siteVo.setId(String.valueOf(entity.getId()));
				list.add(siteVo);
			});
			return list;
		}
		
		return null;
	}

	@Override
	public String createTravel(EmpCarSiteVo createVo,Pvg pvg) throws EmporerCarException {
		EmpCarSite entity=new EmpCarSite();
		Date currentDate=new Date();
		entity.setCreator(pvg.getLoginId());
		entity.setModifier(pvg.getLoginId());
		entity.setGmtCreate(currentDate);
		entity.setGmtModified(currentDate);
		entity.setIsDeleted(DbConstants.NO);
		entity.setName(createVo.getName());
		entity.setOrgId(createVo.getOrgId());
		this.empCarSiteMapper.insert(entity);
		return String.valueOf(entity.getId());
	}

	
}

package com.jing.emperor.domain.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jing.emperor.common.DbConstants;
import com.jing.emperor.common.PageResultModel;
import com.jing.emperor.common.Pvg;
import com.jing.emperor.common.exception.EmporerCarException;
import com.jing.emperor.common.util.ListUtil;
import com.jing.emperor.domain.car.convert.EmpSiteTravelConvert;
import com.jing.emperor.domain.car.service.EmpCarSiteTravelDomainServiceInterface;
import com.jing.emperor.domain.mapper.EmpCarSiteTravelMapper;
import com.jing.emperor.domain.model.EmpCarSiteTravel;
import com.jing.emperor.domain.model.EmpCarSiteTravelExample;
import com.jing.emperor.domain.model.EmpCarSiteTravelExample.Criteria;
import com.jing.emperor.domain.model.EmpCarSiteTravelVo;
import com.jing.emperor.domain.model.QueryTraveVo;
/**
 * @author liangjun
 */
@Component
public class EmpCarSiteTravelDomainServiceImpl implements EmpCarSiteTravelDomainServiceInterface{

	@Resource
	private EmpCarSiteTravelMapper empCarSiteTravelExample;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<EmpCarSiteTravelVo> queryByStartAndEnd(String orgId,String startId, String endId)throws EmporerCarException {
		if(StringUtils.isEmpty(orgId)){
			throw new EmporerCarException("区域ID不能为空");
		}
		List<EmpCarSiteTravelVo> result=new ArrayList<EmpCarSiteTravelVo>();
		EmpCarSiteTravelExample query=new EmpCarSiteTravelExample();
		Criteria criteria=query.createCriteria();
		criteria.andOrgIdEqualTo(orgId);
		if(StringUtil.isNotEmpty(startId)){
			criteria.andStartPointEqualTo(startId);
		}
		if(StringUtil.isNotEmpty(endId)){
			criteria.andEndPointEqualTo(endId);
		}
		List<EmpCarSiteTravel> travelList=empCarSiteTravelExample.selectByExample(query);
		if(ListUtil.isNotEmpty(travelList)){
			travelList.forEach(empCarSiteTravel->result.add(EmpSiteTravelConvert.covertEntityToVo(empCarSiteTravel)));
		}
		return result;
	}

	@Override
	public PageResultModel<List<EmpCarSiteTravelVo>> queryByQueryVo(QueryTraveVo queryVo,int pageStart,int pageSize)throws EmporerCarException {
		if(null==queryVo||StringUtils.isEmpty(queryVo.getOrgId())){
			throw new EmporerCarException("区域ID不能为空");
		}
		PageResultModel<List<EmpCarSiteTravelVo>> pageResult=new PageResultModel<List<EmpCarSiteTravelVo>>();
		try{
			List<EmpCarSiteTravelVo> list=new ArrayList<>();
			EmpCarSiteTravelExample query=new EmpCarSiteTravelExample();
			Criteria criteria=query.createCriteria();
			criteria.andOrgIdEqualTo(queryVo.getOrgId());
			if(StringUtil.isNotEmpty(queryVo.getStartId())){
				criteria.andStartPointEqualTo(queryVo.getStartId());
			}
			if(StringUtil.isNotEmpty(queryVo.getEndId())){
				criteria.andEndPointEqualTo(queryVo.getEndId());
			}
			PageHelper.startPage((pageStart-1)*pageSize, pageSize);
			List<EmpCarSiteTravel> travelList=empCarSiteTravelExample.selectByExample(query);
			PageInfo<EmpCarSiteTravel> pageInfo=new PageInfo<>(travelList);
			if(ListUtil.isNotEmpty(travelList)){
				travelList.forEach(empCarSiteTravel->list.add(EmpSiteTravelConvert.covertEntityToVo(empCarSiteTravel)));
			}
			pageResult.setTotalSize(pageInfo.getTotal());
			pageResult.setValue(list);
		}catch(Exception e){
			logger.error("EmpCarSiteTravelDomainServiceImpl queryByQueryVo error",e);
			pageResult.setErrorMsg(e.getMessage());
			pageResult.setSuccces(false);
		}
		return pageResult;
	}
	
	
	@Override
	public String createTravel(EmpCarSiteTravelVo createVo,Pvg pvg) throws EmporerCarException{
		EmpCarSiteTravel entity=EmpSiteTravelConvert.covertVoToEntity(createVo);
		int id=0;
		if(null!=entity){
			Date currentDate=new Date();
			entity.setGmtCreate(currentDate);
			entity.setGmtModified(currentDate);
			entity.setCreator(pvg.getLoginId());
			entity.setModifier(pvg.getLoginId());
			entity.setIsDeleted(DbConstants.NO);
			empCarSiteTravelExample.insert(entity);
			id=entity.getId();
		}
		return String.valueOf(id);
	}

}

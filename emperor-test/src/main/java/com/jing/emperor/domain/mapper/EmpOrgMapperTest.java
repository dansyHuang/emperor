package com.jing.emperor.domain.mapper;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jing.emperor.domain.mapper.EmpOrgMapper;
import com.jing.emperor.domain.model.EmpOrg;
import com.jing.emperor.test.domain.EmperorApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=EmperorApplication.class)
public class EmpOrgMapperTest {


	@Resource
	private EmpOrgMapper empOrgMapper;
	
	@Before
	public void setup() {
		
		
	}

	@Test
	public void test() {
		EmpOrg record=new EmpOrg();
		record.setCreator("liangjun.huanglj");
		record.setGmtCreate(new Date());
		record.setGmtModified(new Date());
		record.setModifier("liangjun.huanglj");
		record.setIsDeleted("n");
		record.setName("徐桥镇");
		record.setParentId("0");
		int id=empOrgMapper.insert(record);
		System.out.println("emporg id is "+record.getId());
	}
}

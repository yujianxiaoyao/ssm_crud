package cn.itcast.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import cn.itcast.crud.dao.departmentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JUnit_Test {
	@Autowired
	private departmentMapper departmentmapper;
	@Test
	public void test1() {
		//departmentmapper.insertSelective(new department(null, "研发部"));
		System.out.println(departmentmapper);
	}
}

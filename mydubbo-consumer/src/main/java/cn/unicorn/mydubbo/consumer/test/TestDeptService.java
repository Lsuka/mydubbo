package cn.unicorn.mydubbo.consumer.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.unicorn.mydubbo.service.IDeptService;
import cn.unicorn.mydubbo.vo.Dept;
import junit.framework.TestCase;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDeptService {
	@Resource
	private IDeptService deptService;

	@Test
	public void testGet() {
		Dept dept = this.deptService.get(233L);
		TestCase.assertNotNull(dept);
		System.err.println("【部门测试】" + dept);
	}

	@Test
	public void testList() {
		List<Dept> all = this.deptService.list();
		TestCase.assertTrue(all.size() > 0);
		System.err.println("【测试部门查询】" + all);
	}

	@Test
	public void testAdd() {
		Dept dept = new Dept();
		dept.setDeptno(666L);
		dept.setDname("哲学部");
		dept.setLoc("圣地亚哥");
		boolean flag = this.deptService.add(dept);
		TestCase.assertTrue(flag);
		System.err.println("【测试部门增加】" + flag);
	}
}

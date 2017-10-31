package cn.unicorn.mydubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.unicorn.mydubbo.service.IDeptService;
import cn.unicorn.mydubbo.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {

	@Override
	public boolean add(Dept dept) {
		System.err.println("【DeptService】部门增加" + dept);
		return true;
	}

	@Override
	public Dept get(long deptno) {
		Dept dept = new Dept();
		dept.setDeptno(deptno);
		dept.setDname("哲学 - " + deptno);
		dept.setLoc("比利 - " + deptno);
		return dept;
	}

	@Override
	public List<Dept> list() {
		List<Dept> allDepts = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dept dept = new Dept();
			dept.setDeptno((long) i);
			dept.setDname("哲学部门 - " + i);
			dept.setLoc("美国圣地亚哥 - " + i);
			allDepts.add(dept);
		}
		return allDepts;
	}

}

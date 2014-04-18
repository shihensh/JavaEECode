package cn.ty.service;

import java.util.List;

import cn.ty.domain.Dept;

public interface DeptService {

	List<Dept> listDept();
	void addDept(Dept dept);
}

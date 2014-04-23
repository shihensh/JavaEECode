package cn.ty.service.impl;

import java.util.List;

import cn.ty.dao.DeptDao;
import cn.ty.domain.Dept;
import cn.ty.service.DeptService;

public class DeptServiceImpl implements DeptService {

	private DeptDao deptDao;
	
	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public List<Dept> listDept() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

	@Override
	public void addDept(Dept dept) {
		// TODO Auto-generated method stub

	}

}

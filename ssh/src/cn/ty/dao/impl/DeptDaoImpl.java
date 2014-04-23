package cn.ty.dao.impl;


import java.util.List;

import cn.ty.dao.DeptDao;
import cn.ty.domain.Dept;

public class DeptDaoImpl extends BaseDaoImpl implements DeptDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return (List<Dept>) this.getSession().load(Dept.class, null);
	}
	
	

}

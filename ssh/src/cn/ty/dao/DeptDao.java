package cn.ty.dao;

import java.util.List;

import cn.ty.domain.Dept;

public interface DeptDao extends BaseDao{

	List<Dept> findAll();
}

package com.tn.myssh.dao;

import java.util.List;

public interface BaseDao<T> {

	void add(T t);
	void saveOrUpdate(T t);
	List<T> listAll(String hql);
	void delete(T t);
	
}

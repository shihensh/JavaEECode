package com.tn.myssh.dao;

import java.util.List;

public interface BaseDao<T> {

	void add(T t);
	void saveOrUpdate(T t);
	List<T> listAll();
	void delete(T t);
	
}

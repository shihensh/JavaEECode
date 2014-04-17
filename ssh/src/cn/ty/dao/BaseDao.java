package cn.ty.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao {

	
	void add(Object obj);
	void delete(Object obj);
	void delete(int id,Class clazz);
	void update(Object obj);

	
	List<Object> get();
	Object getById(int id);
	Object getByParam(Map<String,String> param);
	
}

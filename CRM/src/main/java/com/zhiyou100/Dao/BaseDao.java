package com.zhiyou100.Dao;

import java.util.List;

import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 下午3:09:17
* 类说明
 * @param <T>
*/
public interface BaseDao<T> {
	void save(T user);
	void delete(T user);
	void update(T user);
//	T get(int id);
//	List<T> list();
	
	


}

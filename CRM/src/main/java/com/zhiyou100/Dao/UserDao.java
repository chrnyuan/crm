package com.zhiyou100.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:28:56
* 类说明
*/

public interface UserDao extends BaseDao<User>{
	
	void save(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> list();
	List<User> likeSelectUser(String keyword,String field);
	User getUserByuserName(User user);
	
	
	/** *//** 
	* 分页查询 
	* @param hql 查询的条件 
	* @param offset 开始记录 
	* @param length 一次查询几条记录 
	* @return 
	*/ 
	public List queryForPage(final String hql,final int offset,final int length); 

	/** *//** 
	* 查询所有记录数 
	* @param hql 查询的条件 
	* @return 总记录数 
	*/ 
	public Long getAllRowCount(String hql); 
	
}

package com.zhiyou100.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.User;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:28:56
* ��˵��
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
	* ��ҳ��ѯ 
	* @param hql ��ѯ������ 
	* @param offset ��ʼ��¼ 
	* @param length һ�β�ѯ������¼ 
	* @return 
	*/ 
	public List queryForPage(final String hql,final int offset,final int length); 

	/** *//** 
	* ��ѯ���м�¼�� 
	* @param hql ��ѯ������ 
	* @return �ܼ�¼�� 
	*/ 
	public Long getAllRowCount(String hql); 
	
}

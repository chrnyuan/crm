package com.zhiyou100.Dao;

import java.util.List;

import com.zhiyou100.model.User;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����3:09:17
* ��˵��
 * @param <T>
*/
public interface BaseDao<T> {
	void save(T user);
	void delete(T user);
	void update(T user);
//	T get(int id);
//	List<T> list();
	
	


}

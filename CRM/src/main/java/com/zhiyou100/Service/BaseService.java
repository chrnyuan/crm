package com.zhiyou100.Service;

import com.zhiyou100.model.User;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����9:29:38
* ��˵��
*/
public interface BaseService<T> {
	void save(T user);
	void delete(T user);
	void update(T user);
	User get(T id);
}

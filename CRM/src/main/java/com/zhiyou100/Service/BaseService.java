package com.zhiyou100.Service;

import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午9:29:38
* 类说明
*/
public interface BaseService<T> {
	void save(T user);
	void delete(T user);
	void update(T user);
	User get(T id);
}

package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午9:34:43
* 类说明
*/
public interface RoleService {
	void save(Role role);
	void delete(Role role);
	void update(Role role);
	Role get(int id);
	List<Role> list();
}

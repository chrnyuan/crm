package com.zhiyou100.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:28:56
* 类说明
*/

public interface RoleDao extends BaseDao<Role>{
	
	void save(Role user);
	void delete(Role user);
	void update(Role user);
	Role get(int id);
	List<Role> list();

}

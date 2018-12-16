package com.zhiyou100.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.Dao.RoleDao;
import com.zhiyou100.Service.RoleService;
import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午9:36:16
* 类说明
*/
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao roleDao;
	
	public void save(Role role) {
		
		roleDao.save(role);
	}

	public void delete(Role role) {
		roleDao.delete(role);
		
	}

	public void update(Role role) {
		roleDao.update(role);
		
	}

	public Role get(int id) {
		Role role = roleDao.get(id);
		return role;
	}

	public List<Role> list() {
		List<Role> list = roleDao.list();
		return list;
	}

}

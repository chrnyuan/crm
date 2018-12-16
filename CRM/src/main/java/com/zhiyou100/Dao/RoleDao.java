package com.zhiyou100.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:28:56
* ��˵��
*/

public interface RoleDao extends BaseDao<Role>{
	
	void save(Role user);
	void delete(Role user);
	void update(Role user);
	Role get(int id);
	List<Role> list();

}

package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����9:34:43
* ��˵��
*/
public interface RoleService {
	void save(Role role);
	void delete(Role role);
	void update(Role role);
	Role get(int id);
	List<Role> list();
}

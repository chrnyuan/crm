package com.zhiyou100.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:31:31
* ��˵��
*/
public interface UserService {
	
	void save(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> likeSelectUser(String keyword,String field);
	List<User> list();
	User getUserByuserName(User user);
	
	public PageShow queryForPage(int pageSize, int currentPage);
}

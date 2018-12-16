package com.zhiyou100.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:31:31
* 类说明
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

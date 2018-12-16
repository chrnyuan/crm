package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;


/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午9:34:43
* 类说明
*/
public interface NoticeService {
	void save(Notice role);
	void delete(Notice role);
	void update(Notice role);
	Notice get(int id);
	List<Notice> list();
	List<User> likeSelectNotice(String keyword,String field);
	
	public PageShow queryForPage(int pageSize, int currentPage);
}

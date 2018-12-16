package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;


/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����9:34:43
* ��˵��
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

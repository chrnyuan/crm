package com.zhiyou100.Dao;

import java.util.List;

import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;


/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午9:34:43
* 类说明
*/
public interface NoticeDao extends BaseDao<Notice>{
	void save(Notice role);
	void delete(Notice role);
	void update(Notice role);
	Notice get(int id);
	List<Notice> list();
	List<User> likeSelectNotice(String keyword,String field);
	
	public List queryForPage(final String hql,final int offset,final int length); 
	public Long getAllRowCount(String hql); 
}

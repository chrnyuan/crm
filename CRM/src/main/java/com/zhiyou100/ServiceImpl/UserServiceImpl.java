package com.zhiyou100.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.Dao.UserDao;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午11:23:19
* 类说明
*/
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		
		System.out.println("业务代码");
		userDao.save(user);
		
		
		
		
		
		
		
	}

	public void delete(User user) {
		System.out.println("delete");
		userDao.delete(user);
	}

	public void update(User user) {
		System.out.println("update");
		userDao.update(user);
	}

	public User get(int id) {
		User user = userDao.get(id);
		return user;
	}

	public List<User> list() {
		List<User> list = userDao.list();
		return list;
	}

	public User getUserByuserName(User user) {
		 return userDao.getUserByuserName(user);
		
		
	}

	public List<User> likeSelectUser(String keyword, String field) {
		
		return userDao.likeSelectUser(keyword, field);
	}

	public PageShow queryForPage(int pageSize, int page) {
		String hql = "select count(*) from User";
		Long allRow  = userDao.getAllRowCount(hql);// 总条数
		long totalPage = PageShow.countTotalPage(pageSize, allRow);//总页数
		final int offset = PageShow.countOffset(pageSize, page);//当前页开始记录 
		final int length = pageSize;//每页记录数 
		final int currentPage = PageShow.countCurrentPage(page); 
		List<User> list = userDao.queryForPage("from User",offset, length);//"一页"的记录 
		
		//把分页信息保存到Bean中 
		PageShow pageBean = new PageShow(); 
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage); 
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage); 
		pageBean.setList(list); 
		pageBean.init(); 
		return pageBean; 
	}

}

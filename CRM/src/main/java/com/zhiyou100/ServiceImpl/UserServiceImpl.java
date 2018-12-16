package com.zhiyou100.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.Dao.UserDao;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����11:23:19
* ��˵��
*/
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		
		System.out.println("ҵ�����");
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
		Long allRow  = userDao.getAllRowCount(hql);// ������
		long totalPage = PageShow.countTotalPage(pageSize, allRow);//��ҳ��
		final int offset = PageShow.countOffset(pageSize, page);//��ǰҳ��ʼ��¼ 
		final int length = pageSize;//ÿҳ��¼�� 
		final int currentPage = PageShow.countCurrentPage(page); 
		List<User> list = userDao.queryForPage("from User",offset, length);//"һҳ"�ļ�¼ 
		
		//�ѷ�ҳ��Ϣ���浽Bean�� 
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

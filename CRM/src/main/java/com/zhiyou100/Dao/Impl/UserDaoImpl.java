package com.zhiyou100.Dao.Impl;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zhiyou100.Dao.UserDao;
import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:29:32
* 类说明  Dao实现类
*/
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getUserByuserName(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String sql =" from User U  where U.username = :username and U.password = :password";
		Query query = session.createQuery(sql);
		String username = user.getUsername();
		String password = user.getPassword();
		query.setString("username", username);
		query.setString("password", password);
		/*List<User> list = query.list();
		for (User user2 : list) {
			System.out.println(user2);
		}*/
		//uniqueResult 数据库中根据你的查询条件只会返回唯一结果，
		//就可以用uniqueResult这个方法！否则就用list（）；其返回类型为Object 
		User user2 = (User) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return  user2;
	}
	
	/*public void save(User user) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	
		
	}
	public void delete(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		
		
	}
	public void update(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		
		
	}*/
	public User get(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, id);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public List<User> list() {
		System.out.println("进入list方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		query.setFirstResult(0);//从什么位置开始查找
		query.setMaxResults(3);//每次查找显示多少条
		String hql2= "SELECT count(U) from User U";
		Query query2 = session.createQuery(hql2);
		Long sum = (Long) query2.uniqueResult();
		System.out.println("总条数为："+sum);
		session.getTransaction().commit();
		List<User> list = query.list();
		session.close();
		return  list;
	}

	public List<User> likeSelectUser(String keyword, String field) {
		System.out.println("进入likeSelectUser方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		if (field.equals("username")) {
			Query query = session.createQuery("from User where  username like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("dept")) {
			Query query = session.createQuery("from User where  dept like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("role")) {
			Query query = session.createQuery("from User where  role like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("mobile")) {
			Query query = session.createQuery("from User where  mobile like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("email")) {
			Query query = session.createQuery("from User where  email like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("update_time")) {
			Query query = session.createQuery("from User where  update_time like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}
		return null;
			
	}

	public List queryForPage(String hql, int offset, int length) {
		System.out.println("进入queryForPage方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);//从什么位置开始查找
		query.setMaxResults(length);//每次查找显示多少条
		List<User> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}

	public Long getAllRowCount(String hql) {
		System.out.println("进入getAllRowCount方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query2 = session.createQuery(hql);
		Long sum = (Long) query2.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return  sum;
	}
	

}

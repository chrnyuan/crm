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
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:29:32
* ��˵��  Daoʵ����
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
		//uniqueResult ���ݿ��и�����Ĳ�ѯ����ֻ�᷵��Ψһ�����
		//�Ϳ�����uniqueResult����������������list�������䷵������ΪObject 
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
		System.out.println("����list����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		query.setFirstResult(0);//��ʲôλ�ÿ�ʼ����
		query.setMaxResults(3);//ÿ�β�����ʾ������
		String hql2= "SELECT count(U) from User U";
		Query query2 = session.createQuery(hql2);
		Long sum = (Long) query2.uniqueResult();
		System.out.println("������Ϊ��"+sum);
		session.getTransaction().commit();
		List<User> list = query.list();
		session.close();
		return  list;
	}

	public List<User> likeSelectUser(String keyword, String field) {
		System.out.println("����likeSelectUser����");
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
		System.out.println("����queryForPage����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);//��ʲôλ�ÿ�ʼ����
		query.setMaxResults(length);//ÿ�β�����ʾ������
		List<User> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}

	public Long getAllRowCount(String hql) {
		System.out.println("����getAllRowCount����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query2 = session.createQuery(hql);
		Long sum = (Long) query2.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return  sum;
	}
	

}

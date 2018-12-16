package com.zhiyou100.Dao.Impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zhiyou100.Dao.BaseDao;
import com.zhiyou100.model.User;

import freemarker.template.Template;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 下午3:11:36
* 类说明
*/

public class BaseDaoImpl<T> implements BaseDao<T>{

	private Class entityClass;
	
	public BaseDaoImpl() {
		ParameterizedType superclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = superclass.getActualTypeArguments();
		entityClass=(Class<T>) actualTypeArguments[0];
	}
	

	@Autowired
	private SessionFactory sessionFactory;
/*	@Autowired
	public final void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}*/
	public void save(T user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
/*		this.getHibernateTemplate().save(user);*/
		
	}

	public void delete(T user) {
		System.out.println(user);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(T user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		
	}

	

	/*public T get(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.get(entityClass, id);
		session.getTransaction().commit();
		session.close();
		return T;
	}*/

	/*public List<T> list() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		session.getTransaction().commit();
		session.close();
		return (List<T>) list;
	}*/

	

} 





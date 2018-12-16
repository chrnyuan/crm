package com.zhiyou100.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhiyou100.Dao.DepatmentDao;
import com.zhiyou100.model.Depatment;
import com.zhiyou100.model.Role;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午2:12:41
* 类说明
*/
@Repository
public class DepatmentDaoImpl extends BaseDaoImpl<Depatment> implements DepatmentDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Depatment get(int id) {
		System.out.println("进入DepatmentGET方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Depatment depatment = session.get(Depatment.class, id);
		session.getTransaction().commit();
		session.close();
		return depatment;
	}

	public List<Depatment> list() {
		System.out.println("进入Depatment方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Depatment");
		List<Depatment> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}



}

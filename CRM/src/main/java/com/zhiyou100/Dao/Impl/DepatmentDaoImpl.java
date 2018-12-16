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
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����2:12:41
* ��˵��
*/
@Repository
public class DepatmentDaoImpl extends BaseDaoImpl<Depatment> implements DepatmentDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Depatment get(int id) {
		System.out.println("����DepatmentGET����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Depatment depatment = session.get(Depatment.class, id);
		session.getTransaction().commit();
		session.close();
		return depatment;
	}

	public List<Depatment> list() {
		System.out.println("����Depatment����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Depatment");
		List<Depatment> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}



}

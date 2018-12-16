package com.zhiyou100.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhiyou100.Dao.NoticeDao;
import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;


/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����3:37:32
* ��˵��
*/
@Repository
public class NoticeDaoImpl extends BaseDaoImpl<Notice> implements NoticeDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Notice get(int id) {
		System.out.println("����noticeGET����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Notice notice = session.get(Notice.class, id);
		session.getTransaction().commit();
		session.close();
		return notice;
	}

	public List<Notice> list() {
		System.out.println("����noticelist����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Notice");
		List<Notice> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}

	public List<User> likeSelectNotice(String keyword, String field) {
		System.out.println("����likeSelectNotice����");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		if (field.equals("subject")) {
			Query query = session.createQuery("from Notice where  subject like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("receive_id")) {
			Query query = session.createQuery("from Notice where  receive_id like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("text")) {
			Query query = session.createQuery("from Notice where  text like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("pub_time")) {
			Query query = session.createQuery("from Notice where  pub_time like :key");
			query.setString("key", "%"+keyword+"%");
			List<User> list = query.list();
			System.out.println(list);
			return list;
		}else if (field.equals("expire_time")) {
			Query query = session.createQuery("from Notice where  expire_time like :key");
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

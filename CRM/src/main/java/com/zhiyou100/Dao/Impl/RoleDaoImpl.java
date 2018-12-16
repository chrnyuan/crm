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

import com.zhiyou100.Dao.RoleDao;
import com.zhiyou100.Dao.UserDao;
import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:29:32
* 类说明  Dao实现类
*/
@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{
	@Autowired
	private SessionFactory sessionFactory;
	

	public List<Role> list() {
		System.out.println("进入rolelist方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Role");
		List<Role> list = query.list();
		session.getTransaction().commit();
		session.close();
		return  list;
	}


	public Role get(int id) {
		System.out.println("进入roleGET方法");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Role role = session.get(Role.class, id);
		session.getTransaction().commit();
		session.close();
		return role;
	}

}

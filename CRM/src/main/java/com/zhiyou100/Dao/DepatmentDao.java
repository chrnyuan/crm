package com.zhiyou100.Dao;

import java.util.List;

import com.zhiyou100.model.Depatment;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����2:11:48
* ��˵��
*/
public interface DepatmentDao extends BaseDao<Depatment>{
	void save(Depatment d);
	void delete(Depatment d);
	void update(Depatment d);
	Depatment get(int id);
	List<Depatment> list();
}

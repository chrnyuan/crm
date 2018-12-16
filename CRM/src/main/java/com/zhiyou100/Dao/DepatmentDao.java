package com.zhiyou100.Dao;

import java.util.List;

import com.zhiyou100.model.Depatment;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午2:11:48
* 类说明
*/
public interface DepatmentDao extends BaseDao<Depatment>{
	void save(Depatment d);
	void delete(Depatment d);
	void update(Depatment d);
	Depatment get(int id);
	List<Depatment> list();
}

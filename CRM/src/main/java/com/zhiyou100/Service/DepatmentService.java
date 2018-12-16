package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Depatment;
import com.zhiyou100.model.Role;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午2:08:48
* 类说明
*/
public interface DepatmentService {
	void save(Depatment d);
	void delete(Depatment d);
	void update(Depatment d);
	Depatment get(int id);
	List<Depatment> list();
}

package com.zhiyou100.Service;

import java.util.List;

import com.zhiyou100.model.Depatment;
import com.zhiyou100.model.Role;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����2:08:48
* ��˵��
*/
public interface DepatmentService {
	void save(Depatment d);
	void delete(Depatment d);
	void update(Depatment d);
	Depatment get(int id);
	List<Depatment> list();
}

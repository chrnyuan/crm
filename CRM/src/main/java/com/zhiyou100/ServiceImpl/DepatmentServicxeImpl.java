package com.zhiyou100.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.Dao.DepatmentDao;
import com.zhiyou100.Service.DepatmentService;
import com.zhiyou100.model.Depatment;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午2:11:06
* 类说明
*/
@Service
public class DepatmentServicxeImpl implements DepatmentService{
	
	@Autowired
	private DepatmentDao depatmentDao;
	
	public void save(Depatment d) {
		depatmentDao.save(d);
		
	}

	public void delete(Depatment d) {
		depatmentDao.delete(d);
		
	}

	public void update(Depatment d) {
		depatmentDao.update(d);
		
	}

	public Depatment get(int id) {
		Depatment depatment = depatmentDao.get(id);
		return depatment;
	}

	public List<Depatment> list() {
		List<Depatment> list = depatmentDao.list();
		return list;
	}

}

package com.zhiyou100.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.Dao.NoticeDao;
import com.zhiyou100.Service.NoticeService;
import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����3:36:05
* ��˵��
*/
@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	public void save(Notice notice) {
		noticeDao.save(notice);
		
	}

	public void delete(Notice notice) {
		noticeDao.delete(notice);
		
	}

	public void update(Notice notice) {
		noticeDao.update(notice);
		
	}

	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}

	public List<Notice> list() {
		List<Notice> list = noticeDao.list();
		return list;
	}

	public List<User> likeSelectNotice(String keyword, String field) {
		List<User> list = noticeDao.likeSelectNotice(keyword, field);
		return list;
	}
	
	//��ҳ
	public PageShow queryForPage(int pageSize, int page) {
		String hql = "select count(*) from Notice";
		Long allRow  = noticeDao.getAllRowCount(hql);// ������
		long totalPage = PageShow.countTotalPage(pageSize, allRow);//��ҳ��
		final int offset = PageShow.countOffset(pageSize, page);//��ǰҳ��ʼ��¼ 
		final int length = pageSize;//ÿҳ��¼�� 
		final int currentPage = PageShow.countCurrentPage(page); 
		List<User> list = noticeDao.queryForPage("from Notice",offset, length);//"һҳ"�ļ�¼ 
		
		//�ѷ�ҳ��Ϣ���浽Bean�� 
		PageShow pageBean = new PageShow(); 
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage); 
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage); 
		pageBean.setList(list); 
		pageBean.init(); 
		return pageBean; 
	}
}

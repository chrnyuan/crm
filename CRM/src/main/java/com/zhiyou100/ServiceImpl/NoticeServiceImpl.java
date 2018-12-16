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
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午3:36:05
* 类说明
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
	
	//分页
	public PageShow queryForPage(int pageSize, int page) {
		String hql = "select count(*) from Notice";
		Long allRow  = noticeDao.getAllRowCount(hql);// 总条数
		long totalPage = PageShow.countTotalPage(pageSize, allRow);//总页数
		final int offset = PageShow.countOffset(pageSize, page);//当前页开始记录 
		final int length = pageSize;//每页记录数 
		final int currentPage = PageShow.countCurrentPage(page); 
		List<User> list = noticeDao.queryForPage("from Notice",offset, length);//"一页"的记录 
		
		//把分页信息保存到Bean中 
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

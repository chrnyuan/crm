package com.zhiyou100.Action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhiyou100.Service.NoticeService;
import com.zhiyou100.model.Notice;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

import lombok.Getter;
import lombok.Setter;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午3:30:41
* 类说明
*/
@Controller("noticeAction")
public class NoticeAction extends ActionSupport{
	
	/**
	 * 
	 */


	private static final long serialVersionUID = 1L;

	private static final String DateTime = null;

	@Setter
	@Getter
	private Notice notice = new Notice();
	@Setter
	private int page;//第几页 
	@Setter
	@Getter
	private PageShow pageBean;//包含分布信息的bean 
	
	@Setter
	private String keyword;
	@Setter
	private String field;
	
	@Autowired
	private NoticeService noticeService;

	public String selectNotice() throws Exception {
		System.out.println("进入selectNotice");
		this.pageBean= noticeService.queryForPage(8, page);
		return SUCCESS;
	}
	//模糊查询  
	public String  likeSelectNotice() throws Exception {
		System.out.println("进入 likeSelectNotice方法");
		System.out.println(keyword);
		System.out.println(field);
		List<User> list = noticeService.likeSelectNotice(keyword, field);
		ActionContext.getContext().put("notice", list);
		return SUCCESS;
		
	}
	//跳转到添加部门页面 
	public String skipInsertNotice() throws Exception{
		System.out.println("进入skipInsertNotice");
		return SUCCESS;
		
	}
	//发布公告  
	public String insertNotice() throws Exception{
		System.out.println("进入insertNotice");
		HttpServletRequest request = ServletActionContext.getRequest();
		String pub_time = request.getParameter("pub_time");
		String expire_time = request.getParameter("expire_time");
		System.out.println("string"+pub_time);
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date pub = format1.parse(pub_time);
		Date expire = format1.parse(expire_time);
		String subject = request.getParameter("subject");
		Integer receive_id = Integer.valueOf(request.getParameter("receive_id"));
		String text = request.getParameter("text");
		notice.setPub_time(pub);
		notice.setExpire_time(expire);
		notice.setSubject(subject);
		notice.setReceive_id(receive_id);
		notice.setText(text);
		notice.setCreate_time(new Date());
		System.out.println(notice);
		noticeService.save(notice);
		return "text_redirect";
		
	}
	//跳转到更新公告 
	public String  skipUpdateNotice()throws Exception {
		System.out.println("进入 skipUpdateNotice方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer notice_id = Integer.valueOf(request.getParameter("notice_id"));
		System.out.println(notice_id);
		Notice notice2 = noticeService.get(notice_id);
		System.out.println(notice2);
		ActionContext.getContext().put("notice2", notice2);
		return SUCCESS;
		
	}
	//更改公告  
	public String updateNotice() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String pub_time = request.getParameter("pub_time");
		String expire_time = request.getParameter("expire_time");
		System.out.println("string"+pub_time);
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date pub = format1.parse(pub_time); //转换为util.date
		Date expire = format1.parse(expire_time);
		String subject = request.getParameter("subject");
		Integer receive_id = Integer.valueOf(request.getParameter("receive_id"));
		String text = request.getParameter("text");
		Integer notice_id = Integer.valueOf(request.getParameter("notice_id"));
		notice.setNotice_id(notice_id);
		notice.setPub_time(pub);
		notice.setExpire_time(expire);
		notice.setSubject(subject);
		notice.setReceive_id(receive_id);
		notice.setText(text);
		notice.setUpdate_time(new Date());
		System.out.println(notice);
		noticeService.update(notice);
		return "text_redirect";
		
	}
	//删除公告 
	public String deleteNotice()throws Exception {
		System.out.println("进入deleteNotice方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer notice_id = Integer.valueOf(request.getParameter("notice_id"));
		notice.setNotice_id(notice_id);
		System.out.println(notice);
		noticeService.delete(notice);
		return "text_redirect";
		
	}
	
}


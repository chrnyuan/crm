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
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����3:30:41
* ��˵��
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
	private int page;//�ڼ�ҳ 
	@Setter
	@Getter
	private PageShow pageBean;//�����ֲ���Ϣ��bean 
	
	@Setter
	private String keyword;
	@Setter
	private String field;
	
	@Autowired
	private NoticeService noticeService;

	public String selectNotice() throws Exception {
		System.out.println("����selectNotice");
		this.pageBean= noticeService.queryForPage(8, page);
		return SUCCESS;
	}
	//ģ����ѯ  
	public String  likeSelectNotice() throws Exception {
		System.out.println("���� likeSelectNotice����");
		System.out.println(keyword);
		System.out.println(field);
		List<User> list = noticeService.likeSelectNotice(keyword, field);
		ActionContext.getContext().put("notice", list);
		return SUCCESS;
		
	}
	//��ת����Ӳ���ҳ�� 
	public String skipInsertNotice() throws Exception{
		System.out.println("����skipInsertNotice");
		return SUCCESS;
		
	}
	//��������  
	public String insertNotice() throws Exception{
		System.out.println("����insertNotice");
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
	//��ת�����¹��� 
	public String  skipUpdateNotice()throws Exception {
		System.out.println("���� skipUpdateNotice����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer notice_id = Integer.valueOf(request.getParameter("notice_id"));
		System.out.println(notice_id);
		Notice notice2 = noticeService.get(notice_id);
		System.out.println(notice2);
		ActionContext.getContext().put("notice2", notice2);
		return SUCCESS;
		
	}
	//���Ĺ���  
	public String updateNotice() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String pub_time = request.getParameter("pub_time");
		String expire_time = request.getParameter("expire_time");
		System.out.println("string"+pub_time);
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd"); 
		Date pub = format1.parse(pub_time); //ת��Ϊutil.date
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
	//ɾ������ 
	public String deleteNotice()throws Exception {
		System.out.println("����deleteNotice����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer notice_id = Integer.valueOf(request.getParameter("notice_id"));
		notice.setNotice_id(notice_id);
		System.out.println(notice);
		noticeService.delete(notice);
		return "text_redirect";
		
	}
	
}


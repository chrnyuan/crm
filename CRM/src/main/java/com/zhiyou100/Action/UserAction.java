package com.zhiyou100.Action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhiyou100.Service.UserService;
import com.zhiyou100.model.User;
import com.zhoyou100.util.PageShow;

import lombok.Getter;
import lombok.Setter;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:32:23
* ��˵��
*/
@Controller("UserAction")
public class UserAction extends ActionSupport{

	@Setter
	@Getter
	private User user = new User();
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
	private UserService userService;
	
	private static final long serialVersionUID = 1L;
	private String regular = "^[a-zA-Z]\\W{4,15}$";
	
	
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		return NONE;
		
	}
	//�����¼
	public String  userLogin()throws Exception {
		 System.out.println("���� userlogin����");
		 HttpServletRequest request = ServletActionContext.getRequest();
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 user.setUsername(username);
		 user.setPassword(password);
		 System.out.println(user);
		 User user2 = userService.getUserByuserName(user);
		if (user2 !=null) {
				request.getSession().setAttribute("user", user2);
				return SUCCESS;
		}else{
			System.out.println("��¼ʧ��");
			ActionContext.getContext().put("loginError", "�˺Ż��������");
			return "error";		
		}
		
	}
	

	public void validateUserLogin() {
		System.out.println("������֤");
		this.clearFieldErrors();
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		if (username==null || username.trim().length()==0) {
			super.addFieldError("username", "�˺Ų���Ϊ��");
			return;
		}
		
	/*	if (!username.matches(regular)) {
			super.addFieldError("username", "�˺ű���5-16λ����һλ��������ĸ");
			return;
		}*/
		if (password==null || password.trim().length()==0) {
			super.addFieldError("password", "���벻��Ϊ��");
			return;
		}
		
	}
	
	//��ѯ�û�
	public String  selectUser() throws Exception {
		System.out.println("���� selectUser����");
		this.pageBean= userService.queryForPage(4, page);
		return SUCCESS;	
	}
	//ģ����ѯ 
	public String  likeSelectUser() throws Exception {
		System.out.println("���� likeSelectUser����");
		System.out.println(keyword);
		System.out.println(field);
		List<User> list = userService.likeSelectUser(keyword, field);
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
	//��ת������û����� 
	public String  skipInsertUser()throws Exception {
		System.out.println("���� skipInsertUser����");
		return SUCCESS;
			
	}
	//����û�
	public String insertUser()throws Exception {
		System.out.println("����insert����");
		System.out.println(user);
		user.setCreate_time(new Date());
		userService.save(user);
		return "text_redirect";
	}
	//�޸��û�
	public String updateUser()throws Exception {
		System.out.println("����updateUser����");
		System.out.println(user);
		user.setUpdate_time(new Date());
		userService.update(user);
		return "text_redirect";
		
	}
	//��ת���޸��û����� 
	public String  skipUpdateUser()throws Exception {
		System.out.println("���� skipUpdateUser����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer user_id = Integer.valueOf(request.getParameter("user_id"));
		System.out.println(user_id);
		User user2 = userService.get(user_id);
		System.out.println(user2);
		ActionContext.getContext().put("user1", user2);
		return SUCCESS;
		
	}
	//ɾ���û�
	public String deleteUser()throws Exception {
		System.out.println("����deleteUser����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer user_id = Integer.valueOf(request.getParameter("user_id"));
		user.setUser_id(user_id);
		System.out.println(user);
		userService.delete(user);
		return "text_redirect";
		
	}
	//�û��˳�  
	public String exitUser()throws Exception {
		System.out.println("����exitUser����");
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.invalidate();
		return SUCCESS;
		
	}
}



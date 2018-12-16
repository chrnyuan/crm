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
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:32:23
* 类说明
*/
@Controller("UserAction")
public class UserAction extends ActionSupport{

	@Setter
	@Getter
	private User user = new User();
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
	private UserService userService;
	
	private static final long serialVersionUID = 1L;
	private String regular = "^[a-zA-Z]\\W{4,15}$";
	
	
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		return NONE;
		
	}
	//管理登录
	public String  userLogin()throws Exception {
		 System.out.println("进入 userlogin方法");
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
			System.out.println("登录失败");
			ActionContext.getContext().put("loginError", "账号或密码错误");
			return "error";		
		}
		
	}
	

	public void validateUserLogin() {
		System.out.println("进入验证");
		this.clearFieldErrors();
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		if (username==null || username.trim().length()==0) {
			super.addFieldError("username", "账号不能为空");
			return;
		}
		
	/*	if (!username.matches(regular)) {
			super.addFieldError("username", "账号必须5-16位，第一位必须是字母");
			return;
		}*/
		if (password==null || password.trim().length()==0) {
			super.addFieldError("password", "密码不能为空");
			return;
		}
		
	}
	
	//查询用户
	public String  selectUser() throws Exception {
		System.out.println("进入 selectUser方法");
		this.pageBean= userService.queryForPage(4, page);
		return SUCCESS;	
	}
	//模糊查询 
	public String  likeSelectUser() throws Exception {
		System.out.println("进入 likeSelectUser方法");
		System.out.println(keyword);
		System.out.println(field);
		List<User> list = userService.likeSelectUser(keyword, field);
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
	//跳转到添加用户界面 
	public String  skipInsertUser()throws Exception {
		System.out.println("进入 skipInsertUser方法");
		return SUCCESS;
			
	}
	//添加用户
	public String insertUser()throws Exception {
		System.out.println("进入insert方法");
		System.out.println(user);
		user.setCreate_time(new Date());
		userService.save(user);
		return "text_redirect";
	}
	//修改用户
	public String updateUser()throws Exception {
		System.out.println("进入updateUser方法");
		System.out.println(user);
		user.setUpdate_time(new Date());
		userService.update(user);
		return "text_redirect";
		
	}
	//跳转到修改用户界面 
	public String  skipUpdateUser()throws Exception {
		System.out.println("进入 skipUpdateUser方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer user_id = Integer.valueOf(request.getParameter("user_id"));
		System.out.println(user_id);
		User user2 = userService.get(user_id);
		System.out.println(user2);
		ActionContext.getContext().put("user1", user2);
		return SUCCESS;
		
	}
	//删除用户
	public String deleteUser()throws Exception {
		System.out.println("进入deleteUser方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer user_id = Integer.valueOf(request.getParameter("user_id"));
		user.setUser_id(user_id);
		System.out.println(user);
		userService.delete(user);
		return "text_redirect";
		
	}
	//用户退出  
	public String exitUser()throws Exception {
		System.out.println("进入exitUser方法");
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.invalidate();
		return SUCCESS;
		
	}
}



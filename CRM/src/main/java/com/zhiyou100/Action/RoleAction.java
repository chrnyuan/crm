package com.zhiyou100.Action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhiyou100.Service.RoleService;
import com.zhiyou100.model.Role;

import lombok.Getter;
import lombok.Setter;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 上午8:55:59
* 类说明
*/
@Controller("RoleAction")
public class RoleAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private Role role = new Role();
	
	@Setter
	private String remark;
	@Setter
	private String role_name;
	@Autowired
	private RoleService roleService;
	
	@Override
	public String execute() throws Exception {
		System.out.println("进入role");
		
		return NONE;
	}
	//查询角色	
	public String selectRole() throws Exception{
		System.out.println("进入selectRole");
		List<Role> list = roleService.list();
		System.out.println(list);
		ActionContext.getContext().put("role", list);
		return SUCCESS;
		
	}
	
	//跳转到添加角色界面  
	public String skipInsertRole() throws Exception{
		System.out.println("进入skipInsertRole");
		return SUCCESS;
		
	}
	//添加角色  
	public String insertRole() throws Exception{
		System.out.println("进入insertRole");
		role.setRole_name(role_name);
		role.setRemark(remark);
		role.setCreate_time(new Date());
		roleService.save(role);
		return "text_redirect";
		
	}

	//跳转到修改角色页面 
	public String  skipUpdateRole()throws Exception {
		System.out.println("进入 skipUpdateRole方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer role_id = Integer.valueOf(request.getParameter("role_id"));
		System.out.println(role_id);
		Role role2 = roleService.get(role_id);
		System.out.println(role2);
		ActionContext.getContext().put("role2", role2);
		return SUCCESS;
		
	}
	//修改角色  
	public String updateRole() throws Exception{
		System.out.println("进入updateRole");
		role.setRole_name(role_name);
		role.setRemark(remark);
		role.setUpdate_time(new Date());
		roleService.update(role);
		return "text_redirect";
		
	}

	//删除角色 
	public String deleteRole()throws Exception {
		System.out.println("进入deleteRole方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer role_id = Integer.valueOf(request.getParameter("role_id"));
		role.setRole_id(role_id);
		roleService.delete(role);
		return "text_redirect";
		
	}
	
}

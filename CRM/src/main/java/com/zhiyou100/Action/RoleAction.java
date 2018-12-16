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
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����8:55:59
* ��˵��
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
		System.out.println("����role");
		
		return NONE;
	}
	//��ѯ��ɫ	
	public String selectRole() throws Exception{
		System.out.println("����selectRole");
		List<Role> list = roleService.list();
		System.out.println(list);
		ActionContext.getContext().put("role", list);
		return SUCCESS;
		
	}
	
	//��ת����ӽ�ɫ����  
	public String skipInsertRole() throws Exception{
		System.out.println("����skipInsertRole");
		return SUCCESS;
		
	}
	//��ӽ�ɫ  
	public String insertRole() throws Exception{
		System.out.println("����insertRole");
		role.setRole_name(role_name);
		role.setRemark(remark);
		role.setCreate_time(new Date());
		roleService.save(role);
		return "text_redirect";
		
	}

	//��ת���޸Ľ�ɫҳ�� 
	public String  skipUpdateRole()throws Exception {
		System.out.println("���� skipUpdateRole����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer role_id = Integer.valueOf(request.getParameter("role_id"));
		System.out.println(role_id);
		Role role2 = roleService.get(role_id);
		System.out.println(role2);
		ActionContext.getContext().put("role2", role2);
		return SUCCESS;
		
	}
	//�޸Ľ�ɫ  
	public String updateRole() throws Exception{
		System.out.println("����updateRole");
		role.setRole_name(role_name);
		role.setRemark(remark);
		role.setUpdate_time(new Date());
		roleService.update(role);
		return "text_redirect";
		
	}

	//ɾ����ɫ 
	public String deleteRole()throws Exception {
		System.out.println("����deleteRole����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer role_id = Integer.valueOf(request.getParameter("role_id"));
		role.setRole_id(role_id);
		roleService.delete(role);
		return "text_redirect";
		
	}
	
}

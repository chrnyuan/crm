package com.zhiyou100.Action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhiyou100.Service.DepatmentService;
import com.zhiyou100.model.Depatment;

import lombok.Getter;
import lombok.Setter;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月13日 下午2:03:27
* 类说明
*/
@Controller("DepatmentAction")
public class DepatmentAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private Depatment d = new Depatment();
	@Setter
	private String department_name;
	@Setter
	private String department_desc;
	@Autowired
	private DepatmentService depatmentService;
	
	@Override
	public String execute() throws Exception {
		System.out.println("进入d");
		List<Depatment> list = depatmentService.list();
		ActionContext.getContext().put("d", list);
		return SUCCESS;
	}

	//跳转到添加部门页面  
	public String skipInsertDept() throws Exception{
		System.out.println("进入skipInsertDept");
		return SUCCESS;
		
	}
	
	//添加部门  
	public String insertDepatment() throws Exception{
		System.out.println("进入insertDepatment");
		d.setDepartment_name(department_name);
		d.setDepartment_desc(department_desc);
		d.setCreate_time(new Date());
		depatmentService.save(d);
		return "text_redirect";
		
	}
	
	//跳转到修改部门页面     
	public String  skipUpdateDepartment()throws Exception {
		System.out.println("进入 skipUpdateDepartment方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer department_id = Integer.valueOf(request.getParameter("department_id"));
		System.out.println(department_id);
		Depatment depatment = depatmentService.get(department_id);
		System.out.println(depatment);
		ActionContext.getContext().put("d1", depatment);
		return SUCCESS;
		
	}
	//修改部门  
	public String updateDepatment() throws Exception{
		System.out.println("进入updateDepatment");
		d.setDepartment_name(department_name);
		d.setDepartment_desc(department_desc);
		d.setUpdate_time(new Date());
		depatmentService.update(d);
		return "text_redirect";
		
	}
	
	//删除部门
	public String depetDelete()throws Exception {
		System.out.println("进入depetDelete方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer department_id = Integer.valueOf(request.getParameter("department_id"));
		System.out.println(department_id);
		d.setDepartment_id(department_id);
		depatmentService.delete(d);
		return "text_redirect";
		
	}
	
}

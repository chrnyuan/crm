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
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��13�� ����2:03:27
* ��˵��
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
		System.out.println("����d");
		List<Depatment> list = depatmentService.list();
		ActionContext.getContext().put("d", list);
		return SUCCESS;
	}

	//��ת����Ӳ���ҳ��  
	public String skipInsertDept() throws Exception{
		System.out.println("����skipInsertDept");
		return SUCCESS;
		
	}
	
	//��Ӳ���  
	public String insertDepatment() throws Exception{
		System.out.println("����insertDepatment");
		d.setDepartment_name(department_name);
		d.setDepartment_desc(department_desc);
		d.setCreate_time(new Date());
		depatmentService.save(d);
		return "text_redirect";
		
	}
	
	//��ת���޸Ĳ���ҳ��     
	public String  skipUpdateDepartment()throws Exception {
		System.out.println("���� skipUpdateDepartment����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer department_id = Integer.valueOf(request.getParameter("department_id"));
		System.out.println(department_id);
		Depatment depatment = depatmentService.get(department_id);
		System.out.println(depatment);
		ActionContext.getContext().put("d1", depatment);
		return SUCCESS;
		
	}
	//�޸Ĳ���  
	public String updateDepatment() throws Exception{
		System.out.println("����updateDepatment");
		d.setDepartment_name(department_name);
		d.setDepartment_desc(department_desc);
		d.setUpdate_time(new Date());
		depatmentService.update(d);
		return "text_redirect";
		
	}
	
	//ɾ������
	public String depetDelete()throws Exception {
		System.out.println("����depetDelete����");
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer department_id = Integer.valueOf(request.getParameter("department_id"));
		System.out.println(department_id);
		d.setDepartment_id(department_id);
		depatmentService.delete(d);
		return "text_redirect";
		
	}
	
}

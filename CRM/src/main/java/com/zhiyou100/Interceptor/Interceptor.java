package com.zhiyou100.Interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import lombok.Setter;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��15�� ����10:13:31
* ��˵��
*/
public class Interceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	@Setter
	private String[] n={};
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("intercept");
		for (String string : n) {
			System.out.println(string.equals(invocation.getProxy().getActionName()));
			if (string.equals(invocation.getProxy().getActionName())) {
				return invocation.invoke();
			}
		}
		
		System.out.println(invocation.getProxy().getActionName());
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		Object user = session.get("user");
		if (user==null) {
			System.out.println("byebye");
			return "login";//�����߼���ͼ����
		}
		return invocation.invoke();
	}

}

package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����9:40:34
* ��˵��
*/
@Data
public class Role {

	private Integer role_id;
	private String role_name;
	private Integer role_permission;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer role_update;
}

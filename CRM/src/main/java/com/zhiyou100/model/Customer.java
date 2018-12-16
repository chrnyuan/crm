package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����10:13:08
* ��˵��
*/
@Data
public class Customer {

	private Integer customer_id;
	private Integer customer_state_id;
	private Integer customer_source_id;
	private Integer user_id;
	private Integer customer_category_id;
	private String customer_name;
	private Integer customer_is_male;
	private String customer_mobile;
	private String customer_qq;
	private String customer_address;
	private String customer_email;
	private String customer_remark;
	private String customer_position;
	private String customer_blog;
	private String customer_tel;
	private Date customer_birth;
	private String customer_company;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
}

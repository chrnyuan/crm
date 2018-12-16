package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����10:13:08
* ��˵��
*/
@Data
public class CustomerCategory {

	private Integer customer_category_id;
	private String customer_category_name;
	private String customer_category_desc;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

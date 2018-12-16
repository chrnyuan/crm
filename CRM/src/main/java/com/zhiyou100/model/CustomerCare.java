package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����10:13:08
* ��˵��
*/
@Data
public class CustomerCare {

	private Integer customer_care_id;
	private Integer customer_id;
	private String care_subject;
	private String care_type;
	private Integer status;
	private String remark;
	private Date next_time;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

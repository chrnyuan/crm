package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����10:13:08
* ��˵��
*/
@Data
public class CustomerState {

	private Integer customer_state_id;
	private String customer_state_name;
	private String customer_state_desc;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����9:47:56
* ��˵��
*/
@Data
public class Depatment {

	private Integer department_id;
	private String department_name;
	private String department_desc;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer c_updater;
}

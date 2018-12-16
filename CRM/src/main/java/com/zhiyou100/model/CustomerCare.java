package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午10:13:08
* 类说明
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

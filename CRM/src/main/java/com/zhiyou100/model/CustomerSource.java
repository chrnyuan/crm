package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午10:13:08
* 类说明
*/
@Data
public class CustomerSource {

	private Integer customer_source_id;
	private String customer_source_name;
	private String customer_source_desc;
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

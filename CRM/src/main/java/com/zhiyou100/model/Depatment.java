package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午9:47:56
* 类说明
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

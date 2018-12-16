package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午9:40:34
* 类说明
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

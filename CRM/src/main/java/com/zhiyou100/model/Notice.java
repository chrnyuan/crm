package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午10:04:51
* 类说明
*/

@Data
public class Notice {

	private Integer notice_id;
	private Integer receive_id;//公告范围
	private String subject;
	private String text;//公告内容
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pub_time;//公告时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expire_time;//截止时间
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

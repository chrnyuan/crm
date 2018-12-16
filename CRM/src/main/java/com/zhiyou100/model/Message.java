package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月10日 上午9:54:58
* 类说明
*/
@Data
public class Message {

	private Integer message_id;
	private String subject;
	private String content;
	private Integer sender;
	private Integer send_delete;
	private Integer send_status;
	private Date save_time;
	private Date send_time;
	private Date send_update_time;
	private Integer receiver;
	private Integer receive_delete;
	private Integer receive_status;
	private Date receive_update_time;
}

package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��10�� ����10:04:51
* ��˵��
*/

@Data
public class Notice {

	private Integer notice_id;
	private Integer receive_id;//���淶Χ
	private String subject;
	private String text;//��������
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pub_time;//����ʱ��
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expire_time;//��ֹʱ��
	private Integer status;
	private String remark;
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
}

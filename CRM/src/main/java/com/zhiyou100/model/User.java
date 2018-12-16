package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月7日 上午10:28:35
* 类说明
*/
@Data
public class User {

	private Integer user_id;
	private Integer dept;//部门
	private Integer role;//角色
	private String username;//密码
	private String is_male;//性别
	private String mobile;//手机号
	private Integer age;//年龄
	private String address;//地址
	private Integer is_admin;//密码
	private Integer is_system;
	private String password;//密码
	private String tel;//固定电话
	private String id_num;//身份证号
	private String email;//电子邮箱
	private String hobby;//
	private Integer education;//学历
	private String card_num;//工资卡号
	private String nation;//民族
	private Integer marry;//婚姻状况
	private Integer status;
	private String remark;//备注
	private Date create_time;
	private Integer creater;
	private Date update_time;
	private Integer updater;
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", dept=" + dept + ", role=" + role + ", username=" + username
				+ ", is_male=" + is_male + ", mobile=" + mobile + ", age=" + age + ", address=" + address
				+ ", is_admin=" + is_admin + ", is_system=" + is_system + ", password=" + password + ", tel=" + tel
				+ ", id_num=" + id_num + ", email=" + email + ", hobby=" + hobby + ", education=" + education
				+ ", card_num=" + card_num + ", nation=" + nation + ", marry=" + marry + ", status=" + status
				+ ", remark=" + remark + ", create_time=" + create_time + ", creater=" + creater + ", update_time="
				+ update_time + ", updater=" + updater + "]";
	}
	
	
}


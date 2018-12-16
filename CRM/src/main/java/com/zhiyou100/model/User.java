package com.zhiyou100.model;

import java.util.Date;

import lombok.Data;

/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��7�� ����10:28:35
* ��˵��
*/
@Data
public class User {

	private Integer user_id;
	private Integer dept;//����
	private Integer role;//��ɫ
	private String username;//����
	private String is_male;//�Ա�
	private String mobile;//�ֻ���
	private Integer age;//����
	private String address;//��ַ
	private Integer is_admin;//����
	private Integer is_system;
	private String password;//����
	private String tel;//�̶��绰
	private String id_num;//���֤��
	private String email;//��������
	private String hobby;//
	private Integer education;//ѧ��
	private String card_num;//���ʿ���
	private String nation;//����
	private Integer marry;//����״��
	private Integer status;
	private String remark;//��ע
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


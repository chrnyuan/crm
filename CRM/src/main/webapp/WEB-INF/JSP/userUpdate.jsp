<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="http://localhost:8080/CRM/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="bootstrap/js/jquery.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>更新用户</title>
</head>
<style>
  
.box3{
    width: 100%;
    height: 100%;
    background-color: lightgrey;
   
}
.box4{
    width: 96%;
    height: 90%;
    background-color:white;
    margin: 20px 0 0 2%;
}
.box5{
    width:100%;
    height:8%;
    font-size: 30px;

}
.tablebox{
   width: 96%;
   height: 80%;
   
  
}
.box6{
    height: 150px;
    text-align: center;
 
}
.box7{
    

}
.box8{
    width: 100%;
    height: 15%;
    border-color:red;
    border-width: 1px;

}
.box9{
    width: 15%;
    height: 30%;
    margin: 30px 0 0 40%;
   
}
.box10{
    width: 100%;
    height: 8%;
    background-color:white;
    margin: 0 0 0 0%;
    border:solid 1px silver;
}
.td{
    text-align: center;
}
.box11{
    text-align: center;
    font-size: 18px;
    color: silver;
    margin: 20px 0 0 0;
}
.glyphicon-gift{
    color: aliceblue;
}
.glyphicon-file{
    color: aliceblue;
}
.glyphicon-envelope{
    color: aliceblue;
}
#linka :hover{color:pink;}

</style>
<body>
 
    <div class="box3">
        <div class="box4">
        	<form action="userupdate" method="POST">
        	<input type="hidden" name="user.user_id" value="${user1.user_id}"> 
            <div class="box5"><span style="margin: 30px 0 0 50px";>更新用户</span></div>
            <div style="margin: 0 0 0 50px" >
            
                <table border="1" class="tablebox">
                      
                    <tr>
                        <td class="td">
                         	   用户名
                        </td>
                        <td><input type="text" name="user.username" value="${user1.username }">
                        	
                        </td>
                        <td class="td">密码</td>
                        <td>
                              <input type="password" name="user.password" value="<s:property value="#user1.password"/>">
                              
                        </td>
                    </tr>
                    <tr>
                            <td class="td">
                                   	 部门
                                </td>
                                <td>
                                    <select name="user.dept" >
                                    	<option>${user1.dept}</option>
                                        <option value="1">财务部</option>
                                        <option value="2">人事部</option>
                                    </select>
                                </td>
                                <td class="td">角色</td>
                                <td>
                                        <select name="user.role">
                                        		<option>${user1.role}</option>
                                                <option>1</option>
                                                <option>2</option>
                                         </select>
                                </td>
                    </tr>
                    <tr>
                        <td class="td">性别</td>
                        <td>
                            <input type="radio"name="user.is_male" value="男"> 男
                            <input type="radio"name="user.is_male" value="女"> 女
                        </td>
                        <td class="td">手机号</td>
                        <td>
                            <input type="text" name="user.mobile" value="${user1.mobile }" placeholder="请填写手机号">
                        </td>
                    </tr>
                    <tr>
                        <td class="td">地址</td>
                        <td>
                            <input type="text" name="user.address" value="${user1.address }" placeholder="请填写地址">
                        </td>
                        <td class="td">年龄</td>
                        <td>
                             <input type="text" name="user.age"value="${user1.age }" placeholder="请填写年龄">
                        </td>
                    </tr>
                    <tr>
                        <td class="td">固定电话</td>
                        <td>
                            <input type="text" name="user.tel"value="${user1.tel }" placeholder="请填写固定电话">
                        </td>
                        <td class="td">身份证号</td>
                        <td>
                            <input type="text" name="user.id_num"value="${user1.id_num }"  placeholder="请填写身份证号">
                        </td>
                    </tr>
                    <tr>
                        <td class="td">电子邮箱</td>
                        <td>
                            <input type="text" name="user.email" value="${user1.email }" placeholder="请填写电子邮箱">
                        </td>
                        <td class="td">QQ号</td>
                        <td>
                            <input type="text" name="" placeholder="请填写QQ号">
                        </td>
                    </tr>
                    <tr>
                        <td class="td">爱好</td>
                        <td>
                            <input type="text" name="user.hobby" value="${user1.hobby }" placeholder="请填写爱好">
                        </td>
                        <td class="td">学历</td>
                        <td>
                            <select name="user.education">
                            	<option>${user1.education }</option>
                                <option value="1">小学</option>
                                <option value="2">初中</option>
                                <option value="3">高中</option>
                                <option value="4">大学</option>
                            </select>
                        </td>

                    </tr>
                    <tr>
                        <td class="td">工资卡号</td>
                        <td>
                            <input type="text" name="user.card_num" value="${user1.card_num }" placeholder="请填写工资卡号">
                        </td>
                        <td class="td">民族</td>
                        <td>
                            <input type="text" name="user.nation" value="${user1.nation }" placeholder="请填写民族" >
                        </td>
                    </tr>
                    <tr>
                        <td class="td">婚姻状况</td>
                        <td>
                            <select name="user.marry">
                            	<option>${user1.marry }</option>
                                <option value="0">已婚</option>
                                <option value="1">未婚</option>
                                <option value="2">离异</option>
                            </select>
                        </td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="box6">备注</td>
                        <td colspan="3" >
                            <div class="box7">
							<input type="text" name="user.remark" value="${user1.remark }">
                            </div>
                        </td>
                    </tr>
                     
                </table>
           
            </div>
            <div class="box8">
                <div class="box9">
                  
                         
                <button type="submit" class="btn btn-primary">保存</button>
                <a href="userSelect"><button type="button" class="btn btn-default">返回</button></a>
                 </div>
            </div>
			</form>
        </div>
        <div class="box10">
            <div class="box11"><span>智游教育@2017河南智游臻龙教育科技有限公司</span></div>
        </div>
    </div>
</body>
</html>
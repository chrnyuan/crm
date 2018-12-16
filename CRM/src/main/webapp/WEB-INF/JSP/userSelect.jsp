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
<title>查询用户</title>
<style>


.box3{
    width: 100%;
    height: 100%;
    background-color: lightgrey;
    position: absolute;
    top: 2%;

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
.box6{
    width:100%;
    height:8%;
    font-size: 20px;
   
}


.table{
    width: 96%;
    height: 30%;
    text-align: center;
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
</style>
</head>

<body>
  
    <div class="box3">
        <div class="box4">
            <div class="box5"><span style="margin: 30px 0 0 50px";>用户列表</span></div>
            <form action="likeSelectUser" method="post">
            <div class="box6"><span style="margin: 30px 0 0 50px";>搜索内容：</span>
                <input type="text" name="keyword" class="btn btn-default" placeholder="请输入搜索关键字" > 
                &emsp; <span>搜索字段:</span>
                <select name="field"  class="btn btn-default">
                    <option value="username">用户名</option>
                    <option value="dept">部门</option>
                    <option value="role">角色</option>
                    <option value="mobile">手机号</option>
                    <option value="email">邮箱</option>
                    <option value="update_time">更新时间</option>
                </select>
                &emsp;<input type="submit" value="搜索" class="btn btn-default">
               	 &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
               <a href="skipInsertUser"> <button type="button" class="btn btn-primary">添加用户</button></a>
            </div>
			</form>
			<br>

            <div style="margin: 0 0 0 50px">
                <table border="1" class="table">
                    <tr>
                        <td><strong>序号</strong></td>
                        
                        <td><strong>用户名</strong></td>
                        <td><strong>部门</strong></td>
                        <td><strong>角色</strong></td>
                        <td><strong>手机号</strong></td>
                        <td><strong>邮箱</strong></td>
                        <td><strong>更新时间</strong></td>
                        <td><strong>操作</strong></td>
                    </tr>
              		<s:iterator value="list" var="user">
              		 <tr>
              		 	
                   		<td><s:property value="user_id"/></td>
                   		<td><s:property value="username"/></td>
                   		<td><s:property value="dept"/></td>
                   		<td><s:property value="role"/></td>
                   		<td><s:property value="mobile"/></td>
                   		<td><s:property value="email"/></td>
                   		<td><s:property value="update_time"/></td>
                        <td>
                        	<a href="skipUpdateUser?user_id=<s:property value="user_id"/>"><i class="glyphicon glyphicon-pencil"></i></a>&emsp;
                            <a href="userdelete?user_id=<s:property value="user_id"/>"><i class="glyphicon glyphicon-remove"></i></a>
                        </td>
                   </tr>
                   </s:iterator>
                   
                	<s:iterator var="user" value="pageBean.list">
                	
                   <tr>
                   		<td><s:property value="user_id"/></td>
                   		<td><s:property value="username"/></td>
                   		<td><s:property value="dept"/></td>
                   		<td><s:property value="role"/></td>
                   		<td><s:property value="mobile"/></td>
                   		<td><s:property value="email"/></td>
                   		<td><s:property value="update_time"/></td>
                   
                        <td>
                        	<a href="skipUpdateUser?user_id=<s:property value="user_id"/>"><i class="glyphicon glyphicon-pencil"></i></a>&emsp;
                            <a href="userdelete?user_id=<s:property value="user_id"/>"><i class="glyphicon glyphicon-remove"></i></a>
                        </td>
                   </tr>
                   </s:iterator>
                </table>
                <span style="font-size :20px;">共<s:property value="pageBean.allRow"/> 条记录 ，共<s:property value="pageBean.totalPage"/> 页 
当前第<s:property value="pageBean.currentPage"/>页<br/> </span>
                
                &emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;
               <s:if test="%{pageBean.currentPage == 1}"> 
		<button type="button" class="btn btn-default">第一页</button> <button type="button" class="btn btn-default">上一页</button> 
			</s:if> 
		<s:else> 
		<a href="userSelect?page=1"><button type="button" class="btn btn-default">第一页</button></a> 
		<a href="userSelect?page=<s:property value="%{pageBean.currentPage-1}"/>"><button type="button" class="btn btn-default">上一页</button></a> 
		</s:else> 
		<s:if test="%{pageBean.currentPage != pageBean.totalPage}"> 
		<a href="userSelect?page=<s:property value="%{pageBean.currentPage+1}"/>"><button type="button" class="btn btn-default">下一页</button></a> 
		<a href="userSelect?page=<s:property value="pageBean.totalPage"/>"><button type="button" class="btn btn-default">最后一页</button></a> 
		</s:if> 
		<s:else> 
		<button type="button" class="btn btn-default">下一页</button><button type="button" class="btn btn-default">最后一页 </button>
		</s:else>
            </div>
            </div>
           

        
    </div>
</body>
</html>
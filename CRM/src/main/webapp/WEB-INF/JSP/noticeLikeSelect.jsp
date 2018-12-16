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
<title>公告管理</title>
<style>
   
.box3{
    width:100%;
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
            <div class="box5"><span style="margin: 30px 0 0 50px";>公告管理</span></div>
            <form action="likeSelectNotice" method="post">
            <div class="box6"><span style="margin: 30px 0 0 50px";>搜索内容：</span>
            
                <input type="text" name="keyword" class="btn btn-default" placeholder="请输入搜索关键字" > 
                &emsp; <span>搜索字段:</span>
                <select name="field"  class="btn btn-default">
                    <option value="subject">主题</option>
                    <option value="receive_id">通知范围</option>
                    <option value="text">公告内容</option>
                    <option value="pub_time">公告时间</option>
                    <option value="expire_time">截止时间</option>
                   
                </select>
                &emsp;<input type="submit" value="搜索" class="btn btn-default">
               &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
               <a href="skipInsertNotice"> <button type="button" class="btn btn-primary">发布公告</button></a>
            </div>	
          	</form>
          	<br>
          	 <div style="margin: 0 0 0 50px">
                <table border="1" class="table">
                    <tr>
                        <td><strong>序号</strong></td>
                        
                        <td><strong>公告人</strong></td>
                        <td><strong>公告主题</strong></td>
                        <td><strong>通知范围</strong></td>
                        <td><strong>公告内容</strong></td>
                        <td><strong>公告时间</strong></td>
                        <td><strong>截止时间</strong></td>
                        <td><strong>操作</strong></td>
                    </tr>
              
                	<s:iterator var="notice2" value="#notice">
                   <tr>
                   		<td><s:property value="notice_id"/></td>
                   		<td><s:property value="updater"/></td>
                   		<td><s:property value="subject"/></td>
                   		<td><s:property value="receive_id"/></td>
                   		<td><s:property value="text"/></td>
                   		<td><s:property value="pub_time"/></td>
                   		<td><s:property value="expire_time"/></td>
                   		
                        <td>
                        	<a href="skipUpdateNotice?notice_id=<s:property value="notice_id"/>"><i class="glyphicon glyphicon-pencil"></i></a>&emsp;
                            <a href="noticeDelete?notice_id=<s:property value="notice_id"/>"><i class="glyphicon glyphicon-remove"></i></a>
                        </td>
                   </tr>
                   </s:iterator>
                </table>

            </div>
            </div>
           

        
    </div>
</body>
</html>
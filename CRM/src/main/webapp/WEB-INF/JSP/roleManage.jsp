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
<title>角色管理</title>
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
    .box6{
        width:100%;
        height:8%;
        font-size: 20px;
       
    }
    .box7{
        width: 100px;
        height: 40px;
       
        position: relative;
        top: 20%;
        left: 90%;
    }
    .box10{
    width: 100%;
    height: 8%;
    background-color:white;
    margin: 0 0 0 0%;
    border:solid 1px silver;
}
.box11{
    text-align: center;
    font-size: 18px;
    color: silver;
    margin: 20px 0 0 0;
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
<body>
     
            <div class="box3">
                <div class="box4">
                    <div class="box5"><span style="margin: 30px 0 0 50px";>角色管理</span></div>
                    <div class="box6">
                      <div class="box7"> <a href="skipInsertRole"> <button class="btn btn-primary">添加角色</button></a></div>
                    </div>
        
                    <div style="margin: 0 0 0 50px">
                        <table border="1" class="table">
                            <tr>
                                <td><strong>序号</strong></td>
                                <td><strong>角色名称</strong></td>
                                <td><strong>角色描述</strong></td>
                                <td><strong>更新时间</strong></td>
                                <td><strong>操作</strong></td>
                            </tr>
                            
                           
                            <s:iterator value="#role" var="role">
                            <tr>
                                <td><s:property value="role_id"/></td>
                                <td><s:property value="role_name"/></td>
                                <td><s:property value="remark"/></td>
                                <td><s:property value="update_time"/></td>
                                <td>
                                   <a href="skipUpdateRole?role_id=<s:property value="role_id"/>"><i class="glyphicon glyphicon-pencil"></i></a>&emsp;
                            	   <a href="roledelete?role_id=<s:property value="role_id"/>"><i class="glyphicon glyphicon-remove"></i></a>
                                </td>
                            </tr>
                           </s:iterator>
                        </table>
                       
                    </div>
                    </div>
                   
                    <div class="box10">
                            <div class="box11"><span>智游教育@2017河南智游臻龙教育科技有限公司</span></div>
                        </div>
                
            </div> 
</body>
</html>
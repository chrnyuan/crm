<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>

<style>
   
    #box {
	font-size: 20px;
	font-family: 楷体;
    width: 25%;
	height: 43%;
	position: absolute;
	top: 25%;
	left: 50%;
	margin-left: -200px;
    background-color: white;
}
.t {
	width: 80%;
	height: 30px;
    margin-left:10%;
     margin-right:auto
}

.login-button-box{
    height: 35px;
    width: 80%;
    background-color: red;
    margin-left: 10%;
    margin-right: auto;
    border:none;

}
.content{
    width: 80%;
	height: 30px;
    color: silver;
    margin-left:23%;
     margin-right:auto
     
}
</style>
 <s:head/> 
<body>
    <s:debug/>
    <div style="width:100%;height:900px; background: lightgrey">

    <div id="box">
            <img src="photo/logo.png" alt="加载失败" style="width:200px;height:50px; margin:6% 0 0 23% 
           ">
            <p class="content">智游客户关系管理系统</p>
           <form action="userlogin" method="post">
            <input type="text" name ="username"  class="t"  id="Name"> 
          	<s:fielderror fieldName="username"/>
             <br><i id="i" style="color:red;"></i><br>
            <input type="password" name ="password"  class="t" >
            <br>
            <s:fielderror fieldName="password"/>
            <span class="t"style="color:red;"><s:property value="#loginError"/></span>
           <br>
           
           <input type="submit" value="登录"  class="login-button-box"> 
           </form>  
           <%--   <s:form action="userlogin" method="post">
           	<s:textfield name ="username"  class="t"/>   
            <s:password name ="password"  class="t"/> 
             <s:submit value="登录"  class="login-button-box"/>  
  			</s:form>  --%>
            
            </div>
        </div>
	
</body>
	
</html>
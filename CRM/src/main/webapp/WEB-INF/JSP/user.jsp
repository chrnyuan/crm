<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="http://localhost:8080/CRM/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="bootstrap/js/jquery.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>智游用户关系管理系统</title>
</head>
<style>
 .row{
        width: 100%;
        height: 7%;
     background-color:#4682B4; 
       color: whitesmoke;
       text-align: center;
       line-height: 50px;
       font-size: 15px;
       
    }   
.box{
    width: 15%;
    height:600px;
    background-color: rgb(48, 56, 56);
    color: aliceblue;
    font-size: 20px;
}

.box3{
    width: 85%;
    height: 550px;
    background-color: lightgrey;
    position: absolute;
    top: 7%;
    left: 15%;
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
    <div class="containner">
        <div class="row">
            <div class="col-md-2" style="font: size 20px;" >智游客户管理系统</div>
            <div class="col-md-1" id="linka"><span >工作台</span></div>
            <div class="col-md-1">报表</div>
            <div class="col-md-1">客户信息</div>
            <div class="col-md-1">员工信息</div>
            <div class="col-md-1">公告信息</div>
            <div class="col-md-1">发件箱</div>
            <div class="col-md-2"></div>
            <div class="col-md-1">${user.username}</div>
			<div class="col-md-1"><a href="userExit"><span style="color:white;">退出</span></a></div>
        </div>

    </div>
    <div class="box">
            <br>
            &emsp;<a><span class="glyphicon glyphicon-gift">&nbsp;客户管理</span></a><br><br>
            &emsp;<a><span class="glyphicon glyphicon-file">&nbsp;内部信息</span></a><br><br>
            &emsp;<a><span class="glyphicon glyphicon-envelope">&nbsp;站内邮件</span></a><br><br>
          <div class="btn-group" style="float: left;">
            <button type="button" class="btn btn-default dropdown-toggle" 
                    data-toggle="dropdown" style="background-color: rgb(48, 56, 56); color: white;border:none;font-size: 20px;">
                  &nbsp;<span class="glyphicon glyphicon-user">&nbsp;管理员</span> 
            </button>
            <ul class="dropdown-menu" role="menu" style="border:none;">
                <li><a href="noticeSelect" target="contentIframe">公告管理</a></li>
                <li><a href="deptSelect" target="contentIframe">部门管理</a></li>
                <li>
                <a href="roleSelect" target="contentIframe">角色管理</a>
                </li>
                <li><a href="userSelect" target="contentIframe">用户管理</a></li>
            </ul>
        </div>
        </div>
		 <iframe src="" frameborder="0" id="contentIframe" name="contentIframe" style="width:1050px;height:600px;position: absolute; top: 7%;
    left: 15%;"></iframe>
</body>
<script>


</script>
</html>
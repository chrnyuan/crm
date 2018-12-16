<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="http://localhost:8080/CRM/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="bootstrap/js/jquery.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>更新公告</title>
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
        	  <form action="noticeupdate" method="POST">
        	  <input type="hidden" name="notice_id" value="${notice2.notice_id}">
            <div class="box5"><span style="margin: 30px 0 0 50px";>更新公告</span></div>
            <div style="margin: 0 0 0 50px" >
               
                <table border="1" class="tablebox">
                	
                    <tr>
                        <td class="td">
                           	 发布时间
                        </td>
                        <td><input type="text" name="pub_time" value="${notice2.pub_time}"></td>
                        <td class="td">截止时间</td>
                        <td>
                                <input type="text" name="expire_time" value="${notice2.expire_time}">
                        </td>
                    </tr>
                    <tr>
                            <td class="td">
                                  	  主题
                                </td>
                                <td>
                                    <input type="text" name="subject" value="${notice2.subject}" placeholder="请填写公告主题">
                                </td>
                                <td class="td">通知范围</td>
                                <td>
                                        <select name="receive_id">
                                        		<option>${notice2.receive_id}</option>
                                                <option value="0" selected = "selected">全部</option>
                                                <option value="1">财务部</option>
                                                <option value="2">人事部</option>
                                         </select>
                                </td>
                    </tr>
                  
                    <tr>
                        <td class="box6">内容</td>
                        <td colspan="3">
                            <div class="box7">
							<input type="text" name="text" value="${notice2.text}"placeholder="请填写公告内容">
                            </div>
                        </td>
                    </tr>
                </table>
            
            </div>
            <div class="box8">
                <div class="box9">
                  
                         
                <button type="submit" class="btn btn-primary">保存</button>
                <a href="noticeSelect"><button  type="button" class="btn btn-default">返回</button></a>
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
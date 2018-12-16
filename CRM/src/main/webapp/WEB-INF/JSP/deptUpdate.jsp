<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="http://localhost:8080/CRM/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="bootstrap/js/jquery.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-1.js"></script>
<script type="text/javascript" src="jquery.validate.js"></script>
<script type="text/javascript" src="jquery.validate.min.js"></script>
<script type="text/javascript" src="messages_th.js"></script>
<title>更新部门</title>
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
.box11{
    text-align: center;
    font-size: 18px;
    color: silver;
    margin: 20px 0 0 0;
}
    .table{
        width: 96%;
        height: 30%;
        
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
<s:head/> 
<body>
   
            <div class="box3">
                <div class="box4">
                    <div class="box5"><span style="margin: 30px 0 0 50px";>更新部门</span></div>
                   
        			<form action="deptUpdate" method="post">
        			
        			<input type="hidden" name="d.department_id" value="${d1.department_id}">
                    <div style="margin: 0 0 0 50px">
                        <table border="1" class="table">
                            <tr>
                               
                                <td style="text-align: center;line-height:40px;"><strong>部门名称</strong></td>
                                <td>
                                <input type="text" name="department_name"  value="${d1.department_name}" placeholder="填写角色名称">
                                <s:fielderror fieldName="department_name"/>
                                </td>
                               
                            </tr>
                            <tr>
                                <td style="height:300px;text-align: center;line-height:200px;">
                                <strong>部门描述</strong></td>
                                <td>
                                <input type="text" name="department_desc" value="${d1.department_desc}" placeholder="请填写角色描述">
                                <s:fielderror fieldName="department_desc"/> 
                                </td>
                            </tr>
                           
                        </table>
                    </div>

                    <div class="box8">
                            <div class="box9">
                              
                                     
                             <button type="submit" class="btn btn-primary">保存</button>
               				 <a href="deptSelect"><button type="button" class="btn btn-default">返回</button></a>
                             </div>
                             
                        </div>
            		</form>
                    </div>
                   
                    <div class="box10">
                            <div class="box11"><span>智游教育@2017河南智游臻龙教育科技有限公司</span></div>
                        </div>
                
            </div> 
</body>
<script type="text/javascript">
		$().ready(function(){
			alert:("23");
			
			$("form").validate({
				rules:{
					department_name:{
						required: true,
					},
					department_desc: {
						required: true,
					}
				},
				messages:{
					department_name:{
						required:"请填写部门名称",					
					},
					department_desc:{
						required:"请填写部门简介",
					}
				}
			})
		})
	</script>
</html>
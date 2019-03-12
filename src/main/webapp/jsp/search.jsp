<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="<%=basePath %>js/bootstrap-3.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.0.min.js"></script>

<script src="<%=basePath %>js/bootstrap-3.0.0/js/bootstrap.min.js"></script>

		<script type="text/javascript" src="<%=basePath%>js/jquery.bigautocomplete.js"></script>
		
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/jquery.bigautocomplete.css">
		
<style type="text/css">
#key{
border: #e5e5e5 1px solid ;

border-radius: 5px;

outline: none;

font-size: 16px;
font-style: "微软雅黑";

font-weight: 600;

}

#key:hover{
border: #eeeeee 1px solid ;

border-radius: 5px;
/*动画效果*/
				-webkit-animation-name: shineBlue;/*引用动画*/
				-webkit-animation-duration: 3s;/*持续的时间*/
				-webkit-animation-iteration-count: infinite;/*动画持续的次数*/

}

#btn{
height:38px;

width:60px;

font-size: 16px;

background-color:#418BCA;


border-radius: 5px;

cursor: pointer;

}


	@-webkit-keyframes shineBlue {
				/*定义一个动画*/
				from {
					-webkit-box-shadow: 0 0 9px #333;
				}
				50% {
					-webkit-box-shadow: 0 0 18px #29A7E1;
					border: #3A5FCD 1px solid;
				}
				to {
					-webkit-box-shadow: 0 0 9px #333;
				}
			}

</style>



<script type="text/javascript">
	
	$(function(){

	    $("#key").bigAutocomplete({
	    	
	    	
	   
	    	url:"<%=basePath %>keyword/getListKeyword",
			width:500,
			callback:function(data){
				
				
				var key=data.title;
				
				
			var arr=	key.split(" ");
			
			
			console.log(arr[0])
				
				
				
				
				$("#key").val(arr[0]);
				
				search();
	
			
			}
	    });

	})
	
	function detailSearch(field,name){
		
		
		
		
		var kk="";
		
	
		var url =location.href;
		
		var newr="";
		
		var pp="";
		if(url.indexOf(field+"=")!=-1){
			
			var myarr=url.split("?")[1].split("&");	
			
			for(var i=0;i<myarr.length;i++){
				
				
				if(myarr[i].indexOf(field)!=-1){
					
					myarr[i]=field+"="+name;
				}
				if(myarr.length==i+1){
				pp=pp+myarr[i];
					
				}
				else{
					
				pp=pp+myarr[i]+"&"
				}
			}
			
			newr=url.split("?")[0]+"?"+pp;
			location.href=newr;
	
		}
		else {
			url=url+"&"+field+"="+name;
			location.href=url;

		}
		
		/*	
		
		var arr2 =new Array();
		
	 	var arr=url.split("?")[1].split("&");	
		arr.push(field+"="+name);

	 	//[key=11,brand=xx]
		
		
		for(var i=0;i<arr.length;i++){
			
			if(arr[i].indexOf(field)!=-1){
				arr[i]=field+"="+name;
				
			}
						
		}
		
		
		for(var i=0;i<arr.length;i++){
			
			kk=kk+arr[i]+"&";
			
			
		}
		
		var newurl=url.split("?")[0]+"?"+kk;
		

		
		
		
		
		
		//http://localhost:8080/keyword/search?key=%E6%89%8B%E6%9C%BA&brand=%20iphone&brand=%20%E5%B0%8F%E7%B1%B3
		if(url.cotain(field)){
			
			
			brand=/^{*}$&;
			
			
			
		}
		else {
			url=url+"&"+field+"="+name

		}
		
		
		
		console.log(url); */
		
		
		
		
		
	}
	
	
	function search(){
		
		var keyword=$("#key").val();
		
		if(!keyword){
			
			alert("不能为空");
			
			return;
			
		}
		
		 $.ajax({
             type: "GET",
             url: "<%=basePath %>keyword/addKeyWord",
             data: {key:$("#key").val()},
             dataType: "json",
             success: function(data){
            	 
            	 if(data.ret==1){            		 
            		 
            	location.href="<%=basePath %>keyword/search?key="+$("#key").val();
            		 
            	 }
            	 
            	 
            	 
             }
		 });
		
		
	}
	

</script>

<style type="text/css">



.col-xs-1{

background-color: #eeeeee;

}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body >

<div id="main" style="font-size: 12px;">

		<div class="container-fluid">	


<nav class="navbar navbar-default">


    <div class="navbar-header">



    </div>

	
    <div class="navbar-default" style="max-width: 668px;margin: auto;">
    
    <input class="input" type="text" style="height: 40px;width: 300px;" name='key' id="key" >

<button id="btn" class="btn btn-primary" onclick="search()">查询</button>


     <!--    <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-primary">查询</button>
            
            
            
            
        </form> -->

      
    </div>

</nav>


  <div>
    
    	<ol class="breadcrumb">
  <li><a href="#">${key }</a></li>
</ol>
    
    
    </div>
	
	<div class="row">
	
	
	<c:forEach items="${listF }" var="item">
		<div class="col-xs-12">
		
		<div class="row">
		
		
		<div class="col-xs-1">
		
			${item.categoryPropertyTypeName }：
			
			
		</div>
		
		<div class="col-xs-11">
		
		
		
			<c:forEach items="${item.fieldValue }" var="propertyValue">
			
			
						
					<a  href="javascript:void(0)" onclick="detailSearch('${item.categoryPropertyTypeField }','${propertyValue }')">${propertyValue }</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			
			
			
			
		</c:forEach>
		
		
		</div>
		
		
		</div>
		
		
		

			
		</div>
		
		<hr>
		</c:forEach>	
		<div class="col-xs-12">
		
		<div>
			<c:forEach items="${list }" var="p">
			
			<div style="height: 220px;width: 200px;float: left;margin-left: 20px;border: #eeeeee 1px solid;">
			
			<div style="max-height: 200px;max-width: 140px;float: left;margin-left: 20px;">
			
			
			 <c:if test="${fn:contains(p.name,'男装')}">  
			 
			 
			 			 			<img alt="" src="/img/nn.jpg" height="180" />
			 			 			
			 
                                    </c:if>
                                    
                                    <c:if test="${fn:contains(p.name,'手机')}">  
			 
			 			<img alt="" src="/img/phone.jpg" height="180">
			 
                                    </c:if>
			
			
			
			
			</div>
			
			<div style="float: left;">
			
			
		<div style="color: red;">￥${p.productPrice }</div>	
			
			${p.name }
			
			
			</div>
			</div>
			
			
			
			
			
			</c:forEach>
		
		
		</div>
		
		
		
			
		</div>
		
		
		
		
		
		
		
	</div>
	
	
	</div>
	</div>
</body>
</html>
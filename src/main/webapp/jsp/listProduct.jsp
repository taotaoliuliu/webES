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
		
		
			
			<table class="table table-striped">
			
			
			
			  <thead>
    <tr>
    	
      <th>商品名称</th>
      <th>价格</th>
      <th>得分</th>
    </tr>
  </thead>
  
  
  
  
  
   <tbody>
   
   	
   		<c:forEach items="${list }" var="p">
    <tr>
      <td><a href="/product/editProductUI?id=${p.id }">${p.name }</a>      </td>
      <td>￥${p.productPrice }</td>
      <td>${p.myscore2 }</td>
    </tr>
    
    </c:forEach>
  	
  	
  	
  	
  </tbody>
			</table>				
		</div>
		
		
		
		
		
		
		
	</div>
	
	
</body>
</html>
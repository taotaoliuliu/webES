
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>








<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.0.min.js"></script>
		
		
		
		<script type="text/javascript" src="<%=basePath%>js/jquery.bigautocomplete.js"></script>
		
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/jquery.bigautocomplete.css">
		




<script type="text/javascript">



 $(function(){

	    $("#tt").bigAutocomplete({
	        width:543,
	        data:[{title:"中国好声音",result:{ff:"qq"}},
	        {title:"中国移动网上营业厅"},
	        {title:"中国银行"},
	        {title:"中国移动"},
	        {title:"中国好声音第三期"},
	        {title:"中国好声音 第一期"},
	        {title:"中国电信网上营业厅"},
	        {title:"中国工商银行"},
	        {title:"中国好声音第二期"},
	        {title:"中国地图"}],
	        callback:function(data){
	            alert(data.title);    
	        }
	    });

	})
	 
	
	
	
	
	
	
	
	
	
	
	

</script>

</head>


<body>







<h1>第一搜</h1>

<div style="text-align: center;">


<input class="input" type="text" style="height: 40;width: 300px;" name='key' id="tt" >


</div>








</body>
</html>

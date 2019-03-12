
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>








<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.0.min.js"></script>
		
		
		
		<script type="text/javascript" src="<%=basePath%>js/jquery.bigautocomplete.js"></script>
		
		<script type="text/javascript">
		
		
		var str="";
		
		
	var aa=	str.replace("","");
	
	
		
		</script>
		
		
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




	/* $(function(){

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
	 */
	
	
	
	
	
	
	
	
	
	
	
	$(function(){

	    $("#key").bigAutocomplete({
	    	
	    	
	   
	    	url:"keyword/getListKeyword",
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
	
	
	function search(){
		
		var keyword=$("#key").val();
		
		if(!keyword){
			
			alert("不能为空");
			
			return;
			
		}
		
		 $.ajax({
             type: "GET",
             url: "keyword/addKeyWord",
             data: {key:$("#key").val()},
             dataType: "json",
             success: function(data){
            	 
            	 if(data.ret==1){            		 
            		 
            		 window.open("keyword/search?key="+$("#key").val());
            		 
            	 }
            	 
            	 
            	 
             }
		 });
		
		
	}
	

</script>

</head>


<body>





<div >

<a href="/product/listProduct">商品管理</a>
</div>


<div style="text-align: center;margin-top: 100px;">


<input class="input" type="text" style="height: 40;width: 300px;" name='key' id="key" >

<button id="btn" onclick="search()">查询</button>


</div>








</body>
</html>

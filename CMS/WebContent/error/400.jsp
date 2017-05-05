<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<base href="<%=path%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="HandheldFriendly" content="true">
<meta name="MobileOptimized" content="320">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<link rel="stylesheet" type="text/css" href="css/dandelion.css" media="screen">
<title>400错误页面</title>
</head>
<body>
<body>
 
	<div id="da-wrapper" class="fluid">
    
        <!-- Content -->
        <div id="da-content">
            
            <!-- Container -->
            <div class="da-container clearfix">
            
            	<div id="da-error-wrapper">
                	
                   	<div id="da-error-pin"></div>
                    <div id="da-error-code">
                    	error <span>400</span>                    </div>
                
                	<h1 class="da-error-heading">哎哟喂！好像出现错误了！</h1>
                    <p>大家可以返回上一层检查填写的内容！</p>
                </div>
            </div>
        </div>
        
        <!-- Footer -->
        <div id="da-footer">
        	<div class="da-container clearfix">
           
        </div>
    </div>
    


</body></html>


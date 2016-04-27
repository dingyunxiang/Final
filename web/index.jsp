<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>人事管理系统</title>



<!-- CSS -->
<link href="${pageContext.request.contextPath}/style/css/transdmin.css" rel="stylesheet" type="text/css" media="screen" />
<!--[if IE 6]><link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/style/css/ie6.css" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/style/css/ie7.css" /><![endif]-->

<!-- JavaScripts-->
<script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jNice.js"></script>

</head>

<body>

	<div id="wrapper">
    	<!-- h1 tag stays for the logo, you can use the a tag for linking the index page -->
    	<h1><a href="#"><span>人事管理系统</span></a></h1>
        
        <!-- You can name the links with lowercase, they will be transformed to uppercase by CSS, we prefered to name them with uppercase to have the same effect with disabled stylesheet -->
        <ul id="mainNav">
        	<li><a id="user" href="#" class="press">用户管理</a></li> <!-- Use the "active" class for the active menu item  -->
        	<li><a id ="data" href="#" class="press">数据维护</a></li>
        	<li><a id="yewu" href="#" class="press">业务办理</a></li>
        	<li><a id="baobiao" href="#" class="press">报表查询</a></li>
        	<li class="logout"><a href="#">注销</a></li>
        </ul>
        <!-- // #end mainNav -->
        
        <div id="containerHolder">
			<div id="container">
        		<div id="sidebar">
                        <ul class="sideNav">
                            <li><a href="getAllUser.form" id="allUser" class="user">用户总览</a></li>
                            <li><a href="#"  id="del" class="user">用户删除</a></li>
                            <li><a href="#"  class="user">用户修改</a></li>
                            <li><a href="#" id="add" class="user">添加新用户</a></li>
                        </ul>
                        <!-- // .sideNav -->
                    </div><!-- // .sideNav -->
                </div>
                <!-- // #sidebar -->
                
                <!-- h2 stays for breadcrumbs -->
                <%--<h2><a href="#">Dashboard</a> &raquo; <a href="#" class="active">Print resources</a></h2>--%>
                
                <div id="main">
                    <!-- h2 stays for breadcrumbs -->
                    <h2><a href="#">Dashboard</a> &raquo; <a href="#" class="active">Print resources</a></h2>
                	<form action="" class="jNice">
					<h3>Sample section</h3>
                    	<table cellpadding="0" cellspacing="0">
							<tr>
                                <td>Vivamus rutrum nibh in felis tristique vulputate</td>
                                <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                            </tr>                        
							<tr class="odd">
                                <td>Duis adipiscing lorem iaculis nunc</td>
                                <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                            </tr>                        
							<tr>
                                <td>Donec sit amet nisi ac magna varius tempus</td>
                                <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                            </tr>                        
							<tr class="odd">
                                <td>Duis ultricies laoreet felis</td>
                                <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                            </tr>                        
							<tr>
                                <td>Vivamus rutrum nibh in felis tristique vulputate</td>
                                <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                            </tr>                        
                        </table>
					<h3>Another section</h3>
                    	<fieldset>
                        	<p><label>Sample label:</label><input type="text" class="text-long" /></p>
                        	<p><label>Sample label:</label><input type="text" class="text-medium" /><input type="text" class="text-small" /><input type="text" class="text-small" /></p>
                            <p><label>Sample label:</label>
                            <select>
                            	<option>Select one</option>
                            	<option>Select two</option>
                            	<option>Select tree</option>
                            	<option>Select one</option>
                            	<option>Select two</option>
                            	<option>Select tree</option>
                            </select>
                            </p>
                        	<p><label>Sample label:</label><textarea rows="1" cols="1"></textarea></p>
                            <input type="submit" value="Submit Query" />
                        </fieldset>
                    </form>
                </div>
                <!-- // #main -->
                
                <div class="clear"></div>
            </div>
            <!-- // #container -->
        <<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main/main.js"></script>/div>
        <!-- // #containerHolder -->
        
        <p id="footer">Feel free to use and customize it. <a href="http://www.perspectived.com">Credit is appreciated.</a></p>
    </div>
    <script>
        $("#data").click(function(){
            $("#sidebar").load("data.jsp");
            $(".press").removeClass("active");
            $(this).addClass("active");
            return false;
        })
        $("#user").click(function(){
            $("#sidebar").load("user.jsp");
            $(".press").removeClass("active");
            $(this).addClass("active");
            return false;
        })
        $("#yewu").click(function(){
            $("#sidebar").load("yewu.jsp");
            $(".press").removeClass("active");
            $(this).addClass("active");
            return false;
        })
        $("#baobiao").click(function(){
            $("#sidebar").load("baobiao.jsp");
            $(".press").removeClass("active");
            $(this).addClass("active");
            return false;
        })

        $("#allUser").click(function(){
            $("#main").load("allUser.jsp");
            $(".user").removeClass("active");
            $(this).addClass("active");
            return false;
        })
        $("#del").click(function(){
            $("#main").load("aa.jsp");
            $(".user").removeClass("active");
            $(this).addClass("active");
            return false;
        })
        $("#add").click(function(){
            $("#main").load("addUser.jsp");
            $(".user").removeClass("active");
            $(this).addClass("active");
            return false;
        })
    </script>

    <!-- // #wrapper -->

</body>
</html>

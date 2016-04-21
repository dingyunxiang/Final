<%--
  Created by IntelliJ IDEA.
  User: dingyunxiang
  Date: 16/4/17
  Time: 下午8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Paper Stack</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main/login.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main/login.js"></script>
</head>
<body>
<div class="container">


    <section id="content">
        <form action="" method="post">
            <h1>人事管理系统</h1>
            <div >
                <input type="text" class="text" placeholder="Username" required="" id="username" name="username" />
            </div >
            <div >
                <input type="password" class = "text" placeholder="Password" required="" id="password" name="password" />
            </div>
            <div>
                <input id="button" type="button" value="Log in" />
                <a href="#">Lost your password?</a>
                <%--<a href="#">Register</a>--%>
            </div>
        </form>
    </section><!-- content -->
</div><!-- container -->
</body>
</html>
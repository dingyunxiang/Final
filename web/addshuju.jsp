<%--
  Created by IntelliJ IDEA.
  User: dingyunxiang
  Date: 16/4/20
  Time: 下午4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="main">
    <form action="" class="jNice">

        <h3>添加数据</h3>
        <fieldset>
            <p><label>用户名：</label><input type="text" id="addUser_username" class="text-long addUser_username" /></p>
            <p><label>密码：</label><input type="text" id="addUser_password" class="text-long addUser_assword" /></p>
            <p><label>确认密码：</label><input type="text" id="addUser_repassword" class="text-long addUser_password" /></p>
            <input id="addUser" type="button" value="确认添加" />
        </fieldset>
    </form>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main/main.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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

        <h3>所有用户</h3>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th>序号</th>
                <th>用户名</th>
                <th>密码</th>
            </tr>
             <c:forEach items="${users}" var="user">
                <tr>
                    <td>1</td>
                    <td>${ele.username}</td>
                    <td>${ele.password}</td>
                    <td class="action"><a href="#" class="view">View</a><a href="#" class="edit">Edit</a><a href="#" class="delete">Delete</a></td>
                </tr>
             </c:forEach>
        </table>
</div>

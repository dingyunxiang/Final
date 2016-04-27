
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main">

    <h3>所有数据</h3>
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
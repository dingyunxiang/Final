<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


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
                <td>序号</td>
                <td>用户名</td>
                <td>密码</td>
            </tr>
             <c:forEach items="${list}" var="user">
                <tr>
                    <td>1</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td class="action"><a href="#" class="view" shu="${user.id}">View</a><a href="#" shu="${user.id}" class="edit">Edit</a><a href="#"shu="${user.id}" class="delete">Delete</a></td>
                </tr>
             </c:forEach>
        </table>
</div>

<script type="text/javascript">
    $(".delete").click(function(){
        var id = $(this).attr("shu");
        console.log(id);
        var data1 = {
            id: id
        }
        $.ajax({
            type : 'POST',
            dataType:"json",
            data:data1,
            url : 'delUser.form',
            success : function (data) {
                if(data.result == "success"){
                    $("#main").load('getAllUser.form');
                }else{
                    alert("删除失败");
                }
            },
            error:function(){
                console.log("Internet Error!");
            }
        });
    });

    $(".view").click(function(){
        var id = $(this).attr("shu");
        // console.log(id);
        var data1 = {
            id: id
        }
        // $("#main").load('getShequ.form',data1);

    });

    $(".edit").click(function(){
        var id = $(this).attr("shu");
        // console.log(id);
        var data1 = {
            id: id
        }
        $("#main").load('getUser.form',data1);
    });

</script>

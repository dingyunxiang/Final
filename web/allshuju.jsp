<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main">

    <h3>所有数据</h3>
    <table cellpadding="0" cellspacing="0">
        <tr>
            <td>序号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
        </tr>
        <c:forEach items="${list}" var="shuju">
            <tr>
                <td>1</td>
                <td>${shuju.name}</td>
                <td>${shuju.sex}</td>
                <td>${shuju.phone}</td>
                <td class="action"><a href="#" shu="${shuju.id}" class="view">View</a><a href="#" shu="${shuju.id}" class="edit">Edit</a><a shu="${shuju.id}" href="#" class="delete">Delete</a></td>
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
            url : 'delCyry.form',
            success : function (data) {
                if(data.result == "success"){
                    $("#main").load('getAllCyry.form');
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
        $("#main").load('getShuju.form',data1);
    });


</script>
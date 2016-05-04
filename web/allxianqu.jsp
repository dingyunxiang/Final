<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main">

    <a href="downloadShengshi.form">答应报表</a>

    <h3>所有县区</h3>
    <table cellpadding="0" cellspacing="0">
        <tr>
            <td>序号</td>
            <td>省市名称</td>
            <td></td>
        </tr>
        <c:forEach items="${list}" var="ele" varStatus="index">
            <tr>
                <td>${index.count}</td>
                <td>${ele.county}</td>
                <td class="action"><a href="#" shu="${ele.id}" class="view">View</a><a href="#" shu="${ele.id}" class="edit">Edit</a><a href="#" shu="${ele.id}" class="delete">Delete</a></td>
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
            url : 'delShengshi.form',
            success : function (data) {
                if(data.result == "success"){
                    $("#main").load('getAllShengshi.form');
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
        $("#main").load('getShengshi.form',data1);
    });

</script>
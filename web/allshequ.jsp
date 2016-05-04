
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="main">

    <h3>所有社区</h3>
    <table cellpadding="0" cellspacing="0">
        <tr>
            <td>序号</td>
            <td>社区名</td>
            <td></td>
        </tr>
        <c:forEach items="${list}" var="ele" varStatus="index">
            <tr>
                <td>${index.count}</td>
                <td>${ele.community}</td>
                <td class="action"><a  href="#" class="view" shu="${ele.id}">View</a><a shu="${ele.id}" href="#" class="edit">Edit</a><a shu="${ele.id}" href="#" class="delete">Delete</a></td>
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
            url : 'delShequ.form',
            success : function (data) {
                if(data.result == "success"){
                    $("#main").load('getAllShequ.form');
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
        $("#main").load('getShequ.form',data1);
    });

</script>
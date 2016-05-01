<%--
  Created by IntelliJ IDEA.
  User: dingyunxiang
  Date: 16/4/20
  Time: 下午4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="main">
    <form action="" class="jNice">

        <h3>修改社区</h3>
        <fieldset>
            <p><label>社区名：</label><input type="text" id="addShequ1_community" value="${shequ.community}" shu1="${shequ.id}" class="text-long addUser_username" /></p>
            <input id="addShequ1" type="button" value="确认添加" />
        </fieldset>
    </form>
</div>
<script type="text/javascript"  >
    $("#addShequ1").click(function(){
        var community = $("#addShequ1_community").val();
        var id= $("#addShequ1_community").attr("shu1");
        if(community == ""){
            $(".addShequ1_community").addClass("error");
        }else{
            var data1={
                id:id,
                community:community
            }
            $.ajax({
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'updateShequ.form',
                success : function (data) {
                    if(data.result == "success"){
                        alert("修改成功");
                    }else{
                        $(".addShequ1_community").addClass("error");
                    }
                },
                error:function(){
                    console.log("Internet Error!");
                }
            });
        }

    });

</script>
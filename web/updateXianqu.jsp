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

        <h3>修改省区</h3>
        <fieldset>
            <p><label>省区名称</label><input type="text" shu="${shengshi.id}" value="${shengshi.county}" id="addXianqu_county" class="text-long addUser_username" /></p>
            <input id="addXianqu11" type="button" value="确认添加" />
        </fieldset>
    </form>
</div>

<script type="text/javascript"  >
    $("#addXianqu11").click(function(){
        var county = $("#addXianqu_county").val();
        var id= $("#addXianqu_county").attr("shu");
        if(county == ""){
            $(".addXianqu_county").addClass("error");
        }else{
            var data1={
                id:id,
                county:county
            }
            $.ajax({
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'updateShengshi.form',
                success : function (data) {
                    if(data.result == "success"){
                        alert("修改成功");
                    }else{
                        $(".addXianqu_county").addClass("error");
                    }
                },
                error:function(){
                    console.log("Internet Error!");
                }
            });
        }

    });

</script>

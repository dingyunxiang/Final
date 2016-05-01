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

        <h3>添加社区</h3>
        <fieldset>
            <p><label>社区名：</label><input type="text" id="addShequ1_community" class="text-long addUser_username" /></p>
            <input id="addShequ1" type="button" value="确认添加" />
        </fieldset>
    </form>
</div>
<script type="text/javascript"  >
    $("#addShequ1").click(function(){
        var community = $("#addShequ1_community").val();
        console.log(community);
        if(community == ""){
            $(".addShequ1_community").addClass("error");
        }else{
            var data1={
                community:community,
            }
            $.ajax({
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'addShequ.form',
                success : function (data) {
                    if(data.result == "success"){
                        alert("添加成功");
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
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

        <h3>复合删除</h3>
        <fieldset>
            <p><label>按社区删除</label><input type="text" id="shequname" class="text-long" /></p>
            <input id="delByShequ" type="button" value="确认删除" />
        </fieldset>

        <input id="delAll" value="删除全部数据" type="button">
    </form>
</div>

<script type="text/javascript">
    $("#delByShequ").click(function(){
        var id = $("#shequname").val();
        var data1={
            id:id
        }
        console.log(data1);
        $.ajax({
            type : 'POST',
            dataType:"json",
            data:data1,
            url : 'delShujuByShequ.form',
            success : function (data) {
                if(data.result == "success"){
                    alert("删除成功");
                }else{
                    //$(".addShequ1_community").addClass("error");
                    console.log("删除失败");
                }
            },
            error:function(){
                console.log("Internet Error!");
            }
        });
    });


</script>

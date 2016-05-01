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

        <h3>修改用户用户</h3>
        <fieldset>
            <p><label>用户名：</label><input type="text" value="${user.username}" shu="${user.id}" id="addUser_username" class="text-long addUser_username" /></p>
            <p><label>密码：</label><input type="text" id="addUser_password" class="text-long addUser_assword" /></p>
            <p><label>确认密码：</label><input type="text" id="addUser_repassword" class="text-long addUser_password" /></p>
            <input id="addUser" type="button" value="确认添加" />
        </fieldset>
    </form>
</div>

<script type="text/javascript"  >
    $("#addUser").click(function(){
        var id = $("#addUser_username").attr("shu");
        var account = $("#addUser_username").val();
        var password = $("#addUser_password").val();
        var repassword = $("#addUser_repassword").val();
        if(account == "" || password == "" || password!=repassword) {
            $(".text").addClass("error");
        }else {
            var data1 = {
                id:id,
                username: account,
                password: password
            }


            $.ajax({
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'updateUser.form',
                success : function (data) {
                    if(data.result == "success"){
                        alert("修改成功");
                    }else{
                        $(".text").addClass("error");
                    }
                },
                error:function(){
                    console.log("Internet Error!");
                }
            });
        }

    });

</script>
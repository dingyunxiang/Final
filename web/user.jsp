<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="sidebar">
    <ul class="sideNav">
        <li><a href="#" id="allUser" class="user">用户总览</a></li>
        <li><a href="#"  id="del" class="user">用户删除</a></li>
        <li><a href="#"  class="user">用户修改</a></li>
        <li><a href="#" class="user">添加新用户</a></li>
    </ul>



    <!-- // .sideNav -->
</div>

<script>
    $("#allUser").click(function(){
        $("#main").load("allUser.jsp");
        $(".user").removeClass("active");
        $(this).addClass("active");
        return false;
    })
    $("#del").click(function(){
        $("#main").load("aa.jsp");
        $(".user").removeClass("active");
        $(this).addClass("active");
        return false;
    })
</script>
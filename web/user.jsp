<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="sidebar">
    <ul class="sideNav">
        <li><a href="getAllUser.form" id="allUser" class="user">用户总览</a></li>
        <li><a href="#" id="add" class="user">添加新用户</a></li>
    </ul>



    <!-- // .sideNav -->
</div>

<script>
    $("#allUser").click(function(){
        $("#main").load("getAllUser.form");
        $(".user").removeClass("active");
        $(this).addClass("active");

        return false;
    });
    $("#add").click(function(){
        $("#main").load("addUser.jsp");
        $(".user").removeClass("active");
        $(this).addClass("active");
        return false;
    });
</script>
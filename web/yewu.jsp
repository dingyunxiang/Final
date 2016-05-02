<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<div id="sidebar">
    <ul class="sideNav">
        <li><a href="#"  class="yewu" id="addshuju">数据录入</a></li>
        <li><a href="#" class="yewu" id="fuheshanchu">复杂删除</a></li>
        <li><a href="#" class="yewu" id="allshuju" >记录浏览</a></li>
    </ul>
    <!-- // .sideNav -->
    <script type="text/javascript">

        $("#addshuju").click(function(){
            $("#main").load("addShuju.form");
            $(".yewu").removeClass("active");
            $(this).addClass("active");
            return false;
        });
        $("#fuheshanchu").click(function(){
            $("#main").load("fuheshanchu.jsp");
            $(".yewu").removeClass("active");
            $(this).addClass("active");
            return false;
        });
        $("#allshuju").click(function(){
            $("#main").load("getAllCyry.form");
            $(".yewu").removeClass("active");
            $(this).addClass("active");
            return false;
        });


    </script>
</div>
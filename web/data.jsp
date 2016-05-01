<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="sidebar">
    <ul class="sideNav">
        <li><a href="#" id="allShequ" class="data">社区维护</a></li>
        <li><a href="#"  id="allXianqu" class="data">县区维护</a></li>
        <li><a href="#" id="addShequ" class="data">增加社区</a></li>
        <li><a href="#"  id="addXianqu" class="data">增加县区</a></li>
    </ul>
    <!-- // .sideNav -->

    <script type="text/javascript">
        $("#allShequ").click(function(){
            $("#main").load('getAllShequ.form');
            $(".data").removeClass("active");
            $(this).addClass("active");
            return false;
        });
        $("#allXianqu").click(function(){
            $("#main").load('getAllShengshi.form');
            $(".data").removeClass("active");
            $(this).addClass("active");
            return false;
        });
        $("#addShequ").click(function(){
            $("#main").load("addShequ.jsp");
            $(".data").removeClass("active");
            $(this).addClass("active");
            return false;
        });
        $("#addXianqu").click(function(){
            $("#main").load("addXianqu.jsp");
            $(".data").removeClass("active");
            $(this).addClass("active");
            return false;
        });

    </script>
</div>
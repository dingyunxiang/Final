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
    <form action="uploadShengshi.form" class="jNice" method="post" enctype="multipart/form-data">

        <h3>从文件导入省市</h3>
        <fieldset>
            <p><label>上传文件</label><input  type="file" name="shengshifile"   class="text-long addUser_username" /></p>
            <input  type="submit" value="确认添加" />
        </fieldset>
    </form>

    <form action="uploadShequ.form" class="jNice" method="post" enctype="multipart/form-data">

        <h3>从文件导入社区</h3>
        <fieldset>
            <p><label>上传文件</label><input  type="file" name="shequfile"   class="text-long addUser_username" /></p>
            <input  type="submit" value="确认添加" />
        </fieldset>
    </form>

</div>
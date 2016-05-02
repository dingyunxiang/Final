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


        <h3>添加数据</h3>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <td><input type="checkbox"  id="street" class="text-long addShuju" /><label for="street">街道办事处</label></td>
                <td><input type="checkbox" id="id" class="text-long addShuju" /><label for="id">人员编号</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="name"  class="text-long addShuju" /><label for="name">人员姓名</label></td>
                <td><input type="checkbox" id="sex" class="text-long addShuju" /><label for="sex">人员性别</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="card"  class="text-long addShuju" /><label for="card">身份证号</label></td>
                <td><input type="checkbox" id="birth" class="text-long addShuju" /><label for="birth">出生年月</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="identity"  class="text-long addShuju" /><label for="identity">本人身份</label></td>
                <td><input type="checkbox" id="education" class="text-long addShuju" /><label for="education">文化程度</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="isworking"  class="text-long addShuju" /><label for="isworking">原工作单位</label></td>
                <td><input type="checkbox"  id= "unitnature" class="text-long addShuju"/><label for="unitnature">单位性质</label> </td>
            </tr>
            <tr>
                <td><input type="checkbox" id="skill"  class="text-long addShuju" /><label for="skill">技术特长</label></td>
                <td><input type="checkbox" id="skilllevel" class="text-long addShuju" /><label for="skilllevel">技术等级</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="health"  class="text-long addShuju" /><label for="health">健康状况</label></td>
                <td><input type="checkbox" id="isenjoybenefit" class="text-long addShuju" /><label for="isenjoybenefit">是否享受低保</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="elsehaha"  class="text-long addShuju" /><label for="elsehaha">其它</label></td>
                <td><input type="checkbox" id="monthenjoysalary"  class="text-long addShuju" /><label for="monthenjoysalary">月享受金额</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="isenjoyloan"  class="text-long addShuju" /><label for="isenjoyloan">是否享受贷款</label></td>
                <td><input type="checkbox" id="loannumber" class="text-long addShuju" /><label for="loannumber">贷款金额</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="isreceivereemployee"  class="text-long addShuju" /><label
                        for="isreceivereemployee">是否取得再就业优惠证</label></td>
                <td><input type="checkbox" id="reemployeeid" class="text-long addShuju" /><label for="reemployeeid">再就业优惠证号码</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="locatecounty" class="text-long addShuju" /><label for="locatecounty">所在县/市</label></td>
                <td><input type="checkbox" id="loactecommunity" class="text-long addShuju" /><label for="loactecommunity">所在社区</label></td>
            </tr>

            <tr>
                <td><input type="checkbox"  id="monthsalary" class="text-long addShuju" /><label for="monthsalary">月劳动收入</label></td>
                <td><input type="checkbox" id="dependent" class="text-long addShuju" /><label for="dependent">用人单位名称</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="post"  class="text-long addShuju" /><label for="post">职务或工种</label></td>
                <td><input type="checkbox" id="iscontract" class="text-long addShuju" /><label for="iscontract">是否签订劳务合同</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="contractstarttime" class="text-long addShuju" /><label for="contractstarttime">合同开始时间</label></td>
                <td><input type="checkbox" id="constractendtime"  class="text-long addShuju" /><label for="constractendtime">合同结束时间</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="engageproject" class="text-long addShuju" /><label for="engageproject">个体经营项目</label></td>
                <td><input type="checkbox" id="engageplace" class="text-long addShuju" /><label for="engageplace">经营地点</label></td>
            </tr>
            <tr>
                <td><input type="checkbox" id="ishavinglicense"  class="text-long addShuju" /><label for="ishavinglicense">是否领取工商执照</label></td>
                <td><input type="checkbox" id="workinputplace" class="text-long addShuju" /><label for="workinputplace">劳务输出地址</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="job" class="text-long addShuju" /><label for="job">从事什么职业</label></td>
                <td><input type="checkbox" id="freejobtype" class="text-long addShuju" /><label for="freejobtype">自由职业类型</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="whichtrain" class="text-long addShuju" /><label for="whichtrain">想参加何种培训</label></td>
                <td><input type="checkbox" id="phone"  class="text-long addShuju" /><label for="phone">招工招聘联系电话</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="contactman" class="text-long addShuju" /><label for="contactman">联系人</label></td>
                <td><input type="checkbox"  id="ismanageput" class="text-long addShuju" /><label for="ismanageput">是否办理一次性安置</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="jobwanting" class="text-long addShuju" /><label for="jobwanting">是否有求职要求</label></td>
                <td><input type="checkbox" id="manpowermacket" class="text-long addShuju" /><label for="manpowermacket">是否在劳动力市场登记</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"  id="isotherprovice" class="text-long addShuju" /><label for="isotherprovice">是否打算去外省务工</label></td>
                <td><input type="checkbox" id="layofftime"  class="text-long addShuju" /><label for="layofftime">合同结束时间</label></td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <input type="button" value="反选" onclick="allfocus()"/>
                    <input type="button" value="全选" onclick="allfocus1()"/>
                    <form action="downloadShujuByDiy.form" method="post" class="jNice" id="form1">
                        <input type="hidden" name="array1" id="valPost">
                    <input type="button" value="提交" id="addShuju1" onclick="submit1()"/>
                    </form>
                </td>
            </tr>

        </table>


    <script>
        function allfocus(){
            $(".addShuju").each(function(){
                if($(this).attr("checked")){
                    $(this).attr("checked",false);
                }else{
                     $(this).attr("checked",true);
                }

            });
        }
        function allfocus1(){
            $(".addShuju").each(function(){
                    $(this).attr("checked",true);

            });
        }
        function submit1(){
            var data = {
                array1:[]
            }
            $(".addShuju").each(function() {
                if($(this).attr("checked")) {
                    console.log($(this).attr("id"));
                    data.array1.push($(this).attr('id'));
                }
            });

            var form = $("#form1");
            var input1 = $("#valPost");
            input1.attr('value', data.array1);
            form.submit();
    }
    </script>
</div>
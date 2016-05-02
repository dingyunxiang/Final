<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dingyunxiang
  Date: 16/4/20
  Time: 下午4:15
  To change this template use File | Settings | File Templates.
--%>
<style>
    .title-span {
        display: inline-block;
        width: 120px;
    }
</style>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="main">
    <form action="" class="jNice">

        <h3>添加数据</h3>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <span class="title-span">街道办事处</span><input type="text" id="street" value="${cyry.street}"class="text-long addShuju"/>
                </td>
                <td>
                    <span class="title-span">人员编号</span><input type="text" id="id" value="${cyry.id}" class="text-long addShuju"/>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="title-span">人员姓名</span><input type="text" id="name"  value="${cyry.name} class="text-long addShuju"/>
                </td>
                <td>
                    <span class="title-span">人员性别</span><input type="text" id="sex" value="${cyry.sex}" class="text-long addShuju"/>
                </td>
            </tr>
            <tr>
                <td><span class="title-span">身份证号</span><input type="text" id="card" value="${cyry.card}" class="text-long addShuju"/> </td>
                <td><span class="title-span">出生年月</span><input type="text" id="birth" value="${cyry.birth}" class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">本人身份</span><input type="text" id="identity" value="${cyry.identity}" class="text-long addShuju"/></td>
                <td><span class="title-span">文化程度</span><input type="text" id="education" value="${cyry.education}" class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">原工作单位</span><input type="text" id="isworking" value="${cyry.isworking}"  class="text-long addShuju"/></td>
                <td><span class="title-span">单位性质</span><input type="text" id="unitnature"  value="${cyry.unitnature}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">技术特长</span><input type="text" id="skill" value="${cyry.skill}"  class="text-long addShuju"/></td>
                <td><span class="title-span">技术等级</span><input type="text" id="skilllevel" value="${cyry.skilllevel}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">健康状况</span><input type="text" id="health" value="${cyry.health}"  class="text-long addShuju"/></td>
                <td><span class="title-span">是否享受低保</span>
                        <select id="isenjoybenefit" class="addShuju" >
                            <option value="${cyry.isenjoybenefit}">${cyry.isenjoybenefit}</option>
                            <option value="是">是</option>
                            <option value="否">否</option>
                        </select>
                </td>
            </tr>
            <tr>
                <td><span class="title-span">其它</span><input type="text" id="elsehaha" value="${cyry.elsehaha}"  class="text-long addShuju"/></td>
                <td><span class="title-span">月享受金额</span><input type="text" value="${cyry.monthenjoysalary}"  id="monthenjoysalary" class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">是否享受贷款</span>
                    <select id="isenjoyloan" class="addShuju" >
                        <option value="${cyry.isenjoyloan}">${cyry.isenjoyloan}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
                <td><span class="title-span">贷款金额</span><input type="text" id="loannumber" value="${cyry.loannumber}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">是否取得再就业优惠证</span>
                    <select id="isreceivereemployee" class="addShuju" >
                        <option value="${cyry.isreceivereemployee}">${cyry.isreceivereemployee}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
                <td><span class="title-span">再就业优惠证号码</span><input type="text" id="reemployeeid" value="${cyry.reemployeeid}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">所在县/市</span>
                    <select id="locatecounty" class="addShuju" >
                        <option value="${cyry.locatecounty}">${cyry.locatecounty}</option>
                        <c:forEach items="${shengshi}" var="ele" >
                            <option value="${ele.county}">${ele.county}</option>
                        </c:forEach>

                    </select>
                </td>
                <td><span class="title-span">所在社区</span>
                    <select id="loactecommunity" class="addShuju" >
                        <option value="${cyry.loactecommunity}">${cyry.loactecommunity}</option>
                        <c:forEach items="${shequ}" var="ele" >
                            <option value="${ele.community}">${ele.community}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td><span class="title-span">月劳动收入</span><input type="text" id="monthsalary" value="${cyry.monthsalary}"  class="text-long addShuju"/></td>
                <td><span class="title-span">用人单位名称</span><input type="text" id="dependent"value="${cyry.dependent}"   class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">职务或工种</span><input type="text" id="post" value="${cyry.post}"  class="text-long addShuju"/></td>
                <td><span class="title-span">是否签订劳务合同</span>

                    <select id="iscontract" class="addShuju" >
                        <option value="${cyry.iscontract}">${cyry.iscontract}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><span class="title-span">合同开始时间</span><input type="text" id="contractstarttime"value="${cyry.contractstarttime}"   class="text-long addShuju"/></td>
                <td><span class="title-span">合同结束时间</span><input type="text" id="constractendtime" value="${cyry.constractendtime}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">个体经营项目</span><input type="text" id="engageproject" value="${cyry.engageproject}"  class="text-long addShuju"/></td>
                <td><span class="title-span">经营地点</span><input type="text" id="engageplace"value="${cyry.engageplace}"   class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">是否领取工商执照</span>

                    <select id="ishavinglicense" class="addShuju" >
                        <option value="${cyry.ishavinglicense}">${cyry.ishavinglicense}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
                <td><span class="title-span">劳务输出地址</span><input type="text" id="workinputplace"value="${cyry.workinputplace}"   class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">从事什么职业</span><input type="text" id="job" value="${cyry.job}"  class="text-long addShuju"/></td>
                <td><span class="title-span">自由职业类型</span><input type="text" id="freejobtype" value="${cyry.freejobtype}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">想参加何种培训</span><input type="text" id="whichtrain" value="${cyry.whichtrain}"  class="text-long addShuju"/></td>
                <td><span class="title-span">招工招聘联系电话</span><input type="text" id="phone" value="${cyry.phone}"  class="text-long addShuju"/></td>
            </tr>
            <tr>
                <td><span class="title-span">联系人</span><input type="text" id="contactman"value="${cyry.contactman}"   class="text-long addShuju"/></td>
                <td><span class="title-span">是否办理一次性安置</span>

                    <select id="ismanageput" class="addShuju" >
                        <option value="${cyry.ismanageput}">${cyry.ismanageput}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                 </td>
            </tr>
            <tr>
                <td><span class="title-span">是否有求职要求</span>

                    <select id="jobwanting" class="addShuju" >
                        <option value="${cyry.jobwanting}">${cyry.jobwanting}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                 </td>
                <td><span class="title-span">是否在劳动力市场登记</span>

                    <select id="manpowermacket" class="addShuju" >
                        <option value="${cyry.manpowermacket}">${cyry.manpowermacket}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><span class="title-span">是否打算去外省务工</span>

                    <select id="isotherprovice" class="addShuju" >
                        <option value="${cyry.isotherprovice}">${cyry.isotherprovice}</option>
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select>
                </td>
                <td><span class="title-span">合同结束时间</span><input type="text" value="${cyry.layofftime}"  id="layofftime" class="text-long addShuju"/></td>
            </tr>

            <tr>
                <td></td>
                <td> <input type="button" value="提交" id="addShuju1"/></td>
            </tr>

        </table>

    </form>
</div>

<script type="text/javascript">


    $("#addShuju1").click(function () {
        var data1 = {};
       // console.log("是否享受低保："+$("#isenjoyloan").val());
        var a = false;
        $(".addShuju").each(function () {
            var name = $(this).attr("id");
            // console.log("name"+name);
            var val = $(this).val();
            // console.log("val: "+val);
            if (val != "") {
                a = true;
                data1[name] = val;
              //  console.log(data1[name]);
            }

        });
        if($("#name").val == ""){
            alert("姓名不能为空");
        }else {
            console.log("data1:" + data1);
            $.ajax({
                type: 'POST',
                dataType: "json",
                data: data1,
                url: 'addCyry.form',
                success: function (data) {
                    if (data.result == "success") {
                        alert("添加成功");
                    } else {
                        console.log("添加失败");
                    }
                },
                error: function () {
                    console.log("Internet Error!");
                }
            });
        }

    });

</script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jNice.js"></script>--%>
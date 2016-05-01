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

        <h3>添加数据</h3>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <td>街道办事处<input type="text"  id="street" class="text-long addShuju" /></td>
                <td>人员编号<input type="text" id="id" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>人员姓名<input type="text" id="name"  class="text-long addShuju" /></td>
                <td>人员性别<input type="text" id="sex" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>身份证号<input type="text" id="card"  class="text-long addShuju" /></td>
                <td>出生年月<input type="text" id="birth" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>本人身份<input type="text" id="identity"  class="text-long addShuju" /></td>
                <td>文化程度<input type="text" id="education" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>原工作单位<input type="text" id="isworking"  class="text-long addShuju" /></td>
               <td>单位性质<input type="text"  id= "unitnature" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>技术特长<input type="text" id="skill"  class="text-long addShuju" /></td>
                <td>技术等级<input type="text" id="skilllevel" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>健康状况<input type="text" id="health"  class="text-long addShuju" /></td>
                <td>是否享受低保<input type="text" id="isenjoybenefit" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>其它<input type="text" id="elsehaha"  class="text-long addShuju" /></td>
                <td>月享受金额<input type="text" id="monthenjoysalary"  class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>是否享受贷款<input type="text" id="isenjoyloan"  class="text-long addShuju" /></td>
                <td>贷款金额<input type="text" id="loannumber" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>是否取得再就业优惠证<input type="text" id="isreceivereemployee"  class="text-long addShuju" /></td>
                <td>再就业优惠证号码<input type="text" id="reemployeeid" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>所在县/市<input type="text"  id="locatecounty" class="text-long addShuju" /></td>
                <td>所在社区<input type="text" id="loactecommunity" class="text-long addShuju" /></td>
            </tr>

            <tr>
                <td>月劳动收入<input type="text"  id="monthsalary" class="text-long addShuju" /></td>
                <td>用人单位名称<input type="text" id="dependent" class="text-long addShuju" /></td>
            </tr>tr>
                <td>职务或工种<input type="text" id="post"  class="text-long addShuju" /></td>
                <td>是否签订劳务合同<input type="text" id="is" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>合同开始时间<input type="text"  id="contractstarttime" class="text-long addShuju" /></td>
                <td>合同结束时间<input type="text" id="constractendtime"  class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>个体经营项目<input type="text"  id="engageproject" class="text-long addShuju" /></td>
                <td>经营地点<input type="text" id="engageplace" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>是否领取工商执照<input type="text" id="ishavinglicense"  class="text-long addShuju" /></td>
                <td>劳务输出地址<input type="text" id="workinputplace" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>从事什么职业<input type="text"  id="job" class="text-long addShuju" /></td>
                <td>自由职业类型<input type="text" id="freejobtype" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>想参加何种培训<input type="text"  id="whichtrain" class="text-long addShuju" /></td>
                <td>招工招聘联系电话<input type="text" id="phone"  class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>联系人<input type="text"  id="contactman" class="text-long addShuju" /></td>
                <td>是否办理一次性安置<input type="text"  id="" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>是否有求职要求<input type="text"  id="jobwanting" class="text-long addShuju" /></td>
                <td>是否在劳动力市场登记<input type="text" id="manpowermacket" class="text-long addShuju" /></td>
            </tr>
            <tr>
                <td>是否打算去外省务工<input type="text"  id="isotherprovice" class="text-long addShuju" /></td>
                <td>合同结束时间<input type="text" id="layofftime"  class="text-long addShuju" /></td>
            </tr>



        </table>
        <input tpye="button" value="提交" id="addShuju1"/>
    </form>
</div>

<script type="text/javascript">
    $("#addShuju1").click(function(){
        var data1 = [];
        $(".addShuju").each(function(){
            var name = $(this).attr("id").toString();
            var val = $(this).val();
            console.log("val: "+val);
            if(val!=""){
                var ele = {name: val};
                console.log("ele:"+ele);
                data1.push(ele);
            }

        });

        console.log("data1:"+data1);
//        if(community == ""){
//            $(".addShequ1_community").addClass("error");
//        }else{
//            var data1={
//                community:community,
//            }
//            $.ajax({
//                type : 'POST',
//                dataType:"json",
//                data:data1,
//                url : 'addShequ.form',
//                success : function (data) {
//                    if(data.result == "success"){
//                        alert("添加成功");
//                    }else{
//                        $(".addShequ1_community").addClass("error");
//                    }
//                },
//                error:function(){
//                    console.log("Internet Error!");
//                }
//            });
//        }

    });

</script>
$(function () {
    $("#button").click(function () {
        var account = $("#username").val();
        var password = $("#password").val();
        if(account == "" || password == "") {
            $(".text").addClass("error");
        }else {
            var data1 = {
                username: account,
                password: password
            }

            //console.log(account + password);

            $.ajax({
                //async : true,
                //cache : false,
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'login.form',
                success : function (data) {
                    if(data.result == "success"){
                        location.href="index.jsp";
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
});
$(function () {
    $("#addUser").click(function(){
        var username = $("#addUser_username").val();
        var password = $("#addUser_password").val();
        var repassword = $("#addUser_repassword").val();
        if(password != repassword){
            $(".addUser_password").addClass("error");
        }else{
            var data1={
                username:username,
                password:password
            }
            $.ajax({
                type : 'POST',
                dataType:"json",
                data:data1,
                url : 'addUser.form',
                success : function (data) {
                    if(data.result == "success"){
                        location.href="index.jsp";
                    }else{
                        $(".addUser_username").addClass("error");
                    }
                },
                error:function(){
                    console.log("Internet Error!");
                }
            });
        }

    });
});

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>车行无忧后台管理系统</title>
    <link rel="stylesheet" href="common/layui/css/layui.css">
    <link rel="stylesheet" href="common/css/login.css">
    <link rel="stylesheet" href="common/css/body.css">
    <script type="text/javascript" src="common/layui/layui.js"></script>
</head>

<body>
<div class="container">
    <section id="content">
        <form class="layui-form" action="/login.ftl" method="post">
            <h1>会员登录</h1>
            <div>
                <input type="text" placeholder="用户名" required="" name="userName"/>
            </div>
            <div>
                <input type="password" placeholder="密码" required="" name="passWord"/>
            </div>
            <div class="">
                <span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span></div>
            <div>
                <input type="submit" value="登录" class="btn btn-primary" id="js-btn-login" lay-submit lay-filter="formDemo"/>
                <a href="#">忘记密码?</a>
            </div>
        </form>
    </section>
</div>
</body>
<script type="text/javascript">
    layui.use('form', function () {
        // 操作对象
        var form = layui.form;

        form.on('submit(formDemo)', function(data){
        });
    });
</script>

</html>
<!DOCTYPE html>
<html lang="en">

<head>
    <#include "../common/head.ftl"/>
    <title>欢迎页</title>
    <link rel="stylesheet" href="common/layui/css/layui.css">
    <link rel="stylesheet" href="common/css/style.css">
</head>

<body class="body">
<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="userName" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-block">
            <input type="password" name="passWord" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">个性名称</label>
        <div class="layui-input-block">
            <input type="text" name="nickName" required  lay-verify="required" placeholder="默认为您的姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="actualName" required  lay-verify="required" placeholder="请输入您的真实姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">手机号码</label>
        <div class="layui-input-block">
            <input type="text" name="phone" required  lay-verify="required" placeholder="请输入您的手机号码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" title="男" checked>
            <input type="radio" name="sex" value="女" title="女" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">站点</label>
        <div class="layui-input-block">
            <input type="checkbox" name="like[write]" title="车行无忧后台管理系统">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['element', 'form', 'layer'], function() {
        var form = layui.form,
                layer = layui.layer,
                element = layui.element;

    });
</script>

</html>
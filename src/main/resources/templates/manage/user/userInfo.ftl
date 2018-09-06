<!DOCTYPE html>
<html lang="en">

<head>
		<#include "../../common/head.ftl"/>
    <title>用户列表</title>
    <link rel="stylesheet" href="../../common/layui/css/layui.css">
    <link rel="stylesheet" href="../../common/css/style.css">
</head>

<body class="body">
<form class="layui-form" action="">
    <div class="larry-personal">
        <blockquote class="layui-elem-quote news_search">
            <div class="layui-inline">
                <input type="text" placeholder="时间范围" class="layui-input" id="timeQuery">
            </div>

            <div class="layui-inline right">
                <div class="layui-input-inline">
                    <input value="" placeholder="请输入关键字" class="layui-input search_input" type="text">
                </div>
                <a class="layui-btn search_btn">查询</a>
            </div>
        </blockquote>
    </div>
</form>

<table class="layui-table" lay-data="{method:'post' ,url:'${tableUrl!}'}">
    <thead>
    <tr>
        <th lay-data="{field:'name}">用户名</th>
        <th lay-data="{field:'sex'}">性别</th>
        <th lay-data="{field:'mobile'}">手机号</th>
        <th lay-data="{field:'realname'}">真实姓名</th>
        <th lay-data="{field:'wechat'}">微信号</th>
        <th lay-data="{field:'menberyon'}">是否会员</th>
        <th lay-data="{field:'money'}">余额</th>
        <th lay-data="{field:'outdangerstatus'}">出险情况</th>
    </tr>
    </thead>
</table>
</body>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['layer', 'element', 'laypage', 'laydate', 'table'], function() {
        var layer = layui.layer,
                table = layui.table,
                element = layui.element,
                laypage = layui.laypage,
                laydate = layui.laydate;

        laydate.render({
            elem: '#timeQuery',
            range: '至',
            format: 'yyyy年MM月dd日'
        });

    });
</script>

</html>
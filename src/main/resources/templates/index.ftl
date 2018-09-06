<!DOCTYPE html>
<html lang="en">

<head>
    <title>车行无忧后台管理系统</title>
    <#include "common/head.ftl"/>
    <link rel="stylesheet" href="common/layui/css/layui.css">
    <link rel="stylesheet" href="common/css/style.css">
</head>

<body>

<!-- layout admin -->
<div class="layui-layout layui-layout-admin">
    <!-- 添加skin-1类可手动修改主题为纯白，添加skin-2类可手动修改主题为蓝白 -->
    <!-- header -->
    <div class="layui-header my-header">
        <a href="index.html">
            <!--<img class="my-header-logo" src="" alt="logo">-->
            <div class="my-header-logo">车行无忧后台管理系统</div>
        </a>
        <div class="my-header-btn">
            <button class="layui-btn layui-btn-small btn-nav"><i class="layui-icon">&#xe65f;</i></button>
        </div>

        <!-- 顶部左侧添加选项卡监听 -->
        <ul class="layui-nav" lay-filter="side-top-left">
        </ul>

        <!-- 顶部右侧添加选项卡监听 -->
        <ul class="layui-nav my-header-user-nav" lay-filter="side-top-right">
            <li class="layui-nav-item">
                <a class="name" href="javascript:;" id="adminManagement"><img src="common/image/code.png" alt="logo">账户名: ${admin.nickName!(admin)} </a>
            </li>
            <li class="layui-nav-item">
                <a class="name" href="javascript:;"><i class="layui-icon">&#xe629;</i>主题</a>
                <dl class="layui-nav-child">
                    <dd data-skin="0">
                        <a href="javascript:;">默认</a>
                    </dd>
                    <dd data-skin="1">
                        <a href="javascript:;">纯白</a>
                    </dd>
                    <dd data-skin="2">
                        <a href="javascript:;">蓝白</a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="/logout.ftl"><i class="layui-icon">&#x1006;</i>退出</a>
            </li>
        </ul>

    </div>
    <!-- side -->
    <div class="layui-side my-side">
        <div class="layui-side-scroll">
            <!-- 左侧主菜单添加选项卡监听 -->
            <ul class="layui-nav layui-nav-tree" lay-filter="side-main">
                <#list functionMenus as parentMenu>
                <li class="layui-nav-item">
                    <#if parentMenu.groupId == 0>
                    <a href="javascript:;"><i class="layui-icon">${parentMenu.target!}</i>${parentMenu.name!(null)}</a>
                    </#if>
                    <dl class="layui-nav-child">
                        <#list functionMenus as childMenu>
                            <#if parentMenu.id == childMenu.groupId!>
                        <dd>
                            <a href="javascript:;" href-url="${childMenu.href!}"><i class="layui-icon">${parentMenu.target!}</i>${childMenu.name!}</a>
                        </dd>
                            </#if>
                        </#list>
                    </dl>
                </li>
                </#list>
            </ul>

        </div>
    </div>
    <!-- body -->
    <div class="layui-body my-body">
        <div class="layui-tab layui-tab-card my-tab" lay-filter="card" lay-allowClose="true">
            <ul class="layui-tab-title">
                <li class="layui-this" lay-id="1"><span><i class="layui-icon">&#xe638;</i>欢迎页</span></li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <iframe id="iframe" src="/main.ftl" frameborder="0"></iframe>
                </div>
            </div>
        </div>
    </div>
    <!-- footer -->
    <div class="layui-footer my-footer">

    </div>
</div>
<!-- 右键菜单 -->
<div class="my-dblclick-box none">
    <table class="layui-tab dblclick-tab">
        <tr class="card-refresh">
            <td><i class="layui-icon">&#x1002;</i>刷新当前标签</td>
        </tr>
        <tr class="card-close">
            <td><i class="layui-icon">&#x1006;</i>关闭当前标签</td>
        </tr>
        <tr class="card-close-all">
            <td><i class="layui-icon">&#x1006;</i>关闭所有标签</td>
        </tr>
    </table>
</div>

<#--新消息的music-->
<audio id="music" controls="controls" style='display:none'>
    <span style="white-space:pre">	</span>
    <source src="music/xinxiaoxi.mp3" type="audio/mpeg">
</audio>

<!-- 加载goeasy推送的js-->
<script type="text/javascript" src="https://cdn-hangzhou.goeasy.io/goeasy.js"></script>
<script type="text/javascript">
    var goEasy = new GoEasy({
        appkey: 'BC-ed901793835047a59e85fa9b677c8a10'
    });
    //GoEasy-OTP可以对appkey进行有效保护，详情请参考：GoEasy-Reference

    goEasy.subscribe({
        channel: 'myChannel',
        onMessage: function (message) {
            layer.msg('收到:' + message.content);
            var audio = document.getElementById("music");
            audio.play();
        }
    });
</script>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript" src="common/js/vip_comm.js"></script>
<script type="text/javascript">
    layui.use(['layer', 'vip_nav'], function() {
        // 操作对象
        var layer = layui.layer,
                vipNav = layui.vip_nav,
                $ = layui.jquery;
        layer.msg("欢迎来到车行无忧后台管理系统")
    });
</script>
//修改用户密码
<script type="text/javascript" src="common/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $("#adminManagement").click(function () {
        layer.open({
            type: 2,
            area: ['1000px', '500px'],
            fixed: false, //不固定
            maxmin: true,
            content: "/adminManagement.ftl"
        });
    })
</script>
</body>

</html>
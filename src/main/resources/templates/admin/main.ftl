<!DOCTYPE html>
<html lang="en">

<head>
    <title>欢迎页</title>
    <#include "../common/head.ftl"/>
    <link rel="stylesheet" href="common/layui/css/layui.css">
    <link rel="stylesheet" href="common/css/style.css">
</head>

<body class="body">
<div class="layui-row layui-col-space10 my-index-main">
    <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
        <div class="my-nav-btn layui-clear" data-href="./demo/tab-card.html">
            <div class="layui-col-md5">
                <button class="layui-btn layui-btn-big layui-btn-normal layui-btn-height layui-icon">&#xe705;</button>
            </div>
            <div class="layui-col-md7 tc">
                <p class="my-nav-text">40</p>
                <p class="my-nav-text layui-elip">用户总数</p>
            </div>
        </div>
    </div>
    <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
        <div class="my-nav-btn layui-clear" data-href="./demo/btn.html">
            <div class="layui-col-md5">
                <button class="layui-btn layui-btn-big layui-btn-danger layui-btn-height layui-icon">&#xe756;</button>
            </div>
            <div class="layui-col-md7 tc">
                <p class="my-nav-text">40</p>
                <p class="my-nav-text layui-elip">今日注册用户</p>
            </div>
        </div>
    </div>
    <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
        <div class="my-nav-btn layui-clear" data-href="./demo/folding-panel.html">
            <div class="layui-col-md5">
                <button class="layui-btn layui-btn-big layui-bg-black layui-btn-height layui-icon">&#xe698;</button>
            </div>
            <div class="layui-col-md7 tc">
                <p class="my-nav-text">40</p>
                <p class="my-nav-text layui-elip">订单总数</p>
            </div>
        </div>
    </div>
    <div class="layui-col-xs6 layui-col-sm3 layui-col-md3">
        <div class="my-nav-btn layui-clear" data-href="./demo/form.html">
            <div class="layui-col-md5">
                <button class="layui-btn layui-btn-big layui-btn-warm layui-btn-height layui-icon">&#xe735;</button>
            </div>
            <div class="layui-col-md7 tc">
                <p class="my-nav-text">40</p>
                <p class="my-nav-text layui-elip">待处理订单数</p>
            </div>
        </div>
    </div>
    <div class="layui-col-xs12 layui-col-sm6 layui-col-md6">
        <div class="layui-collapse">
            <div class="layui-colla-item">
                <h2 class="layui-colla-title">系统概述</h2>
                <div class="layui-colla-content layui-show">
                    <table class="layui-table" lay-skin="nob" lay-size="lg">
                        <tbody>
                        <tr>
                            <td>
                                <strong>当前登录用户</strong>： <span class="current_user">未定义</span>

                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>服务器IP</strong>：未定义
                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>开发作者</strong>： huifengzhao

                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>网站域名</strong>：未定义
                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>版本名称</strong>：initial
                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>版本号</strong>：V1.0
                            </td>
                            <td></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-col-xs12 layui-col-sm6 layui-col-md6">
        <div class="layui-collapse">
            <div class="layui-colla-item">
                <h2 class="layui-colla-title">系统统计</h2>
                <div class="layui-colla-content layui-show">
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">v1.8.0</h3>
                            <p>
                                更新日期:2017-08-26
                            </p>
                            <ul>
                                <li>更新layui-v1.0.9为layui-v2.0.2版本</li>
                                <li>右键增加关闭全部标签按钮</li>
                                <li>更新欢迎页面</li>
                                <li>更新data-table页面和tree-table页面为layui自带table组件</li>
                                <li>
                                    <h4>新增js功能</h4>
                                    <ul>
                                        <li>
                                            <p>vip_table.js</p>
                                            <ul>
                                                <li>getFullHeight方法 getFullHeight(); // 返回子页面整体高度,用于table组件设置全屏高度</li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li>修改已知BUG</li>
                            </ul>
                        </div>
                    </li>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-col-xs12 layui-col-sm6 layui-col-md6">
        <div class="layui-collapse">
            <div class="layui-colla-item">
                <h2 class="layui-colla-title">系统公告</h2>
                <div class="layui-colla-content layui-show">
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">v1.8.0</h3>
                            <p>
                                更新日期:2017-08-26
                            </p>
                            <ul>
                                <li>更新layui-v1.0.9为layui-v2.0.2版本</li>
                                <li>右键增加关闭全部标签按钮</li>
                                <li>更新欢迎页面</li>
                                <li>更新data-table页面和tree-table页面为layui自带table组件</li>
                                <li>
                                    <h4>新增js功能</h4>
                                    <ul>
                                        <li>
                                            <p>vip_table.js</p>
                                            <ul>
                                                <li>getFullHeight方法 getFullHeight(); // 返回子页面整体高度,用于table组件设置全屏高度</li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li>修改已知BUG</li>
                            </ul>
                        </div>
                    </li>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-col-xs12 layui-col-sm6 layui-col-md6">
        <div class="layui-collapse">
            <div class="layui-colla-item">
                <h2 class="layui-colla-title">更新日志</h2>
                <div class="layui-colla-content layui-show">
                    <ul class="layui-timeline max-auto">
                        <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                            <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">v1.8.0</h3>
                                <p>
                                    更新日期:2017-08-26
                                </p>
                                <ul>
                                    <li>更新layui-v1.0.9为layui-v2.0.2版本</li>
                                    <li>右键增加关闭全部标签按钮</li>
                                    <li>更新欢迎页面</li>
                                    <li>更新data-table页面和tree-table页面为layui自带table组件</li>
                                    <li>
                                        <h4>新增js功能</h4>
                                        <ul>
                                            <li>
                                                <p>vip_table.js</p>
                                                <ul>
                                                    <li>getFullHeight方法 getFullHeight(); // 返回子页面整体高度,用于table组件设置全屏高度</li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>修改已知BUG</li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['element', 'form', 'table', 'layer', 'vip_tab'], function() {
        var form = layui.form,
                table = layui.table,
                layer = layui.layer,
                vipTab = layui.vip_tab,
                element = layui.element,
                $ = layui.jquery;
    });
</script>

</html>
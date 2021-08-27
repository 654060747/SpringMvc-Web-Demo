<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/8/19
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>英雄联盟首页</title>
</head>
<body>
    <a href="<%=request.getContextPath()%>/home/index">点击进入</a>
<%--    <a href="click">点击进入</a>--%>
    <form action="<%=request.getContextPath()%>/home/click" method="get">
<%--    <form action="/Demo/home/click" method="get">--%>
        <div>账号：<label>
            <input name="username" type="text" />
        </label></div>
        <div>密码：<label>
            <input name="password" type="text" />
        </label></div>
        <br>
        <div><button>登录</button><div style="color:red">${error}</div></div>
    </form>
    <form action="<%=request.getContextPath()%>/home/find_sql" method="get">
        <button>进入数据库链接</button>
    </form>
</body>
</html>

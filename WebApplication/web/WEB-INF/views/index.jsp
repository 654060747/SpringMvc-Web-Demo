<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/8/19
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>

<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="../css/index.css">
</head>
<body>
    <p>Spring MVC based on XML config success!</p>
    ${APP_PATH}

<%--    目前a标签只发现get方式--%>
    <div>发get</div>
    <div><a href="${APP_PATH}/home/logout">进入个人主页</a></div>
    <div><a href="${APP_PATH}/home/exit">进入个人主页</a></div>

    <br>
    <br>
<%--    post使用form表单--%>
    <div>发post</div>
    <form action="${APP_PATH}/home/logout" method="POST">
        <input type="submit" value="登录" />
    </form>
    <form action="${APP_PATH}/home/exit" method="POST">
        <input type="submit" value="登录" />
    </form>

<%--    @RequestMapping(value = {"/logout","/exit"},params="id")--%>
<%--    <div><a href="exit?id=">进入个人主页</a></div>--%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 54798
  Date: 2018/5/21
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body>
    <h4>根据ID删除</h4>
    <form action="/delCustomer">
       ID: <input type="text" name="id" />
    <input type="submit" value="删除">
</form>
</body>
</html>

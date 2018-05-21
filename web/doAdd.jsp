<%--
  Created by IntelliJ IDEA.
  User: 54798
  Date: 2018/5/21
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
    <form action="/addCustomer">
        姓名:<input type="text" name="username"/><br/>
        工作:<input type="text" name="jobs" /><br/>
        电话:<input type="text" name="phone" />
             <input type="submit" value="提交">
    </form>
</body>
</html>

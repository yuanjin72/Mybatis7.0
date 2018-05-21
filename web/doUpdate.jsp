<%--
  Created by IntelliJ IDEA.
  User: 54798
  Date: 2018/5/21
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
    <form action="/updateCustomer">
        序号:<input type="text" name="id"><br/>
        姓名:<input type="text" name="username"><br/>
        工作:<input type="text" name="jobs"><br/>
        电话:<input type="text" name="phone"><br/>
        <input type="submit" value="修改">
     </form>
</body>
</html>

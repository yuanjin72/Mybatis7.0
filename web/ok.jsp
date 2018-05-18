<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2018/5/8
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="1px">
       <tr>
           <td>序号</td>
           <td>姓名</td>
           <td>工作</td>
           <td>电话</td>
       </tr>

       <c:forEach items="${customer}" var="cc">
        <tr>
            <td>${cc.id}</td>
            <td>${cc.username}</td>
            <td>${cc.jobs}</td>
            <td>${cc.phone}</td>
        </tr>
       </c:forEach>

   </table>
    <a href="index.jsp">返回</a>
</body>
</html>

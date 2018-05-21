<%--
  Created by IntelliJ IDEA.
  User: 54798
  Date: 2018/5/21
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
    <h4>过筛选查询</h4>
    <form action="/findCustomerByNameOrJobs">
        姓名: <input type="text" name="username"><br/>
        工作: <input type="text" name="jobs"><br/>
        电话: <input type="text" name="phone"><br/>
       <input type="submit" value="查询">
    </form>
    <h4>查询所有信息</h4>
     <form action="/findCustomerByAll">
         <input type="submit" value="查询所有">
     </form>

</body>
</html>

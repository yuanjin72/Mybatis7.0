<%--
  Created by IntelliJ IDEA.
  User: 鲍洋
  Date: 2018/5/7
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

     <form action="/addCustomer">
         username:<input type="text" name="username"/><br/>
         jobs:    <input type="text" name="jobs" /><br/>
         phone:   <input type="text" name="phone" />
                  <input type="submit" value="提交">
    </form>
  <br/>

     <form action="/delCustomer">
       删除id: <input type="text" name="id" />
               <input type="submit" value="删除">
     </form>
      <br/>
     <form action="/updCustomer">
         id:       <input type="text" name="id"><br/>
         username: <input type="text" name="username"><br/>
         jobs:     <input type="text" name="jobs"><br/>
         phone:    <input type="text" name="phone"><br/>
                   <input type="submit" value="修改">

     </form>
  <br/>
    <form action="/findCustomer">
          username: <input type="text" name="username">
                    <input type="submit" value="查询">
    </form>
    <%-- <form action="/findUserAll">
          user: <input type="text" name="name">
         <input type="submit" value="查询">
     </form>--%>

     <form action="/findCustomerByNameAndJobs">
         根据姓名查询: <input type="text" name="name"><br/>
         根据工作查询: <input type="text" name="jobs"><br/>
         <input type="submit" value="查询">
     </form>
  </body>
  </body>
</html>

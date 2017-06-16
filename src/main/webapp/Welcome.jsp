<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/5/25
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome</title>
    <link href="<s:url value="/css/tutorails.css" rel="style/sheet" type="text/css"/>"/>
</head>
<body>
   <h3>Commands</h3>

<ul>
    <li>
        <a href="<s:url action="Register"/>">Register</a>
        <%--<a href="<s:url action="Logon"/>">Login</a>--%>
        <a href="<s:url action="Logon_input"/>"/>Sign On
    </li>
</ul>

</body>
</html>

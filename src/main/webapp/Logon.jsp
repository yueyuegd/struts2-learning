<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/5/26
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
   <s:form action="Logon">
       <%--<s:textfield label="User Name" name="username"></s:textfield>--%>
       <s:textfield name="username" label="%{getText('username')}"/>
       <%--<s:password label="Password" name="password"></s:password>--%>
       <s:password label="%{getText('password')}" name="password"/>
       <s:submit></s:submit>
   </s:form>

</body>
</html>

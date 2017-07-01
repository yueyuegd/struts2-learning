<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/25
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h3>Thank you for registering fpr a prize.</h3>
<p>Your register information:<s:property value="personBean"/> </p>
<p><a href="<s:url action='index'/>">Return to home page.</a></p>
</body>
</html>

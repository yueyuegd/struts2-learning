<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/25
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3><s:property value="message"></s:property></h3>

<p><a href="<s:url action='index'/>">Return to home page</a>.</p>
</body>
</html>

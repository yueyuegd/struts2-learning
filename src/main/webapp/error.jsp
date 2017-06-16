<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/16
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>errorpage</title>
</head>
<body>
<h4>The application has malfunctioned.</h4>
<p>Please contact technical support with the following information:</p>
<h4>Exception Name:<s:property value="exception"></s:property></h4>
<h4>Exception Details:<s:property value="exceptionStack"></s:property></h4>

</body>
</html>

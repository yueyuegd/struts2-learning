<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/25
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h3>Reguster for a prize by completing this form.</h3>

<s:form action="register">
    <s:textfield name="personBean.firstName" label="First name"/>
    <s:textfield name="personBean.lastName" label="Last name"/>
    <s:textfield name="personBean.email" label="Email"/>
    <s:textfield name="personBean.age" label="Age"/>
    <s:submit/>

</s:form>

</body>
</html>

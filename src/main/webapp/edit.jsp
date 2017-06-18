<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/16
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Struts 2 Form Tags - Edit Person</title>
</head>
<body>
<h1>Update Information</h1>
<p>Use the form below to edit your information.</p>
<s:form action="save" method="post">
    <s:textfield key="personBean.firstName"></s:textfield>
    <s:textfield key="personBean.lastName"></s:textfield>
    <s:textfield key="personBean.email"></s:textfield>
    <s:textfield key="personBean.phoneNumber"></s:textfield>
    <s:select list="sports" key="personBean.sport"></s:select>
    <s:radio list="genders" key="personBean.gender"></s:radio>
    <s:select list="states" key="personBean.residency" listKey="stateAbbr" listValue="stateName"></s:select>
    <s:checkbox key="personBean.over21"></s:checkbox>
    <s:checkboxlist list="carModelsAvaliable" key="personBean.carModels"></s:checkboxlist>
    <s:submit/>
</s:form>


</body>
</html>

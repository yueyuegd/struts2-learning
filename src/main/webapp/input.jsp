<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/18
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>Edit Person</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
</head>
<body>
<s:if test="id > 0">
    <h3>Edit Person</h3>
</s:if>
<s:else>
    <h3>Create Person</h3>
</s:else>
<s:form action="saveOrUpdatePerson">
    <p><s:textfield name="person.firstName" label="First Name"></s:textfield><br>
    <s:textfield name="person.lastName" label="Last Name"></s:textfield></p>

    <s:hidden name="person.id"/>
    <s:submit value="Save"/>
</s:form>

</body>
</html>

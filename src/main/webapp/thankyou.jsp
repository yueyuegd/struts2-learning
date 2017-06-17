<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/6/16
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Successful</title>
</head>
<body>
<h1>Your information :<s:property value="personBean"/></h1>
<p><a href="<s:url action='index'/>">Return to home page </a></p>
<s:select list="states" listKey="stateAddr" listValue="stateName"></s:select>
<!--上面使用的struts标签相当于HTML标准标签的一下形式-->
<select id="save_personBean_residency" name="personBean.residency">
    <option name="" value="AZ">Arizona</option>
    <option name="" value="CA">California</option>
    <option name="" value="FL">Florida</option>
    <option name="" value="KS" selected="selected">Kansas</option>
    <option name="" value="NY">New York</option>
</select>

</body>
</html>

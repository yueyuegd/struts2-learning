<%--
  Created by IntelliJ IDEA.
  User: zhangyue-k
  Date: 2017/5/25
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hollow World!</title>
</head>
<body>
   <h2><s:property value="message"></s:property></h2>
   <ul>
       <li>
           <s:url var="url" action="Welcome">
               <s:param name="request_locale"></s:param>
           </s:url>
           <s:a href="%{url}">English</s:a>
       </li>
       <li>
           <s:url var="url" action="Welcome">
               <s:param name="request_locale"></s:param>
           </s:url>
           <s:a href="%{url}">Espanol</s:a>
       </li>
   </ul>
</body>
</html>

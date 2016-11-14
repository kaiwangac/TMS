<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<f:form commandName="login">
    <f:input path="username"/>
    <f:input path="password"/>
</f:form>
</body>
</html>

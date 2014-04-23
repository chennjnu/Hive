<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <s:form action="login" method="post">
		<s:textfield key="用户名" name="name"/>
		<s:password key="密码" name="password"/>
		<s:submit key="登陆" />
	</s:form> --%>
	
	<s:form action="userlogin" method="post">
		<s:textfield key="用户名" name="username"/>
		<s:password key="密码" name="password"/>
		<s:submit key="登陆" />
	</s:form>

	<p><a href='<s:url action="userCount" />' >用户统计</a></p>
</body>
</html>
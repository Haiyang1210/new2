<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer re = (Integer)session.getAttribute("result");
	%>
	您成功创建了<%=re %>个用户!!!!
</body>
</html>
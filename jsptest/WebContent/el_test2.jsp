<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 내장 객체 사용 예제</title>
</head>
<body>
	<h3>${sessionScope.test} : <%=(String)session.getAttribute("test") %></h3>
<!-- 	스코프 키값이 중복되지않을경우 스코프 생략가능 -->
	<h3>${param.name } : <%=request.getParameter("name") %></h3>
</body>
</html>
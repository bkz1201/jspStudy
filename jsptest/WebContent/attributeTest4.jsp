<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/htm14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	pageContext.setAttribute("pageScope", "바보");
	request.setAttribute("requestScope", "멍청이");
	%>
	
	pageValue=<%=pageContext.getAttribute("pageScope") %><br>
	requestValue=<%=request.getAttribute("requestScope") %>
</body>
</html>
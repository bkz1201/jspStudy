<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="jspTest.BeanTest" %>
<jsp:useBean id="beantest" class="jspTest.BeanTest" scope="page"/>
<%
// 	BeanTest beantest = new BeanTest();
	beantest.setName("이순신");
%>
<jsp:setProperty property="name" name="beantest" value="유관순"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>자바빈 사용 예제</b>
	<h2><%=beantest.getName() %></h2>
	<h2><jsp:getProperty property="name" name="beantest"/></h2>
</body>
</html>
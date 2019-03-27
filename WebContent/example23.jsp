<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String a="test";
request.setAttribute("a", "requestScope");
session.setAttribute("a", "sessionScope");
Cookie c1 = new Cookie("name","codegizer");
Cookie c2 = new Cookie("nick","nick");

response.addCookie(c2);
response.addCookie(c1);

%>
${a}<br/>
${requestScope.a}<br/>
${sessionScope.a}<br/>
${header["accept"]}<br/>eee
</body>
</html>
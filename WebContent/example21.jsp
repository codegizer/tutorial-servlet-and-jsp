<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	Enumeration<String> list = request.getHeaderNames();

	while(list.hasMoreElements()){
		String key = list.nextElement();
		out.print("<br>" + key + " : " + request.getHeader(key));
	}

%>
<hr>
${header}
<hr>
호스트: ${header["host"]} / ${header.host}
</body>
</html>
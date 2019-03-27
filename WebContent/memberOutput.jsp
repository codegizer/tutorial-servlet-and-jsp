<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원입력 정보</title>
</head>
<body>
<p>아이디 : ${member.userId}</p>
<p>패스워드 : ${member.passwd}</p>
<p>이메일 : ${member.email}</p>
<p>이메일 수신여부 :${member.emailAgree}</p>
<p>관심사항:</p>
<p><%=String.join(", ",request.getParameterValues("interest"))%></p>	
<p>핸드폰 : ${member.hp_1}-${member.hp_2}</p>	
<p>자기소개</p>
${member.introduce}
	

</body>
</html>
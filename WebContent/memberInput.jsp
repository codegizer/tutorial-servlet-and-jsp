<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 가입하기</h3>
<form method="post" action="example22.jsp">
	<p>아이디</p>
	<input type="text" name="userId" placeholder="이름을 입력해 주세요">

	<p>패스워드</p>
	<input type="password" name="passwd" placeholder="패스워드를 입력해 주세요">

	<p>이메일</p>
	<input type="text" name="email" placeholder="이메일을 입력해 주세요">

	
	<p>이메일 수신여부</p>
	<input type="radio" name="emailAgree" value="yes">예
	<input type="radio" name="emailAgree" value="no" checked>아니오
		
	<p>관심사항</p>
	<input type="checkbox" name="interest" value="IT">IT/인터넷
	<input type="checkbox" name="interest" value="movie">영화
	<input type="checkbox" name="interest" value="music">음악
	<input type="checkbox" name="interest" value="book">책
	<input type="checkbox" name="interest" value="food">음식
	
	<p>핸드폰</p>	
	<select name="hp_1">
        <option value="010">010</option>
        <option value="011">011</option>
        <option value="016">016</option>
        <option value="017">017</option>
     </select>
     <input type="text" name="hp_2" placeholder="핸드폰 번호를 입력해주세요">
	
	<p>자기소개</p>
	<textarea name="introduce" placeholder="자기소개를 입력해주세요" cols="30" rows="4"></textarea>
	<br/>
	
	<input type="submit" value="전송">
	
</form>
</body>
</html>
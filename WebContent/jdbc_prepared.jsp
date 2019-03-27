<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*, job.study.beans.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//1. JDBC 드라이버 로딩하기
Class.forName("oracle.jdbc.driver.OracleDriver");

//2. DB 서버 접속하기
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url,"scott","tiger");


String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//Statement
Statement stmt = conn.createStatement();
stmt.executeUpdate("insert into test values('"+id+"', '"+pwd+"')");

//PreparedStatement
PreparedStatement pstmt = conn.prepareStatement("insert into test (id, pwd) values(?, ?)");
pstmt.setString(1, id);
pstmt.setString(2, pwd);
pstmt.executeUpdate();

%>

</body>
</html>
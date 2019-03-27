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

String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
out.println("사용자 정보");
out.println("<hr>");
out.println("+ 아이디 : " + userid+"<br/>");
out.println("+ 패스워드 : " + pwd+"<br/>");
out.println("<hr>");

ResultSet rs;

Statement stmt = conn.createStatement();

String sql = "select * from test where id='"+userid+"' and pwd='"+pwd+"' ";
out.println("<br/>실행쿼리 :<hr>"+sql+"<br/>");
out.println("<hr>");
rs = stmt.executeQuery(sql);

out.println("<br/>검색된 회원 :");
out.println("<hr>");
while(rs.next()){
  out.println(rs.getString("id")+":"+rs.getString(2)+"<br/>");	
}
out.println("<hr>");
rs.close();
stmt.close();
conn.close();

%>
</body>
</html>
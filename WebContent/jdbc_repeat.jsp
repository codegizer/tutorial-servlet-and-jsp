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

List<MemberBean> memberList = new ArrayList<MemberBean>();

MemberBean m1 = new MemberBean();
m1.setUserId("user1");
m1.setPasswd("123");
memberList.add(m1);

MemberBean m2 = new MemberBean();
m2.setUserId("user2");
m2.setPasswd("456");
memberList.add(m2);

MemberBean m3 = new MemberBean();
m3.setUserId("user3");
m3.setPasswd("789");
memberList.add(m3);

//PreparedStatement
PreparedStatement pstmt = conn.prepareStatement("insert into test (id, pwd) values(?, ?)");

int count = memberList.size();
MemberBean tMember;

for(int i=0;i<count;i++)
{
	tMember = memberList.get(i);
	
	pstmt.setString(1, tMember.getUserId());
	pstmt.setString(2, tMember.getPasswd());
	pstmt.executeUpdate();
}

pstmt.close();
conn.close();

%>

</body>
</html>
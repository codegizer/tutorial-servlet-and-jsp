package job.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResumeOutputServlet
 */
@WebServlet("/memberOutput")
public class MemberOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberOutputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//HttpServletRequest 객체에 등록된 회원 정보를 추출한다.
		Member member = (Member) request.getAttribute("member");
		
		out.println("<h3>회원아이디 : "+member.getUserId()+"</h3>");
		out.println("<h3>패스워드 : "+member.getPasswd()+"</h3>");
		out.println("<h3>이메일 : "+member.getEmail()+"</h3>");
		out.println("<h3>핸드폰 : "+member.getHp_1()+"-"+member.getHp_2()+"</h3>");		
		out.println("<h3>이메일수신여부 : "+member.getEmailAgree()+"</h3>");
		out.println("<h3>관심사항: </h3>");
		
		String[] interest = member.getInterest();
				
		for(int i=0; i< interest.length;i++)
		{
			if(i+1 == interest.length) {
				out.println(interest[i]);
			}else {
				out.println(interest[i]+",");
			}
		}
		out.println("<h3>자기소개 : "+member.getIntroduce()+"</h3>");

		out.close();
	}

}

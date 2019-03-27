package job.study.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberQueryTestServlet
 */
@WebServlet("/memberQueryTest")
public class MemberQueryTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberQueryTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청되었습니다</h1>");

		//getParameter는 중복되지 않고 유일하게 하나만 넘어올 떄 사용된다.
		//getParameter의 반환값은 String이다. 
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		String hp_1 = request.getParameter("hp_1");
		String hp_2 = request.getParameter("hp_2");
		String emailAgree = request.getParameter("emailAgree");
		//getParameterValues는 체크박스처럼 다중 선택되는 입력 양식의 값을 추출할 떄 사용된다.
		String[] interest = request.getParameterValues("interest");
		String introduce = request.getParameter("introduce");

		out.println("<h3>회원아이디 : "+userId+"</h3>");
		out.println("<h3>패스워드 : "+passwd+"</h3>");
		out.println("<h3>이메일 : "+email+"</h3>");
		out.println("<h3>핸드폰 : "+hp_1+"-"+hp_2+"</h3>");		
		out.println("<h3>이메일수신여부 : "+emailAgree+"</h3>");
		out.println("<h3>관심사항: </h3>");
						
		for(int i=0; i< interest.length;i++)
		{
			if(i+1 == interest.length) {
				out.println(interest[i]);
			}else {
				out.println(interest[i]+",");
			}
		}
		out.println("<h3>자기소개 : "+introduce+"</h3>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청되었습니다</h1>");
		
		//요청정보 몸체에 있는 문자열들을 인자값으로 지정한 문자코드로 인코딩한다.
		request.setCharacterEncoding("UTF-8");
		
		//getParameter는 중복되지 않고 유일하게 하나만 넘어올 떄 사용된다.
		//getParameter의 반환값은 String이다. 
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String email = request.getParameter("email");
		String hp_1 = request.getParameter("hp_1");
		String hp_2 = request.getParameter("hp_2");
		String emailAgree = request.getParameter("emailAgree");
		//getParameterValues는 체크박스처럼 다중 선택되는 입력 양식의 값을 추출할 떄 사용된다.
		String[] interest = request.getParameterValues("interest");
		String introduce = request.getParameter("introduce");

		out.println("<h3>회원아이디 : "+userId+"</h3>");
		out.println("<h3>패스워드 : "+passwd+"</h3>");
		out.println("<h3>이메일 : "+email+"</h3>");
		out.println("<h3>핸드폰 : "+hp_1+"-"+hp_2+"</h3>");		
		out.println("<h3>이메일수신여부 : "+emailAgree+"</h3>");
		out.println("<h3>관심사항: </h3>");
						
		for(int i=0; i< interest.length;i++)
		{
			if(i+1 == interest.length) {
				out.println(interest[i]);
			}else {
				out.println(interest[i]+",");
			}
		}
		out.println("<h3>자기소개 : "+introduce+"</h3>");

		out.close();
	}
}


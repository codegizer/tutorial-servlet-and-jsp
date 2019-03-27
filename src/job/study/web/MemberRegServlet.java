package job.study.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jobTestServlet
 */
@WebServlet("/memberReg")
public class MemberRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html);charset=UTF-8");
		
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
		
		//멤버객체에 회원정보를 저장한다.
		Member member = new Member();
		member.setUserId(userId);
		member.setPasswd(passwd);
		member.setEmail(email);
		member.setHp_1(hp_1);;
		member.setHp_2(hp_2);
		member.setEmailAgree(emailAgree);
		member.setInterest(interest);
		member.setIntroduce(introduce);
		
		//HttServletRequest 객체에 회 정보를 등록한다.
		request.setAttribute("member",member);
		
		//디스패처에 의한 요청 재지정
		//이력서 정보를 출력을 담당하는 서블릿의 URI를 지정한다.
		RequestDispatcher rd = request.getRequestDispatcher("memberOutput");
		rd.forward(request, response);
		
	}

}

package job.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestWebServlet
 */
@WebServlet("/QueryTest1")
public class ResumeQueryTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeQueryTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청되었습니다</h1>");

		//getParameter는 중복되지 않고 유일하게 하나만 넘어올 떄 사용된다.
		//getParameter의 반환값은 String이다. 
		//숫자형식의 문자열을 숫자타입으로 바꾸기 위해서는 Integer.parseInt() 메소드를 이용한다.
		String name = req.getParameter("name");
		//getParameterValues는 체크박스처럼 다중 선택되는 입력 양식의 값을 추출할 떄 사용된다.
		String[] jobs = req.getParameterValues("job");
		String career = req.getParameter("career");		
		String salary = req.getParameter("salary");
		String indroduce = req.getParameter("introduce");

		out.print("이름 : " + name + "<br/>");
		out.print("희망직무 :");
		for (int i = 0; i < jobs.length; i++) {
			out.print(jobs[i] + " ");
		}
		out.print("<br/>");
		out.print("경력여부 : " + career + "<br/>");
		out.print("희망연봉 : " + salary + "<br/>");
		out.print("자기소개 : " + indroduce + "<br/>");

		out.println("</body></html>");
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청되었습니다</h1>");

		//요청정보 몸체에 있는 문자열들을 인자값으로 지정한 문자코드로 인코딩한다.
		req.setCharacterEncoding("UTF-8");
		
		//getParameter는 중복되지 않고 유일하게 하나만 넘어올 떄 사용된다.
		//getParameter의 반환값은 String이다. 
		//숫자형식의 문자열을 숫자타입으로 바꾸기 위해서는 Integer.parseInt() 메소드를 이용한다.
		String name = req.getParameter("name");
		//getParameterValues는 체크박스처럼 다중 선택되는 입력 양식의 값을 추출할 떄 사용된다.
		String[] jobs = req.getParameterValues("job");
		String career = req.getParameter("career");		
		String salary = req.getParameter("salary");
		String indroduce = req.getParameter("introduce");

		out.print("이름 : " + name + "<br/>");
		out.print("희망직무 :");
		for (int i = 0; i < jobs.length; i++) {
			out.print(jobs[i] + " ");
		}
		out.print("<br/>");
		out.print("경력여부 : " + career + "<br/>");
		out.print("희망연봉 : " + salary + "<br/>");
		out.print("자기소개 : " + indroduce + "<br/>");

		out.println("</body></html>");
		out.close();
	}
}


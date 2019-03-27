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
@WebServlet("/resumeReg")
public class ResumeTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html);charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String[] duties = request.getParameterValues("duties");
		String career = request.getParameter("career");
		String salary = request.getParameter("salary");
		String introduce = request.getParameter("introduce");
		
		Resume resume = new Resume();
		resume.setName(name);
		resume.setDuties(duties);;
		resume.setCareer(career);
		resume.setSalary(salary);
		resume.setIntroduce(introduce);
		
		//HttServletRequest 객체에 이력서 정보를 등록한다.
		request.setAttribute("resume",resume);
		
		//디스패처에 의한 요청 재지정
		//이력서 정보를 출력을 담당하는 서블릿의 URI를 지정한다.
		RequestDispatcher rd = request.getRequestDispatcher("resumeOutput");
		rd.forward(request, response);
		
	}

}

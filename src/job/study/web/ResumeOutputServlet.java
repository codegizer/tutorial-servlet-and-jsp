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
@WebServlet("/resumeOutput")
public class ResumeOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeOutputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//HttpServletRequest 객체에 등록된 이력서 정보를 추출한다.
		Resume resume = (Resume) request.getAttribute("resume");

		out.println("<h3>이름 : "+resume.getName()+"</h3>");
		out.println("<h3>희망직무 : </h3>");
		
		String[] duties = resume.getDuties();
				
		for(int i=0; i< duties.length;i++)
		{
			if(i+1 == duties.length) {
				out.println(duties[i]);
			}else {
				out.println(duties[i]+",");
			}
		}
		out.println("<h3>경력여부 : "+resume.getCareer()+"</h3>");
		out.println("<h3>희망연봉 : "+resume.getSalary()+"</h3>");
		out.println("<h3>자기소개 : "+resume.getIntroduce()+"</h3>");

		out.close();
	}

}

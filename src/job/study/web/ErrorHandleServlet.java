package job.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandleServlet
 */
@WebServlet("/errorHandle")
public class ErrorHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorHandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//발생된 오류의 코드정보
		Integer code = (Integer) request.getAttribute("javax.servlet.error.status_code");
		//발생된 오류 객체의 타입 정보를 가지고 있는 Class형 객체
		String message = (String) request.getAttribute("javax.servlet.error.message");
		//발생된 오류의 메시지 정보
		Object type = request.getAttribute("javax.servlet.error.exception_type");
		//발생된 오류 객체
		Throwable exception = (Throwable) request.getAttribute("javax.servlet.error.exception");;
		//오류가 발생된 페이지의 URI정보
		String uri = (String) request.getAttribute("javax.servlet.error.request_uri");
		
		out.println("<h2>Error Code     : " + code + "</h2>");
		out.println("<h2>Error Message  : " + message + "</h2>");
		out.println("<h2>Error Type     : " + type + "</h2>");
		out.println("<h2>Error Object   : " + exception + "</h2>");
		out.println("<h2>Error URI      : " + uri + "</h2>");
		
		out.close();
		
	}

}

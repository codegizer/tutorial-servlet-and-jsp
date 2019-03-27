package job.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorTestServlet
 */
@WebServlet("/errorTest")
public class ErrorTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String getquery = request.getQueryString();
		
		try {
			out.println("Query : " + getquery + "<br>");
			
			//질의문자열 값이 null이면 사용자예외를 강제로 발생시킨다.
			if(getquery==null ) throw new QueryStringNullException();
				
			out.println("Query길이 : " + getquery.length() + "<br>");
			out.println("Done!");
		}catch(QueryStringNullException e) {
			out.println("요청을 처리하는 동안 오류가 발생하였습니다 : <br/>");
			out.println(e);
		}catch(Exception e) {
			//catch문은 처음 부터 검색하여 예외가 일치하는 catch문의 블록을 실행한다.
		}finally {
			//try-catch 문을 끝마치면 반드시 실행딘다.
			
		}
				
		out.close();
	}


}

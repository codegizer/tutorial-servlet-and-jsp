package job.study.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class FlowFilterTwo
 */
@WebFilter(
		filterName="flow2",
		initParams= {
			@WebInitParam(name="enc", value="UTF-8")
		})
public class FlowFilterTwo implements Filter {

	String charset;
    /**
     * Default constructor. 
     */
    public FlowFilterTwo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub

		// 인코딩 초기 값을 추출하여 멤버변수인 charset에 저장한다.
		charset = fConfig.getInitParameter("enc");
		System.out.println("init() 호출 ......... two");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		//초기값을 추출하여 멤버 변수인 charst에 저장한 값으로 문자코드를 설정한다.  		
		request.setCharacterEncoding(charset);
		System.out.println(charset);
		System.out.println("doFilter() 호출  전 ......... two");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("doFilter() 호출  후 ......... two");
		Throwable exception = (Throwable) request.getAttribute("javax.servlet.error.exception");;
		System.out.println(exception);
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory () 호출 ......... two");
	}

}

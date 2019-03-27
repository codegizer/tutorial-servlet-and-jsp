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
 * Servlet Filter implementation class CharacterEncodingFilter
 
@WebFilter(
		filterName="encfilter2",
		urlPatterns = "/*", 
		initParams= {
			@WebInitParam(name="enc", value="UTF-8")
		})
*/		
public class CharacterEncodingFilter2 implements Filter {
	
	private FilterConfig filterConfig = null;
	
    /**
     * Default constructor. 
     */
    public CharacterEncodingFilter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String charset = filterConfig.getInitParameter("enc");
		System.out.println("필터2");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("필터2:END");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = fConfig;
	}

}

package cm.web.controller.filter;

import java.io.IOException;			
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//한글인코딩을 모든 페이지에  가능하게 해주는 역할


@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
	
	private static final String ENCODING = "UTF-8";
	private static final String CONTENT_TYPE="text/html";

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding(ENCODING);
		response.setCharacterEncoding(ENCODING);
		response.setContentType(CONTENT_TYPE);	
		
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		
	}

	
	
	
	

}

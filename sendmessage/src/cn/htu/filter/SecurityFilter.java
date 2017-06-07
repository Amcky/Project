package cn.htu.filter;

/**
 * 安全过滤界面，所有要访问main文件夹中的页面时候，都要使用该过滤器
 * 
 */
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		Object obj = request.getSession().getAttribute("usercode");

		if (obj == null) {
			response.sendRedirect(request.getContextPath() + "/login.action");
			
			return;
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}

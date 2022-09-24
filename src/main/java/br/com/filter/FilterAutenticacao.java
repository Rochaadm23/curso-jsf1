package br.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.jpautil.JPAUtil;

@WebFilter(urlPatterns = { "/*" })
public class FilterAutenticacao implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.err.println("Invocando filter");
		// Executa as ações do request e do response
		chain.doFilter(request, response);
	}

}

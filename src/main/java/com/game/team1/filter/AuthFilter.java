package com.game.team1.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.web.filter.GenericFilterBean;

import lombok.extern.slf4j.Slf4j;

@WebFilter("/*")
@Slf4j
public class AuthFilter extends GenericFilterBean{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		String token=req.getHeader(HttpHeaders.AUTHORIZATION);
		Enumeration<String> names=req.getHeaderNames();
		while(names.hasMoreElements()) {
			String name=names.nextElement();
		}
		chain.doFilter(request, response);
		// TODO Auto-generated method stub
		
	}
	

}

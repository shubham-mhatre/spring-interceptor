package com.example.interceptor.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//@Component
public class SinglePurposeInterceptor implements HandlerInterceptor{
	
	private final Logger LOG=LoggerFactory.getLogger(GeneralpurposeInterceptor.class);	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("Inside preHandle() of SinglePurposeInterceptor.class ");
		request.setAttribute("rmt_ip", "192.168.100.200");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		LOG.info("Inside postHandle() of SinglePurposeInterceptor.class ");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOG.info("Inside afterCompletion() of SinglePurposeInterceptor.class ");
	}
	
	

}

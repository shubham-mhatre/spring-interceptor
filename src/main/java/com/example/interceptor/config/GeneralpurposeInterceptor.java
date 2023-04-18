package com.example.interceptor.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

//@Component
public class GeneralpurposeInterceptor implements HandlerInterceptor{
	
	private final Logger LOG=LoggerFactory.getLogger(GeneralpurposeInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("Inside preHandle() of GeneralpurposeInterceptor.class ");
		return true;
	}
	

}

package com.example.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class WebConfiguration {
	
	/* when we implement WebMvcConfigurer, 
	 * we can go for commented code.
	 * also uncomment @component annotation in GeneralPurpose & SinglePurpose interceptor classes
	 */
	
//	implements WebMvcConfigurer
//	
//	@Autowired private GeneralpurposeInterceptor generalpurposeInterceptor;
//	@Autowired private SinglePurposeInterceptor singlePurposeInterceptor;
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(generalpurposeInterceptor)
//		registry.addInterceptor(singlePurposeInterceptor).addPathPatterns("/product/**");
//	}

	
	//another way to register interceptor by creating bean of MappedInterceptor
	@Bean
	public MappedInterceptor generalpurposeInterceptor() {
		return new MappedInterceptor(null, new GeneralpurposeInterceptor());
	}

	/** 
	 * single purpose interceptor only for product request mapping
	 */
	@Bean
	public MappedInterceptor singlepurposeInterceptor() {
		String[] arr = {"/product/**"};
		return new MappedInterceptor(arr,null, new SinglePurposeInterceptor());
	}
	

}

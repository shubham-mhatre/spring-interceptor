package com.example.interceptor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/getProducts")
	public List<String> getAllProducts(HttpServletRequest request){
		
		List<String> products=new ArrayList<>(3);
		String remoteIp=(String) request.getAttribute("rmt_ip");
		System.out.println("ip from interceptor "+remoteIp);
		products.add("Mobile");
		products.add("Laptop");
		products.add("Speakers");
		return products;
	}
}

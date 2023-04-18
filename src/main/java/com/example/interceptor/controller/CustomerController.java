package com.example.interceptor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/getCustomers")
	public List<String> getAllCustomers(){
		List<String> customers=new ArrayList<>(5);
		customers.add("shubham");
		customers.add("sanmesh");
		customers.add("sanket");
		customers.add("sidhesh");
		customers.add("ronak");
		return customers;
	}

}

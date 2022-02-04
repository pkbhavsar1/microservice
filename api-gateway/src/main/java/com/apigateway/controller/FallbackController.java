package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FallbackController {
	

	@HystrixCommand(fallbackMethod = "userServiceFallbackMethod")
	@GetMapping("/userServiceFallbackMethod")
	public String userServiceFallbackMethod() {
		return "User Service is taking longer than expected.\n"+"Please try again later ";
	}
	
	@HystrixCommand(fallbackMethod = "departmentServiceFallbackMethod")
	@GetMapping("/departmentServiceFallbackMethod")
	public String departmentServiceFallbackMethod() {
		return "Department Service is taking longer than expected.\n"+"Please try again later ";
	}
}

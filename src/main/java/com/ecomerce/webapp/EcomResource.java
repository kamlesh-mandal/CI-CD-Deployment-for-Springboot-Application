package com.ecomerce.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomResource {
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue="World") String name) {
		return "Today is a wonderfull day ! , " + name;
	}
	
	@GetMapping("/")
	public String index() {
		return "Hello, Welcome ecommerce webservice application ! ";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, wonderfull job!";
	}
}

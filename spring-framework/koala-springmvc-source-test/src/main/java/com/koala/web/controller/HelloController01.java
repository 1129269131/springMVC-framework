package com.koala.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by koala on 2021-07-25
 */
@RestController
public class HelloController01 {

	@GetMapping("/hello01")
	public String sayHello(){
		return "Hello, SpringMVC!";
	}

}

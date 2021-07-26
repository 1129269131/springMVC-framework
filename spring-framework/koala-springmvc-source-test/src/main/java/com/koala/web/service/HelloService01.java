package com.koala.web.service;

import org.springframework.stereotype.Service;

/**
 * day03
 * Create by koala on 2021-07-25
 */
@Service
public class HelloService01 {

	public HelloService01(){
		System.out.println("HelloService.....");
	}

	public String say(String name){
		return "Hello,"+name;
	}

}

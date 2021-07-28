package com.koala.web.controller;

import com.koala.web.service.HelloService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * day11
 * Create by koala on 2021-07-25
 */
@Controller
public class HelloController05 {

	public HelloController05(){
		System.out.println("HelloController.....");
	}

	@Autowired
	HelloService01 helloService;

	/**
	 * day11
	 * @return ModelAndView、Model、void\String xxxx
	 */
	@GetMapping("/hello05")
	public String sayHello(String name,
						   @RequestParam("user")String user,
						   HttpSession session, HttpServletRequest request,
						   @RequestHeader("User-Agent") String  ua){
		String mvc = helloService.say(user+"：MVC"+name);
		session.setAttribute("msg",mvc);
		//SpringMVC的目标方法能写哪些返回值
		//https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-return-types
		return "index01";
	}

}

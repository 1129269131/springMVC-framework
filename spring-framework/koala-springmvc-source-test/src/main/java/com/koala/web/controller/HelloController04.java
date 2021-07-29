package com.koala.web.controller;

import com.koala.web.service.HelloService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * day10
 * Create by koala on 2021-07-25
 */
@Controller
public class HelloController04 {

	public HelloController04(){
		System.out.println("HelloController.....");
	}

	@Autowired
	HelloService01 helloService;

	@GetMapping("/hello04")
	public String sayHello(String name, //可以从请求参数中得到
						   @RequestParam("user")String user, //可以从请求参数中得到
						   HttpSession session, //原生的session对象
						   HttpServletRequest request,
						   @RequestHeader("User-Agent") String  ua){//@RequestParam Map<String,Object> params：所有请求参数全封装进来
		//@RequestHeader("User-Agent") String  ua 获取指定请求头的值
		String header = request.getHeader("User-Agent"); //原生获取
		//方法的签名，到底能写那些？
		//详细参照 https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-arguments
		//https://www.bilibili.com/video/BV19K4y1L7MT?p=32
		String mvc = helloService.say(user+"：MVC"+name);
		session.setAttribute("msg",mvc);
		return "index01.jsp";
	}

}

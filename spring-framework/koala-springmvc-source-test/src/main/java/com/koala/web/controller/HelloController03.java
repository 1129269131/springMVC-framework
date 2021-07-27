package com.koala.web.controller;

import com.koala.web.service.HelloService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * day08
 * Create by koala on 2021-07-25
 */
@RestController
public class HelloController03 {

	public HelloController03(){
		System.out.println("HelloController.....");
	}

	@Autowired
	HelloService01 helloService;

	/**
	 * day08：
	 * RequestMappingHandlerAdapter:怎么反射执行到这个方法，确定每一个参数的值，以及处理返回值等等
	 *
	 * ModelAndView、Model、void\String xxxx
	 * day09：请求数据到自定义Object属性的映射需要用到 --》（WebDataBinder【数据类型转换、绑定错误处理】）Factory
	 */
	@GetMapping("/hello03")
	public String sayHello(){

		String mvc = helloService.say("MVC");
		return mvc;
	}

}

package com.koala.web.controller;

import com.koala.web.service.HelloService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * day03
 * Create by koala on 2021-07-25
 */
//day07：@Controller; 如果有父子容器 @Component，默认是在父容器中，还找不到
//day07：@Component+@RequestMapping
@RestController
public class HelloController02 {

	public HelloController02(){
		System.out.println("HelloController.....");
	}

	@Autowired
	HelloService01 helloService;

	@GetMapping("/hello02") // day07：所有的xxxMapping都是RequestMapping
	public String sayHello(){

		String mvc = helloService.say("MVC");
		return mvc;
	}

}

package com.koala.web.controller;

import com.koala.web.exception.InvalidUserException01;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * day16
 * Create by koala on 2021-07-25
 */
@Controller
public class HelloController08 {

	@GetMapping("/hello08")
	public String sayHello(@RequestParam("user") String user, Integer i) {
		int x = 10 / i;

		if ("abc".equals(user)) {
			//非法的用户信息
			throw new InvalidUserException01();
		}

		return "index01.jsp";
	}

}

package com.koala.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * day15
 * Create by koala on 2021-07-25
 */
@Controller
public class HelloController07 {

	public HelloController07(){
		System.out.println("HelloController.....");
	}

	@GetMapping("/meinv01")
	public String meinv(String name,Model model){

		//模拟数据库查询了
		model.addAttribute("info","超级大美女");

		return "meinv:"+name;  //页面的渲染效果是美女的详情
	}

}

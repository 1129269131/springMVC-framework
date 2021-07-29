package com.koala.web.controller;

import com.koala.web.service.HelloService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * day14
 * Create by koala on 2021-07-25
 */
@Controller
public class HelloController06 {

	public HelloController06(){
		System.out.println("HelloController.....");
	}

	@Autowired
	HelloService01 helloService;

	@GetMapping("/hello06")
	public String sayHello(String name,
						   @RequestParam("user")String user,
						   HttpSession session, HttpServletRequest request,
						   @RequestHeader("User-Agent") String  ua,
						   Model model,//day14：转发带数据
						   RedirectAttributes ra//day14：重定向带数据
							){
		String mvc = helloService.say(user+"：MVC"+name);
		session.setAttribute("msg",mvc);

		model.addAttribute("aaa","有值"); //day14：如果有值就是添加到请求域
		model.addAttribute("bbb"); //day14：如果没值就是从请求域中移除此值，移除aaa在请求域中的值

		ra.addFlashAttribute("ccc","ddd");//day14：重定向到的页面也能取到【防重复提交】
		return "index01.jsp";  //day14：@PostMapping("/submit")  表单失败了  前一步，把表单中的数据放到ra中，  return  "redirect:form.jsp" //表单还能取到数据
	}

}

package com.diwa.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diwa.model.User;
import com.diwa.service.HelloService;

@Controller
@RequestMapping(value = "/test")
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody User sayHello(User user) {
		System.out.print("hi");
		return user;
	}
}

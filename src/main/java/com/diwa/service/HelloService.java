package com.diwa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.JacksonObjectMapperFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloService {
	private final String str;

	public String getString() {
		return str;
	}
	
	public HelloService(String str){
		this.str = str;
	}
	
}

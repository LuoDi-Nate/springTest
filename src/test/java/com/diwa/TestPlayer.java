package com.diwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diwa.model.Player;

public class TestPlayer {
	
	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		Player jack = (Player) ctxApplicationContext.getBean("player");
		jack.play();
	}
}

package com.diwa;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.diwa.dao.UserMapper;
import com.diwa.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-config.xml"})
public class testUserService {
	@Resource(name = "userMapper")
	private UserMapper userMapper;
//	@Autowired
//	private UserMapper userMapper;
	
	@Test
	public void testSelectUser(){
		User user = new User();
		user.setName("new11");
		user.setAge(11);
		user.setGender(true);
		user.setId(12);
		user.setPasswd("dfd");
		user.setTime1(new Date());
		user.setTime2(new Timestamp(System.currentTimeMillis()));
		
//		
		userMapper.insertUser(user);
		System.out.print("aaa");
//		User findUserById = userMapper.findUserById(12);
//		findUserById = null;
		
	}
}
	
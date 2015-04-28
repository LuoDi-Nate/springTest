package com.diwa.dao;

import com.diwa.model.User;

public interface UserMapper {
	public User findUserById(int id);
	public void insertUser(User user);
}

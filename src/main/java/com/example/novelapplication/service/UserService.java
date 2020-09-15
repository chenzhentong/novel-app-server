package com.example.novelapplication.service;

import com.example.novelapplication.model.User;

public interface UserService {

	public User queryUserById(int id);
	public User queryByUserNameAndPassword(String userName,String password);
	
}

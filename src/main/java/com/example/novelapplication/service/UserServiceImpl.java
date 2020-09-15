package com.example.novelapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.novelapplication.dao.UserDao;
import com.example.novelapplication.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User queryUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findOne(id);
	}
	@Override
	public User queryByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.findByUsernameAndPassword(userName, password);
	}

}

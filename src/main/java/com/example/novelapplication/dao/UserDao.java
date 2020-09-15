package com.example.novelapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.novelapplication.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	public User findByUsernameAndPassword(String userName,String password);

}

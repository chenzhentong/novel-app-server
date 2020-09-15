package com.example.novelapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.novelapplication.model.User;
import com.example.novelapplication.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	//根据id获取用户信息
	/*
	 * 例如  http://192.168.1.4:8080/user/1
	 */
	@GetMapping("/user/{id}")
	
	public User getUserById(@PathVariable("id") int id,Model model) {
		User user=userService.queryUserById(id);
		System.out.println(user);

		return user;
	}
	
	//根据用户名和密码获取用户信息
	/*
	 * 例如  http://192.168.1.4:8080/getUserByAccount/xiaoming/123456
	 */
	@GetMapping("/getUserByAccount/{username}/{password}")
	public User getUserByAccount(@PathVariable("username") String username,@PathVariable("password")String password) {
		User user=userService.queryByUserNameAndPassword(username, password);
		System.out.println(user);
		return user;
	}
	
	
	
	

}

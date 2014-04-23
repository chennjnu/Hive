package com.test.user.service;
import com.test.user.model.User;
import com.test.user.service.IUserService;
import com.test.user.mapper.*;
public class UserService implements IUserService{

	UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUser(String username){
		return userMapper.getUser(username);
	}
	
//	public User getUser(String username){
//		return new User();
//	}
	
	public boolean login(String username, String password){
		User user = userMapper.getUser(username);
		if(user.getPassword().equals(password))
			return true;
		else
			return false;
	}
}

package com.test.user.service;
import com.test.user.model.User;

public interface IUserService {

	public boolean login(String username, String password);
	public User getUser(String username);
}

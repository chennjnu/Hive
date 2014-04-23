package com.test.user.serviceImpl;

import com.test.user.service.LoginService;

public class LoginServiceImpl implements LoginService {

	public boolean isLogin(String userName, String password) {  
        if("hello".equals(userName) && "world".equals(password))  
            return true;  
        else   
            return false;  
    } 
}

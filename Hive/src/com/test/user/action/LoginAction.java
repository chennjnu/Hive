package com.test.user.action;
import com.test.user.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.test.user.service.IUserService;


public class LoginAction extends ActionSupport {  
	private static final long serialVersionUID = 1L;
        
    private User user;
    
    private IUserService userService;
   
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Override  
    public String execute() throws Exception {  
        if(userService.login(user.getUsername(), user.getPassword()))  
            return SUCCESS;  
        else  
            return "error";  
    }  
}  


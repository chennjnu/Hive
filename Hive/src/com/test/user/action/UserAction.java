package com.test.user.action;
import com.test.user.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.test.mybatis.mapper.IUserDao;
import java.util.List;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	private IUserDao userdao;
	
	public IUserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String userCount() {
		try {
			int num = userdao.getUserCount();
			info = String.valueOf(num);
			return "success";			
		}catch(Exception e){
			return "error";
		}
	}
	
	public String login() {
		try {
			User user = userdao.selectUserByUsername(username);
			//List<User> users = userdao.selectUserByAge(10);
			User users = userdao.selectUserByAge(10);
			String pw = userdao.selectPassword(username);
			int num = userdao.getOneUserCount(username, password);
			
			System.out.println("username: "+ user.getUsername()+" password: "+ user.getPassword());
			info = String.valueOf(num);
			return "success";			
		}catch(Exception e){
			return "error";
		}
	}
	
	private String info;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String loginPage(){
		return "success";
	}


}

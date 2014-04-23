package com.test.mybatis.mapper;
import com.test.user.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface IUserDao {

	public int getUserCount();
	
	//
	public User selectUserByUsername(@Param("username") String username);
	
	public int getOneUserCount(@Param("username") String username, @Param("password") String password);
	
	public String selectPassword(@Param("username") String username);
	
	//public List<User> selectUserByAge(@Param("age") int age);
	
	public User selectUserByAge(@Param("age") int age);
}

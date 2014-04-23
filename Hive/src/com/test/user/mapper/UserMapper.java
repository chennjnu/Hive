package com.test.user.mapper;
import com.test.user.model.User;
import org.apache.ibatis.annotations.Select; 
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public interface UserMapper {

	@Select("SELECT * FROM users WHERE username = #{username}")
	User getUser(String username);
}

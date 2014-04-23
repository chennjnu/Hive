package com.test.mybatis.mapper;
import java.util.List;
import com.test.user.model.*;


public interface IMenuDao {
	public List<TdMRolemenu> GetMenuByRoleCode(String roleCode);
}

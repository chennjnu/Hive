package com.test.user.service;
import java.util.List;
import com.test.mybatis.mapper.IMenuDao;
import com.test.user.model.TdMRolemenu;

public class RoleMenuService {
	IMenuDao menuDao;
	
	public IMenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
	}

	public List<TdMRolemenu> getMenu(String roleCode) {
		
		return menuDao.GetMenuByRoleCode(roleCode);
	}
}

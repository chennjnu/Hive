package com.test.user.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.test.user.model.TdMRolemenu;
import com.test.user.service.RoleMenuService;

public class RoleMenuAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	RoleMenuService roleMenuService;	
	
	public RoleMenuService getRoleMenuService() {
		return roleMenuService;
	}

	public void setRoleMenuService(RoleMenuService roleMenuService) {
		this.roleMenuService = roleMenuService;
	}

	@Override
	public String execute()throws Exception {
		String roleCode = "001";
		List<TdMRolemenu> tdMRolemenu = roleMenuService.getMenu(roleCode);
		return SUCCESS; 
	}
}

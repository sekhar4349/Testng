package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002 
{
	public void tc002() {
		General obj=new General();
		
		obj.openapplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}

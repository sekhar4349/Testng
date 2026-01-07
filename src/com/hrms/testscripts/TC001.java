package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 
{
	@Test
	public void tc001()
	{
		General object=new General();
		object.openapplication();
		object.login();
		object.logout();
	}

}

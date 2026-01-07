package com.hrms.testscripts;

import org.testng.Reporter;

import com.hrms.lib.General;
import com.hrms.utility.Log;

public class TC003 {
	public void tc003() {
		General gen=new General();
		gen.openapplication();
		gen.login();
		System.out.println("TC003 Executed");
		Log.info("TC003 Executed");
		Reporter.log("TC003 Executed");
	}

}

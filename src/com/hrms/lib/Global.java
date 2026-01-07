package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	//--To provide Test Data & Objects / elements related to whole application
			public WebDriver d;
			//***********Test Data**********************
			public String url  = "https://ctcorphyd.com/SureshIT/login.php";
			public String un   = "sureshit";
			public String pw   = "sureshit";
			public String efn  = "Suresh";
			public String eln  = "academy";
			//***********Objects / Elements ************
			public String textbox_username   = "txtUserName";
			public String textbox_password   = "txtPassword";
			public String button_login       = "Submit";
			public String link_logout       = "Logout";
			public String frame_empinfo     = "rightMenu";	
			public String button_add         = "//input[@value='Add']";
			public String textbox_empfirstname = "txtEmpFirstName";
			public String textbox_emplastname  = "txtEmpLastName";
			public String button_save        = "btnEdit";

	
	

}

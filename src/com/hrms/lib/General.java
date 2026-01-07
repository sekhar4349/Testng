package com.hrms.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global
{

	WebDriverWait wait;
	public void openapplication()
	{
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--headless");
		d=new FirefoxDriver(option);
		wait=new WebDriverWait(d,Duration.ofSeconds(20));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.navigate().to(url);
		System.out.println("Application Opened"); //--console
		Reporter.log("Application Opened"); //--html report
		Log.info("Application Opened"); //--log file
		
	}
	public void closeApplication() {
		if(d !=null)
		{
			d.quit();
		}
	
	System.out.println("Application Closed"); //--console
	Reporter.log("Application Closed"); //--html report
	Log.info("Application Closed"); //--log file
	}
	public void login() {
		
	d.findElement(By.name(textbox_username)).sendKeys(un);
	
	d.findElement(By.name(textbox_password)).sendKeys(pw);
	
	d.findElement(By.name(button_login)).click();
	
	System.out.println("Login Compleated"); //--console
	Reporter.log("Login Compleated"); //--html report
	Log.info("Login Compleated"); //--log file
	

	}
	public void logout() {
		
	d.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout Completed");
	Reporter.log("Logout Completed"); //--html report
	Log.info("Logout Completed"); //--log file
	
	}
	public void enterFrame() {
		
	d.switchTo().frame(frame_empinfo);
	System.out.println("Entered into Frame");
	Reporter.log("Entered into Frame"); //--html report
	Log.info("Entered into Frame"); //--log file
	
	}
	public void exitFrame() {
		
	d.switchTo().defaultContent();
	System.out.println("Exited from Frame");
	Reporter.log("Exited Frame");
	Log.info("Exited Frame");
	}
	public void addNewEmp() {
		
	d.findElement(By.xpath(button_add)).click();
	d.findElement(By.name(textbox_empfirstname)).sendKeys(efn);
	d.findElement(By.name(textbox_emplastname)).sendKeys(eln);
	d.findElement(By.id(button_save)).click();
	System.out.println("New Employee Added");
	Reporter.log("New Employee Added");
	Log.info("New Employee Added");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.actitime.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.testbase.TestBase;
import com.actitime.qa.util.TestUtil;

public class LoginPageTest extends TestBase{

	public LoginPageTest(){
		super();
	}
	
	LoginPage loginpage;
	TestUtil util;
	
	@BeforeMethod
	public void setUp(){
		TestBase.initialization();
		loginpage = new LoginPage();
		util = new TestUtil();
	}
	
	@Test
	public void loginPageTitleTest() {
		util.validateTitleofPage();
	}
	
	
	@Test
	public void loginPageLogoTest() {
		loginpage.validateLogoImage();
	}
	
	
	@Test
	public void loginPageLoginTest() {
		loginpage.loginToApplication(prop.getProperty("Adminusername"), prop.getProperty("Adminpassword"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}

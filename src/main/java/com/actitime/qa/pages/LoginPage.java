package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.testbase.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	WebElement atLogoImg;
		
	@FindBy(id="toPasswordRecoveryPageLink")
	WebElement forgotPassword;
	
	
	//Initializing the page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	
	}
	
	
	//Verify Logo is displayed
	public void validateLogoImage() {
		atLogoImg.isDisplayed();
	}
	
	public void validateForgotPasswordLink() {
		forgotPassword.isDisplayed();
	}
	
	//Login to Application using username and password
	public HomePage loginToApplication(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}

package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Login extends BaseClass {
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement login;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwd;
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginbutton;
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void loginCredentials(String id, String pw) {
		login.click();
		email.sendKeys(id);
		pwd.sendKeys(pw);
				
	}
	
	public void login() {
		loginbutton.click();
	}
	
	public String accountVerify() {
		String acc = account.getText();
		return acc;
	}

}

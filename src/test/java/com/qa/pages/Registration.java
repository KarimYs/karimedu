package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Registration extends BaseClass{
	
	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy (xpath= "//a[@class=\'ico-register\']")
	WebElement registerButton;
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement GenderM;
	@FindBy(xpath ="//input[@id='FirstName']")
	WebElement Fname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement Lname;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement cpwd;
	@FindBy(xpath="//input[@name='register-button']")
	WebElement Rbutton;
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	public void register(String first, String last, String Email, String password, String confirpassword) {
		registerButton.click();
		GenderM.click();
		Fname.sendKeys(first);
		Lname.sendKeys(last);
		email.sendKeys(Email);
		pwd.sendKeys(password);
		cpwd.sendKeys(confirpassword);
		Rbutton.click();
	}
	
	public String user() {
		String acc=account.getText();
		return acc;
	}

}

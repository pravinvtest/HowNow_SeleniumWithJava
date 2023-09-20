package com.HowNow.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPoHownow extends BasePO {
	// click on get started
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement getStartedButton;

	@FindBy(xpath = "//input[@id='subdomain']")
	private WebElement domainTextBox;

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement emailID;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement userpassword;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	public void clickonGetStratedButton(String domain) {
		domainTextBox.sendKeys(domain);
		getStartedButton.click();
	}

	public void loginWithCredentials(String username, String password) {
		emailID.sendKeys(username);
		userpassword.sendKeys(password);
		System.out.println("in method passowrd is " + password);
		loginButton.click();
	}

}
package com.HowNow.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO2NewPortal extends BasePO {

	// This method is used for finding webElement of Create here

	// This method is used for finding webElement of User Name
	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement userNameLocator;

	// This method is used for finding webElement of Password
	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement passwordLocator;

	// locator for Sign In
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInButtonLocator;

	// user profile
	@FindBy(xpath = "//div[contains(@class,'user-image')]")
	private WebElement userProfile;

	// logout button
	@FindBy(xpath = "//span[contains(text(),'LOGOUT')]")
	private WebElement logoutButton;

	public void scrollup(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}

	public void login(String userNameData, String password) throws InterruptedException {
		waitForVisibility(userNameLocator);
		userNameLocator.sendKeys(userNameData);
		Thread.sleep(2000);
		highLighterMethod(passwordLocator);
		passwordLocator.sendKeys(password);
		Thread.sleep(2000);
		signInButtonLocator.click();
		waitForVisibility(userProfile);
	}

	public void logout() throws InterruptedException {
		highLighterMethod(userProfile);
		userProfile.click();
		Thread.sleep(2000);
		highLighterMethod(logoutButton);
		logoutButton.click();
		Thread.sleep(3000);
	}
}
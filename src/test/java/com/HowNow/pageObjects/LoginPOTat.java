package com.HowNow.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOTat extends BasePO {

	// This method is used for finding webElement of User Name
	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement userNameLocator;

	// This method is used for finding webElement of Password
	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement passwordLocator;

	// locator for Sign In
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInButtonLocator;
	
	// healthcare provide list
	@FindBy(xpath = "//span[normalize-space()='Healthcare Provider List']")
	private WebElement healthCareProviderList;
	
	@FindBy(xpath = "//div[@class='user-image']")
	private WebElement profileButton;
	
	@FindBy(xpath = "//span[normalize-space()='LOGOUT']")
	private WebElement logoutButton;

	/**
	 * This method is used for performing click operation on validate button
	 * 
	 * @throws InterruptedException
	 */

	/**
	 * This method is used for performing click operation on validate button
	 * 
	 * @throws InterruptedException
	 */

	/**
	 * This method is used for performing scrolling operation
	 * 
	 * @param driver
	 */

	public void scrollup(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}

	/**
	 * This method is used for performing User operation on validate text-box
	 * 
	 * @throws InterruptedException
	 */

	public void login(String userNameData, String password1, WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		highLighterMethod(userNameLocator);
		userNameLocator.sendKeys(userNameData);
		Thread.sleep(2000);
		highLighterMethod(passwordLocator);
		passwordLocator.sendKeys(password1);
		Thread.sleep(2000);
		highLighterMethod(signInButtonLocator);
		signInButtonLocator.click();
		Thread.sleep(12000);
	}
	
	public void logout() throws InterruptedException {
		highLighterMethod(profileButton);
		profileButton.click();
		Thread.sleep(2000);
		highLighterMethod(logoutButton);
		logoutButton.click();
		Thread.sleep(2000);
	}

}
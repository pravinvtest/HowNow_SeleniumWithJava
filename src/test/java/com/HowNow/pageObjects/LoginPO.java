package com.HowNow.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HowNow.tests.BaseDriverUtil;

public class LoginPO extends BasePO {

	// This method is used for finding webElement of Create here
	@FindBy(xpath = "//*[text()='Create here']")
	private WebElement createHereLocator;

	// This method is used for finding webElement of User Name
	@FindBy(xpath = "//input[@name='txtUserName']")
	private WebElement userNameLocator;

	// This method is used for finding webElement of Password
	@FindBy(xpath = "//input[@Name='txtPassword']")
	private WebElement passwordLocator;

	// login with exist data
	@FindBy(xpath = "(//input[@id='txtUserName'])[1]")
	private WebElement userName;

	// Login password
	@FindBy(xpath = "(//input[@id='txtPassword'])[1]")
	private WebElement password;

	// locator for Login
	@FindBy(xpath = "//a[@id='btnLogin']")
	private WebElement loginButtonLocator;

	// locator for ClaimDashboard
	@FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']//h2")
	private WebElement claimDashBoardTextLocator;

	// Logout Button Locator
	@FindBy(xpath = "//a[contains(@id,'btnLogout')]")
	private WebElement logoutButtonLocator;

	// Validation message Locator
	@FindBy(xpath = "//p[@id='lblerrLogin']")
	private WebElement errorMessageLocator;

	@FindBy(xpath = "//label[@id='txtUserName-error']")
	private WebElement userNameErrorLocator;

	@FindBy(xpath = "//label[@id='txtPassword-error']")
	private WebElement passwordErrorLocator;

	public WebElement getclaimDashBoardTextLocator() {
		highLighterMethod(claimDashBoardTextLocator);
		return claimDashBoardTextLocator;
	}

	public WebElement geterrorMessageLocator() {
		highLighterMethod(errorMessageLocator);
		return errorMessageLocator;
	}

	public WebElement getuserNameErrorLocator() {
		highLighterMethod(userNameErrorLocator);
		return userNameErrorLocator;
	}

	public WebElement getpasswordErrorLocator() {
		highLighterMethod(passwordErrorLocator);
		return passwordErrorLocator;
	}

	public WebElement getloginButtonLocator() {
		highLighterMethod(loginButtonLocator);
		return loginButtonLocator;
	}
	
	public WebElement getloginButtonLocatorForColorCheck() {
		return loginButtonLocator;
	}

	/**
	 * This method is used for performing click operation on validate button
	 * 
	 * @throws InterruptedException
	 */

	public void clickOncreateHere() throws InterruptedException {
		highLighterMethod(createHereLocator);
		createHereLocator.click();
	}

	/**
	 * This method is used for performing click operation on validate button
	 * 
	 * @throws InterruptedException
	 */

	public boolean verifyLoginPageNavigation() throws InterruptedException {

		boolean res = false;
		try {
			highLighterMethod(userNameLocator);
			res = userNameLocator.isDisplayed();
		} catch (Exception e) {

		}
		return res;
	}

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

	public void login1(String userNameData, String password1) throws InterruptedException {
		highLighterMethod(userName);
		userName.sendKeys(userNameData);
		Thread.sleep(2000);
		highLighterMethod(password);
		password.sendKeys(password1);
		Thread.sleep(2000);
		highLighterMethod(loginButtonLocator);
		loginButtonLocator.click();
		Thread.sleep(12000);  /*
		BaseDriverUtil s= new BaseDriverUtil();
		try {
			WebDriverWait firstResult = new WebDriverWait(s.driver, Duration.ofSeconds(80));
			firstResult.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@id,'btnLogout')]")));
		} catch (Exception e) {
			
		}*/
		
	}

	public void logout() throws InterruptedException {
		highLighterMethod(logoutButtonLocator);
		logoutButtonLocator.click();
	}
	
	public void login(String userNameData, String password1) throws InterruptedException {
		highLighterMethod(userName);
		userName.sendKeys(userNameData);
		Thread.sleep(2000);
		highLighterMethod(password);
		password.sendKeys(password1);
		Thread.sleep(2000);
		highLighterMethod(loginButtonLocator);
		loginButtonLocator.click();
		Thread.sleep(12000);  
		BaseDriverUtil s= new BaseDriverUtil();
		WebDriverWait firstResult = new WebDriverWait(s.driver, Duration.ofSeconds(80));
		firstResult.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@id,'btnLogout')]")));	
	}

}
package com.HowNow.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor.Base;

public class SettingsPO extends BasePO{
	
	@FindBy(xpath = "//i[@class='fa fa-wrench']")
	private WebElement settingsLocator;
	
	@FindBy(xpath = "//a[@href='ChangePassword2.aspx']")
	private WebElement changePasswordMenuLocator;
	
	@FindBy(css = "div[class='col-lg-10'] h2")
	private WebElement changePasswordTitleLocator;
	
	@FindBy(xpath = "(//div[@class='ibox-title']/h5)[1]")
	private WebElement chooseNewPasswordTitleLocator;
	
	@FindBy(xpath = "(//div[@class='ibox-title']/h5)[2]")
	private WebElement howToSecureYourPasswordTitleLocator;
	
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement saveButtonLocator;
	
	@FindBy(xpath = "//button[@id='btnCancel']")
	private WebElement cancelButtonLocator;
	
	@FindBy(xpath = "(//div[@class='ibox ']//label)[2]")
	private WebElement oldPasswordLocator;
	
	@FindBy(xpath = "(//div[@class='ibox ']//label)[3]")
	private WebElement newPasswordLocator;
	
	@FindBy(xpath = "(//div[@class='ibox ']//label)[4]")
	private WebElement confirmNewPassword;
	
	@FindBy(id = "txtNewPassword")
	private WebElement newPasswordTextbox;
	
	@FindBy(id = "txtOldPassword")
	private WebElement OldPasswordTextbox;
	
	@FindBy(id = "txtConfirmNewPassword")
	private WebElement confirmNewPasswordTextbox;
	
	@FindBy(xpath = "//label[@id='lblerror']")
	private WebElement pleaseFillRequiredField;
	
	public void clickOnSettingsTab() throws InterruptedException {	
		settingsLocator.click();
		highLighterMethod(settingsLocator);
		Thread.sleep(2000);
	}
	
	public void clickOnchangePasswordMenu() throws InterruptedException {			
		changePasswordMenuLocator.click();
		highLighterMethod(changePasswordMenuLocator);
		Thread.sleep(3000);
	}
	
	public WebElement getChangePasswordTitleText() {
		highLighterMethod(changePasswordTitleLocator);
		return changePasswordTitleLocator;
	}
	
	public WebElement getChooseNewPasswordTitleText() {
		highLighterMethod(chooseNewPasswordTitleLocator);
		return chooseNewPasswordTitleLocator;
	}
	
	public WebElement getHowToSecureYourPasswordTitleText() {
		highLighterMethod(howToSecureYourPasswordTitleLocator);
		return howToSecureYourPasswordTitleLocator;
	}
	
	public boolean isSaveButtonDisplayed() {
		Boolean b= saveButtonLocator.isDisplayed();
		highLighterMethod(saveButtonLocator);
		return b;
	}
	
	public boolean isCancelButtonDisplayed() {
		Boolean b= cancelButtonLocator.isDisplayed();
		highLighterMethod(cancelButtonLocator);
		return b;
	}
	
	public boolean isSaveButtonEnabled() {
		boolean b= saveButtonLocator.isEnabled();
		return b;
	}
	
	public boolean isCancelButtonEnabled() {
		Boolean b= cancelButtonLocator.isEnabled();
		return b;
	}
	
	public WebElement getOldPasswordTitleText() {
		highLighterMethod(oldPasswordLocator);
		return oldPasswordLocator;
	}
	
	public WebElement getNewPasswordTitleText() {
		highLighterMethod(newPasswordLocator);
		return newPasswordLocator;
	}
	
	public WebElement getConfirmNewPasswordTitleText() {
		highLighterMethod(confirmNewPassword);
		return confirmNewPassword;
	}
	
	public void enterNewPassword(String newPassword) throws InterruptedException {
		Thread.sleep(2000);
		highLighterMethod(newPasswordTextbox);
		newPasswordTextbox.sendKeys(newPassword);
	}
	
	public void enterConfirmNewPassword(String confirmNewPassword) throws InterruptedException {
		Thread.sleep(2000);
		highLighterMethod(confirmNewPasswordTextbox);
	    confirmNewPasswordTextbox.sendKeys(confirmNewPassword);
	}
	
	public void clickOnSave() {
		highLighterMethod(saveButtonLocator);
		saveButtonLocator.click();
	}
	
	public WebElement getPleaseFillRequiredFieldErrorText() {
		highLighterMethod(pleaseFillRequiredField);
		return pleaseFillRequiredField;
	}
	
	public void enterOldPassword(String oldPassword) throws InterruptedException {
		Thread.sleep(2000);
		highLighterMethod(OldPasswordTextbox);
		OldPasswordTextbox.sendKeys(oldPassword);
	}

}

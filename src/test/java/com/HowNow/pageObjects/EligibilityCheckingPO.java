package com.HowNow.pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class EligibilityCheckingPO {

	// WebElement of Eligibility Checking Menu title
	@FindBy(xpath = "//a[@title='Eligibility Checking']")
	private WebElement eligibilityCheckingTitle;

	// WebElement of Eligibility Verification title
	@FindBy(xpath = "//h3[text()='Eligibility Verification ']")
	private WebElement eligibilityVerificationTitle;

	// WebElement of card tab
	@FindBy(xpath = "//*[@id='ulEligibilityTabs']//label[1]")
	private WebElement cardTab;

	// WebElement of policy tab
	@FindBy(xpath = "//*[@id='ulEligibilityTabs']//label[2]")
	private WebElement policyTab;

	// WebElement of Other Id tab
	@FindBy(xpath = "//*[@id='ulEligibilityTabs']//label[3]")
	private WebElement otherIdTab;

	// WebElement of Check Eligibility Button
	@FindBy(id = "btnCheckEligibilityorSearchbyPolicy")
	private WebElement checkEligibilityButton;

	// WebElement of Service date
	@FindBy(xpath = "//h2[text()='Service Date:']")
	private WebElement serviceDate;

	// WebElement of card number textbox
	@FindBy(xpath = "//*[text()='Card Number']/following-sibling::input")
	private WebElement CardNumberTextbox;

	// WebElement of Type dropdown
	@FindBy(xpath = "//span[text()='Select Type']")
	private WebElement typeDropdown;

	// WebElement of Type dropdown
	@FindBy(xpath = "//div[@id='divPayers']//div//label")
	private WebElement payer;

	// WebElement of Type dropdown
	@FindBy(xpath = "//label[@id='firstNameLabel']")
	private WebElement firstname;

	// WebElement of Type dropdown
	@FindBy(xpath = "//label[@id='lastNameLabel']")
	private WebElement familyName;

	// WebElement of Type dropdown
	@FindBy(xpath = "//label[text()='ID Type']")
	private WebElement idTypeDropdown;

	// WebElement of Type dropdown
	@FindBy(xpath = "//input[@id='txtIDTypeValue']")
	private WebElement idTypeTextbox;

	// WebElement of Type dropdown
	@FindBy(xpath = "//div[@class='widget p-sm text-center']//h3")
	private WebElement dateAndTimePick;

	// WebElement of Type dropdown
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolderBody_txtCardNumber']")
	private WebElement cardNumber;

	// WebElement of Type dropdown
	@FindBy(xpath = "//input[@id='txtYearofBirth']")
	private WebElement yearOfBirth;

	// WebElement of Type dropdown
	@FindBy(xpath = "//input[@id='txtName']")
	private WebElement nameLocator;

	public void enterCardNumber(String value) throws InterruptedException {
		cardNumber.sendKeys(value);
		Thread.sleep(3000);
	}

	public void enterYearOfBirth(String value) throws InterruptedException {
		yearOfBirth.sendKeys(value);
		Thread.sleep(3000);
	}
	
	public WebElement getYearOfBirth() throws InterruptedException {
		return yearOfBirth;
	}

	public void enterName(String value) {
		nameLocator.sendKeys(value);
	}

	public String getCurrentDateAndTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = new Date();
		String currentDateAndTime = dateFormat.format(date1);
		return currentDateAndTime;
	}

	public String expectedDateAndTime() {
		String date = dateAndTimePick.getText();
		return date;
	}

	public WebElement getIdTypeDropdown() {
		return idTypeDropdown;
	}

	public boolean getIdTypeTextbox() {
		boolean txtbox = idTypeTextbox.isDisplayed();
		return txtbox;
	}

	public void clickOnEligibilityChecking() throws InterruptedException {
		eligibilityCheckingTitle.click();
	}

	public WebElement eligibilityverificationTitle() {
		return eligibilityVerificationTitle;
	}

	public WebElement cardTabTitle() {
		return cardTab;
	}

	public WebElement policyTabTitle() {
		return policyTab;
	}

	public void clickOnpolicyTab() {
		policyTab.click();
	}

	public void clickOnCheckEligibilityButton() {
		checkEligibilityButton.click();
	}

	public WebElement otherIdTabTitle() {
		return otherIdTab;
	}

	public boolean checkEligibilityButton() {
		boolean checkEligibityButton = checkEligibilityButton.isDisplayed();
		return checkEligibityButton;
	}

	public WebElement serviceDateTitle() {
		return serviceDate;
	}

	public String getColorCode() {

		String bckgclr = cardTab.getCssValue("background-color");
		String colorValue = Color.fromString(bckgclr).asHex();
		return colorValue;
	}

	public Boolean cardNumberTxt() {
		return CardNumberTextbox.isDisplayed();
	}

	public Boolean typeDropdown() {
		return typeDropdown.isDisplayed();
	}

	public String getColorCodePolicyTab() {

		String bckgclr = policyTab.getCssValue("background-color");
		String colorValue = Color.fromString(bckgclr).asHex();
		return colorValue;
	}

	public String getColorCodeOtheridTab() {

		String bckgclr = otherIdTab.getCssValue("background-color");
		String colorValue = Color.fromString(bckgclr).asHex();
		return colorValue;
	}

	public WebElement getPayer() {
		return payer;
	}

	public WebElement getFirstnameTitle() {
		return firstname;
	}

	public WebElement getFamilyNameTitle() {
		return familyName;
	}

	public void clickOnOtherIdTab() {
		otherIdTab.click();
	}

}

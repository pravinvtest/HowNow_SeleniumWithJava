package com.HowNow.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserRegistrationPO {



// ***************** Start Elements *********************************

	// This method is used for finding webElement of Create here
	@FindBy(xpath = "//*[text()='New User Registration ']")
	private WebElement newUserRegistration;

	// This method is used for finding webElement of sign In Button
	@FindBy(xpath = "//*[text()='Sign in']")
	private WebElement signIn;

	// This method is used for finding webElement of First Name
	@FindBy(xpath = "//input[@name='txtFirstName']")
	private WebElement txtFirstName;

	// This method is used for finding webElement of Middle Name
	@FindBy(xpath = "//input[@name='txtMiddleName']")
	private WebElement txtMiddleName;

	// This method is used for finding webElement of Last Name
	@FindBy(xpath = "//input[@name='txtLastName']")
	private WebElement txtLastName;

	// This method is used for finding webElement of Email
	@FindBy(xpath = "//input[@name='txtEmail']")
	private WebElement txtEmail;

	// This method is used for finding webElement of Confirm Email
	@FindBy(xpath = "//input[@name='txtConfirmEmail']")
	private WebElement txtConfirmEmail;

	// This method is used for finding webElement of Job Position chosen
	@FindBy(xpath = "//*[@id='cmbJobPosition_chosen']")
	private WebElement cmbJobPosition_chosen;

	// This method is used for finding webElement of Job Position List Drop Down
	@FindBy(xpath = "//ul[@class='chosen-results']//li")
	private List<WebElement> jobPositionListDropDown;

	// This method is used for finding webElement of Provider Name
	@FindBy(xpath = "//input[@name='txtProviderName']")
	private WebElement txtProviderName;

	// This method is used for finding webElement of Password
	@FindBy(xpath = "//input[@name='txtPassword']")
	private WebElement txtPassword;

	// This method is used for finding webElement of Confirm Password
	@FindBy(xpath = "//input[@name='txtConfirmPassword']")
	private WebElement txtConfirmPassword;

	// This method is used for finding webElement of Secret Question chosen
	@FindBy(xpath = "//*[@id='cmbSecretQuestion_chosen']")
	private WebElement cmbSecretQuestion_chosen;

	// This method is used for finding webElement of Secret Question List Drop Down
	@FindBy(xpath = "//ul[@class='chosen-results']//li")
	private List<WebElement> secretQuestionListDropDown;

	// This method is used for finding webElement of Secret Answer
	@FindBy(xpath = "//input[@name='txtSecretAnswer']")
	private WebElement txtSecretAnswer;

	// This method is used for finding webElement of Save Button
	@FindBy(xpath = "//*[@name='btnSave']")
	private WebElement btnSave;

	// This method is used for finding webElement of Save Button
	@FindBy(xpath = "//*[contains(text(),'Password is too short')]")
	private WebElement passwordError;

// ***************** End Elements *********************************				

	// This method is used to verifyPasswordErrorMessage
	public void verifyPasswordErrorMessage() {

		passwordError.isDisplayed();
	}

	// This method is used to click on job position
	public void clickOnJobPosition() {
		cmbJobPosition_chosen.click();
	}

	// This method is used to click on job position drop down
	public void selectJobPosition(String position) throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 0; i < jobPositionListDropDown.size(); i++) {

			String val = jobPositionListDropDown.get(i).getText();

			if (val.equalsIgnoreCase(position)) {
				jobPositionListDropDown.get(i).click();
				System.out.println("Successfully Selected- " + position);
				break;
				// Need to Add Extent report here
			}

		}

	}

	// This method is used to click on job position dropdown
	public void verifyJobPositionDropdown() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 0; i < jobPositionListDropDown.size(); i++) {

			String val = jobPositionListDropDown.get(i).getText();

			if (val.length() > 0) {
				System.out.println("Successfully verified Dropdown value- " + val);
				// Need to Add Extent report here
			}

		}

	}

	// This method is used to Click on Secret Question Drop Down
	public void clickOnSecretQuestionDropdown() {
		cmbSecretQuestion_chosen.click();

	}

	// This method is used to click on secret Question List Drop Down
	public void selectSecretQuestion(String question) throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 0; i < secretQuestionListDropDown.size(); i++) {

			String val = secretQuestionListDropDown.get(i).getText();

			if (val.equalsIgnoreCase(question)) {
				secretQuestionListDropDown.get(i).click();
				System.out.println("Successfullyslected question- " + question);
				break;

				// Need to Add Extent report here
			}

		}

	}

	// This method is used to click on secret Question List Drop Down
	public void verifySecretQuestionDropDown() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 0; i < secretQuestionListDropDown.size(); i++) {

			String val = secretQuestionListDropDown.get(i).getText();

			if (val.length() > 0) {
				System.out.println("Successfully verified Dropdown value- " + val);
				// Need to Add Extent report here
			}

		}

	}

	// // This method is used to Click On enterPassword
	// public void clickOnenterPassword (){
	// txtPassword.click();
	//
	// }

	// This method is used to return newUserRegistration
	public void verifyNewUserRegistrationPage() {
		newUserRegistration.isDisplayed();
	}

	// This method is used to Click On SignIn Button
	public void clickOnSign() {
		signIn.click();
	}

	// This method is used to Enter First Name
	public void enterFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);

	}

	// This method is used to Enter Middle Name
	public void enterMiddleName(String middleName) {
		txtMiddleName.sendKeys(middleName);

	}

	// This method is used to Enter Last Name
	public void enterLastName(String lastName) {
		txtLastName.sendKeys(lastName);

	}

	// This method is used to Enter Email
	public void enterEmail(String email) {
		txtEmail.sendKeys(email);

	}

	// This method is used to Enter Confirm Email
	public void enterConfirmEmail(String confirmEmail) {
		txtConfirmEmail.sendKeys(confirmEmail);

	}

	// This method is used to enterBusinessProviderName
	public void enterBusinessProviderName(String providerName) {
		txtProviderName.sendKeys(providerName);

	}

	// This method is used to Enter Password
	public void enterPassword(String password) {
		txtPassword.sendKeys(password);

	}

	// This method is used to enterConfirmPassword
	public void enterConfirmPassword(String confirmPassword) {
		txtConfirmPassword.sendKeys(confirmPassword);

	}

	// click on confirm password
	public void clickOnConfirmPassword() {
		txtConfirmPassword.click();

	}

	// click on Answer
	public void enterAnswer(String answer) {
		txtSecretAnswer.sendKeys(answer);

	}

	// This method is used to Click On Save Button
	public void clickOnSaveButton() {
		btnSave.click();

	}

	/**
	 * This method is used to scroll down the page
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */

	public void scrollUp(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	/**
	 * This method is used to scroll down the page
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */

	public void scrolldown(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

}
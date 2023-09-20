package com.HowNow.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HowNow.reusemethods.DriverUtils;

public class SearchPO extends BasePO{

	@FindBy(xpath = "//a[@href='Inquiry2.aspx']")
	private WebElement createSearchLocator;

	@FindBy(css = "div[class='col-sm-4'] h2")
	private WebElement searchDashBoardTextLocator;

	@FindBy(xpath = "//li[@id='claim-search-tab']//a")
	private WebElement claimSearchTabLocator;

	@FindBy(xpath = "//li[@id='batch-search-tab']//a")
	private WebElement batchSearchTabLocator;

	@FindBy(xpath = "//li[@id='claimsSummaryTabTitle']//a")
	private WebElement claimSummaryTabLocator;

	@FindBy(xpath = "(//div[contains(@class,'ibox-title custom-border')])[1]")
	private WebElement memberInformationLocator;

	@FindBy(xpath = "(//div[contains(@class,'ibox-title custom-border')])[2]")
	private WebElement claimInformationLocator;

	@FindBy(xpath = "//label[@for='txtMaxrows']")
	private WebElement maximumReturnedRowsLocator;

	@FindBy(xpath = "//a[@id='toggleButton']")
	private WebElement advancedSearchLocator;

	@FindBy(xpath = "//a[@id='btnBasicExecuteSearch']")
	private WebElement searchBtnLocator;

	@FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolderBody_cmbBasicPayer']//parent::div/label[1]")
	private WebElement payerTextBoxLocator;

	@FindBy(xpath = "//label[@for='txtBasicCardNumber']")
	private WebElement memberCardTxtBox;

	@FindBy(xpath = "//label[@id='ctl00_ContentPlaceHolderBody_lblBasicIDTypes']")
	private WebElement nationalIDRadioButton;

	@FindBy(xpath = "//input[@id='txtBasicBeneficiaryName']//parent::div/label")
	private WebElement memberNameTxtBox;

	@FindBy(xpath = "//table[@id='tbl_Authorized']//tbody/tr[1]/td[4]")
	private WebElement claimdata;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbBasicPayer_chosen']/a")
	private WebElement payerDropdown;

	@FindBy(xpath = "//div[@class='col-sm-12 m-b-md']//a[@id='btnBasicExecuteSearch']")
	private WebElement clickSearchBtnLocator;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbBasicPayer_chosen']/div[1]/div/input")
	private WebElement searchAutoComplete;

	@FindBy(xpath = "//a[@id='btnBasicExecuteSearch']")
	private WebElement searchPayerDropdownresult;
	
	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbBasicPayer_chosen']//a//span")
	private WebElement searchPayerDropdown;
	
	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbBasicPayer_chosen']//div//div//input[@type='text']")
	private WebElement searchPayerDropdownText;
	
	@FindBy(xpath = "//ul[@class='chosen-results']/li/em")
	private WebElement selectSearchPayer;
	
	@FindBy(xpath = "//*[text()='No claims available']")
	private WebElement emptyClaimsList;
	
	@FindBy(xpath = "//div[@id='tblMain_info']")
	private WebElement claimsCountLocator;
	
	@FindBy(xpath = "//div[@class='heading']")
	private WebElement searchClaimLocator;
	
	public WebElement getClaimsAvailableCountsLocator() {
		highLighterMethod(claimsCountLocator);
		return claimsCountLocator;
	}

	public WebElement getClaimDataLocator() {
		return claimdata;
	}

	public WebElement getPayerLocator() {
		return payerDropdown;
	}

	// locator for searchDashboard
	public WebElement getsearchDashBoardText() {
		return searchDashBoardTextLocator;
	}

	// locator for Claim Search
	public WebElement getclaimSearchTab() {
		return claimSearchTabLocator;
	}

	// locator for batch Search
	public WebElement getbatchSearchTab() {
		return batchSearchTabLocator;
	}

	// locator for batch Search
	public WebElement getclaimsSummaryTab() {
		return claimSummaryTabLocator;
	}

	// locator for member Information Tab
	public WebElement getmemberInformationTab() {
		return memberInformationLocator;
	}

	// locator for Claim Information Tab
	public WebElement getclaimInformation() {
		return claimInformationLocator;
	}

	// locator for Maximum Returned Rows
	public WebElement getmaximumReturnedRows() {
		return maximumReturnedRowsLocator;
	}

	// locator for Advanced Search Hyperlink
	public WebElement getadvancedSearch() {
		return advancedSearchLocator;
	}

	// locator for Search Button
	public WebElement getsearchBtn() {
		return searchBtnLocator;
	}

	// locator for Search Button
	public WebElement getpayerTextBox() {
		return payerTextBoxLocator;
	}

	// locator for Search Button
	public WebElement getmemberCardTxtBox() {
		return memberCardTxtBox;
	}

	// locator for Search Button
	public WebElement getnationalIDRadioButton() {
		return nationalIDRadioButton;
	}

	// locator for Search Button
	public WebElement getmemberNameTxtBox() {
		return memberNameTxtBox;
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
	 * This method is used for performing click operation on Search Tab
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnSearch() throws InterruptedException {
		createSearchLocator.click();
		Thread.sleep(3000);
	}

	/**
	 * This method is used for performing click operation on Search Tab
	 * 
	 * @throws InterruptedException
	 */

	/**
	 * This method is used for performing click operation on Search Tab
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnSearchBtn(WebDriver driver) throws InterruptedException {
		clickSearchBtnLocator.click();
		DriverUtils.waitForElement(driver);
	}

	public void clickOnPayerDropdownResults(String Name) throws InterruptedException {

		Thread.sleep(2000);
		searchPayerDropdown.click();
		Thread.sleep(2000);
		searchPayerDropdownText.sendKeys(Name);
		Thread.sleep(2000);
		selectSearchPayer.click();
		Thread.sleep(3000);
		searchPayerDropdownresult.click();
		Thread.sleep(6000);
	}
	
	public WebElement getSearchClaimLocator() {
		waitForVisibility(searchClaimLocator);
		highLighterMethod(searchClaimLocator);
		return searchClaimLocator;
	}
	
}

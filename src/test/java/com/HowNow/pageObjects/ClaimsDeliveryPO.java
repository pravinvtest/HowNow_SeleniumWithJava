package com.HowNow.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimsDeliveryPO extends BasePO{
	
	@FindBy(xpath = "//i[@class='fa fa-bicycle']")
	private WebElement claimsDeliveryTabLocator;
	
	@FindBy(xpath = "//a[@href='ClaimsBatch2.aspx']")
	private WebElement createBatchTabLocator;
	
	@FindBy(css = "div[class='col-sm-4'] h2")
	private WebElement claimsDeliveryDashBoardTitleLocator;
	
	@FindBy(xpath = "//div[@class='icheckbox_square-green']")
	private WebElement checkboxLocator;
	
	@FindBy(id = "txtTransactionDate")
	private WebElement tillTransactionDate;
	
	@FindBy(id = "btnShowUndeliveredClaims")
	private WebElement showClaimsButton;
	
	@FindBy(xpath = "//div[@id='tbl_NotInvoicedClaims_info']")
	private WebElement claimsCountLocator;
	
	@FindBy(xpath = "//input[@id='txtClaimReference']")
	private WebElement authorizationNumber;
	
	@FindBy(xpath = "//span[@class='input-group-addon']")
	private WebElement calendarIcon;
	
	@FindBy(xpath = "(//table[@class='table-condensed']//tbody//td[@class='day'])[1]")
	private WebElement calendarDate;
	
	@FindBy(xpath = "//span[@id='notInvoicedClaimTitle']")
	private WebElement undeliveredClaims;
	
	@FindBy(xpath = "//div[@id='tbl_NotInvoicedClaims_length']")
	private WebElement displayRecordsDropdown;
	
	@FindBy(xpath = "//input[@aria-controls='tbl_NotInvoicedClaims']")
	private WebElement searchDropdown;
	
	@FindBy(xpath = "//div[@id='tbl_NotInvoicedClaims_wrapper']//a[@class='btn btn-default buttons-excel buttons-html5']")
	private WebElement exportToExcelButton;
	
	@FindBy(xpath = "//div[@id='tbl_NotInvoicedClaims_info']")
	private WebElement gotTheTotalText;
	
	@FindBy(xpath = "//li[@class='paginate_button previous disabled']//a")
	private WebElement previousPage;
	
	@FindBy(xpath = "//li[@class='paginate_button active']//a")
	private WebElement pageNumber;
	
	@FindBy(xpath = "//li[@class='paginate_button next']//a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//table[@id='tbl_NotInvoicedClaims']//tr[1]//th[1]")
	private WebElement date;
	
	@FindBy(xpath = "//table[@id='tbl_NotInvoicedClaims']//tr[1]//th[2]")
	private WebElement reference;
	
	@FindBy(xpath = "//table[@id='tbl_NotInvoicedClaims']//tr[1]//th[3]")
	private WebElement type;
	
	@FindBy(xpath = "//table[@id='tbl_NotInvoicedClaims']//tr[1]//th[4]")
	private WebElement patientName;
	
	@FindBy(xpath = "//table[@id='tbl_NotInvoicedClaims']//tr[1]//th[5]")
	private WebElement addInvoice;
	
	@FindBy(xpath = "//ol[@class='breadcrumb']")
	private WebElement pathNavigation;
	
	@FindBy(xpath = "//a[@id='notdelivered']")
	private WebElement claimsNotDeliveredTab;
	
	@FindBy(xpath = "//label[@for='transDate']")
	private WebElement tillTransactionDateText;
	
	@FindBy(xpath = "//input[@id='txtClaimReference']/parent::div/label")
	private WebElement authorizationNumberText;
	
	@FindBy(xpath = "//div[@class='i-checks ']")
	private WebElement showOnlyExpiredBillsCheckbox;
	
	public void clickOnCreateBatchTab() throws InterruptedException {
		highLighterMethod(claimsDeliveryTabLocator);
		claimsDeliveryTabLocator.click();
		Thread.sleep(1000);
		highLighterMethod(createBatchTabLocator);
		createBatchTabLocator.click();
	}
	
	public WebElement getClaimsDeliveryDashBoardTitle() {
		highLighterMethod(claimsDeliveryDashBoardTitleLocator);
		return claimsDeliveryDashBoardTitleLocator;
	}
	
	public void clickOnShowOnlyExpiredBillsCheckbox() throws InterruptedException {
		highLighterMethod(checkboxLocator);
		checkboxLocator.click();
		Thread.sleep(1000);
	}
	
	public void clickOnTillTransactionDate(String date) throws InterruptedException {
		highLighterMethod(tillTransactionDate);
		tillTransactionDate.click();
		Thread.sleep(1000);
		tillTransactionDate.sendKeys(date);
		tillTransactionDate.sendKeys(Keys.ENTER);
	}
	
	public void clickOnShowClaims() throws InterruptedException {
		highLighterMethod(showClaimsButton);
		showClaimsButton.click();
		Thread.sleep(1000);
	}
	
	public WebElement calendarTable() throws InterruptedException {
		highLighterMethod(tillTransactionDate);
		return tillTransactionDate;
	}

	public WebElement getClaimsAvailableCountsLocator() {
		highLighterMethod(claimsCountLocator);
		return claimsCountLocator;
	}
	
	public void enterAutorizationNumber(String value) {
		highLighterMethod(authorizationNumber);
		authorizationNumber.sendKeys(value);
		
	}
	
	public void clickOnCalendarIcon() throws InterruptedException {
		highLighterMethod(calendarIcon);
		calendarIcon.click();
		Thread.sleep(1000);
	}
	
	public void clickOnCalendarDate() throws InterruptedException {
		highLighterMethod(calendarDate);
		calendarDate.click();
		Thread.sleep(1000);
	}
	
	public WebElement getUndeliveredClaimTitle() {
		highLighterMethod(undeliveredClaims);
		return undeliveredClaims;
	}
	
	public boolean getDisplayRecordDropdown() {		
		highLighterMethod(displayRecordsDropdown);
		boolean s=displayRecordsDropdown.isDisplayed();
		return s;
	}
	
	public boolean getSearch() {
		highLighterMethod(searchDropdown);
		boolean s=searchDropdown.isDisplayed();
		return s;
	}
	
	public boolean getExportToExcel() {
		highLighterMethod(exportToExcelButton);
		boolean s=exportToExcelButton.isDisplayed();
		return s;
	}
	
	public WebElement getGotTheTotalOf() {
		highLighterMethod(gotTheTotalText);
		return gotTheTotalText;
	}
	
	public WebElement getPreviousPage() {
		highLighterMethod(previousPage);
		return previousPage;
	}
	
	public WebElement getNextPage() {
		highLighterMethod(nextPage);
		return nextPage;
	}
	
	public WebElement getpageNumber() {
		highLighterMethod(pageNumber);
		return pageNumber;
	}
	
	public WebElement getDateTitle() {
		highLighterMethod(date);
		return date;
	}
	
	public WebElement getReferenceTitle() {
		highLighterMethod(reference);
		return reference;
	}
	
	public WebElement getTypeTitle() {
		highLighterMethod(type);
		return type;
	}
	
	public WebElement getPatientNameTitle() {
		highLighterMethod(patientName);
		return patientName;
	}
	
	public WebElement getAddInvoiceTitle() {
		highLighterMethod(addInvoice);
		return addInvoice;
	}
	
	public WebElement getPathNavigationTitle() {
		highLighterMethod(pathNavigation);
		return pathNavigation;
	}
	
	public WebElement getTillTransactionDateTitle() {
		highLighterMethod(tillTransactionDateText);
		return tillTransactionDateText;
	}
	
	public WebElement getAuthorizationNumberTitle() {
		highLighterMethod(authorizationNumberText);
		return authorizationNumberText;
	}
	
	public WebElement getShowOnlyExpiredBillsTitle() {
		highLighterMethod(showOnlyExpiredBillsCheckbox);
		return showOnlyExpiredBillsCheckbox;
	}
	
	public boolean isShowClaimButtonDisplayed() {
		highLighterMethod(showClaimsButton);
		boolean s=showClaimsButton.isDisplayed();
		return s;
	}
}

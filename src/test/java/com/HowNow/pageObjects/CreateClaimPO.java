package com.HowNow.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HowNow.reusemethods.DriverUtils;

public class CreateClaimPO {

	@FindBy(xpath = "//a[@title='Create Claim']")
	private WebElement createClaimMenu;

	@FindBy(xpath = "//h2[normalize-space()='Claim Registration']")
	private WebElement claimRegistration;

	@FindBy(xpath = "//div[@id='divFilter']//h3")
	private WebElement eligibilityVerification;

	@FindBy(xpath = "//div[@id='divMedicalInfo']/div[1]//h5")
	private WebElement medicalInformation;

	@FindBy(xpath = "//div[@id='divServiceInfo']/div/h5")
	private WebElement serviceItems;

	@FindBy(xpath = "//div[@id='divAttachments']/div/h5")
	private WebElement attachments;

	@FindBy(xpath = "//a[@id='ctl00_ContentPlaceHolderBody_Send']")
	private WebElement createClaimButton;

	@FindBy(xpath = "//i[@class='fa fa-calendar fa-3x  nextcare-color']")
	private WebElement calendarIcon;

	@FindBy(xpath = "//div[@class='m-b-md']/h2")
	private WebElement serviceDateText;

	@FindBy(xpath = "//div[@class='m-b-md']/h3/span")
	private WebElement serviceDate;

	@FindBy(xpath = "//button[@id='btnCheckEligibilityorSearchbyPolicy']")
	private WebElement searchPolicyButton;

	@FindBy(xpath = "//div[@data-toggle='buttons']/label[1]")
	private WebElement cardTab;

	@FindBy(xpath = "//div[@data-toggle='buttons']/label[2]")
	private WebElement policyTab;

	@FindBy(xpath = "//div[@data-toggle='buttons']/label[3]")
	private WebElement otherTab;

	@FindBy(xpath = "//textarea[@id='ctl00_ContentPlaceHolderBody_txtNotes']")
	private WebElement notesTextbox;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolderBody_btnPostNote']")
	private WebElement postNoteButton;

	@FindBy(xpath = "(//div[@class='ibox-content'])[4]/div[1]/div[2]/label")
	private WebElement attachmentOptional;

	@FindBy(xpath = "(//div[@class='ibox-content'])[4]/div[1]/div[2]/div//p")
	private WebElement dragFiles;

	@FindBy(xpath = "//div[@id='tblAttachments_wrapper']//tr[@role='row']/th[1]")
	private WebElement fileType;

	@FindBy(xpath = "//div[@id='tblAttachments_wrapper']//tr[@role='row']/th[2]")
	private WebElement fileName;

	@FindBy(xpath = "//div[@id='tblAttachments_wrapper']//tr[@role='row']/th[3]")
	private WebElement fileSize;

	@FindBy(xpath = "//div[@id='tblAttachments_wrapper']//tr[@role='row']/th[4]")
	private WebElement Notes;

	@FindBy(xpath = "(//div[@id='divMedicalInfo']//fieldset//label)[1]")
	private WebElement physician;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbPhysician_chosen']")
	private WebElement physicainTextBox;

	@FindBy(xpath = "(//div[@id='divMedicalInfo']//fieldset//label)[2]")
	private WebElement consultation;

	@FindBy(xpath = "//div[@id='divMedicalInfo']//div[3]//label")
	private WebElement consultationCalendarIcon;

	@FindBy(xpath = "//div[@id='divMedicalInfo']//fieldset/div[3]//label")
	private WebElement diagnosis;

	@FindBy(xpath = "(//div[@id='divMedicalInfo']//fieldset//div/span)[5]")
	private WebElement diagnosisToggle;

	@FindBy(xpath = "//button[@id='btnMultipleDiagnosis']")
	private WebElement diagnosisButton;

	@FindBy(xpath="//button[@id='btnMultipleDiagnosis']")
	private WebElement multipleDiagnosis;
	
	@FindBy(xpath = "(//div[@id='divMedicalInfo']//fieldset//label)[6]")
	private WebElement family;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderBody_cmbFamilyofCause_chosen']/a/span")
	private WebElement familyDropdown;

	@FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolderBody_cmbCause']")
	private WebElement causeDropdown;

	@FindBy(xpath = "(//div[@id='divMedicalInfo']//fieldset//label)[7]")
	private WebElement cause;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolderBody_txtCode']")
	private WebElement searchByCode;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolderBody_txtItemDescription']")
	private WebElement searchByDescription;
	
	@FindBy(xpath="//input[@id='txtEstimateCost']")
	private WebElement estimatedCost;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolderBody_txtInvoiceNumber']")
	private WebElement invoiceNumber;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolderBody_lblNumberOfItems']")
	private WebElement noOfItems;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolderBody_lblTotalPrice']")
	private WebElement totalPrice;
	
	@FindBy(xpath="//a[@id='LoadLabDiag']")
	private WebElement laboratory;
	
	@FindBy(xpath="//a[@id='LoadRadDiag']")
	private WebElement Radiology;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[1]")
	private WebElement itemCode;

	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[2]")
	private WebElement itemDescription;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[3]")
	private WebElement serviceName;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[4]")
	private WebElement dailyDosage;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[5]")
	private WebElement periodTreatment;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[10]")
	private WebElement unit;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[11]")
	private WebElement quantity;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[12]")
	private WebElement unitPrice;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[13]")
	private WebElement total;
	
	@FindBy(xpath="//table[@id='tblItems']//tr[1]/th[14]")
	private WebElement documentSubmission;
	
	
	public WebElement getCreateClaimMenu() {
		return createClaimMenu;
	}

	public WebElement getClaimRegistration() {
		return claimRegistration;
	}

	public WebElement getEligibilityVerification() {
		return eligibilityVerification;
	}

	public WebElement getMedicalInformation() {
		return medicalInformation;
	}

	public WebElement getServiceItems() {
		return serviceItems;
	}

	public WebElement getAttachments() {
		return attachments;
	}

	public WebElement getCreateClaimButton() {
		return createClaimButton;
	}

	public WebElement getCalendarIcon() {
		return calendarIcon;
	}

	public WebElement getServiceDateText() {
		return serviceDateText;
	}

	public WebElement getServiceDate() {
		return serviceDate;
	}

	public WebElement getSearchPolicyButton() {
		return searchPolicyButton;
	}

	public WebElement getCardTab() {
		return cardTab;
	}

	public WebElement getPolicyTab() {
		return policyTab;
	}

	public WebElement getOtherTab() {
		return otherTab;
	}

	public WebElement getAttachmentOptional() {
		return attachmentOptional;
	}

	public WebElement getDragFiles() {
		return dragFiles;
	}

	public WebElement getFileType() {
		return fileType;
	}

	public WebElement getFileName() {
		return fileName;
	}

	public WebElement getFileSize() {
		return fileSize;
	}

	public WebElement getNotes() {
		return Notes;
	}

	public WebElement getPostNoteButton() {
		return postNoteButton;
	}

	public WebElement getPhysician() {
		return physician;
	}

	public WebElement getPhysicainTextBox() {
		return physicainTextBox;
	}

	public WebElement getConsultation() {
		return consultation;
	}

	public WebElement getConsultationCalendarIcon() {
		return consultationCalendarIcon;
	}

	public WebElement getDiagnosis() {
		return diagnosis;
	}

	public WebElement getDiagnosisToggle() {
		return diagnosisToggle;
	}

	public WebElement getDiagnosisButton() {
		return diagnosisButton;
	}

	public WebElement getFamily() {
		return family;
	}

	public WebElement getFamilyDropdown() {
		return familyDropdown;
	}

	public WebElement getCauseDropdown() {
		return causeDropdown;
	}

	public WebElement getCause() {
		return cause;
	}

	public WebElement getNotesTextbox() {
		return notesTextbox;
	}

	public WebElement getMultipleDiagnosis() {
		return multipleDiagnosis;
	}

	public WebElement getSearchByCode() {
		return searchByCode;
	}

	public WebElement getSearchByDescription() {
		return searchByDescription;
	}

	public WebElement getEstimatedCost() {
		return estimatedCost;
	}

	public WebElement getInvoiceNumber() {
		return invoiceNumber;
	}

	public WebElement getNoOfItems() {
		return noOfItems;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getLaboratory() {
		return laboratory;
	}

	public WebElement getRadiology() {
		return Radiology;
	}

	public WebElement getItemCode() {
		return itemCode;
	}

	public WebElement getItemDescription() {
		return itemDescription;
	}

	public WebElement getServiceName() {
		return serviceName;
	}

	public WebElement getDailyDosage() {
		return dailyDosage;
	}

	public WebElement getPeriodTreatment() {
		return periodTreatment;
	}

	public WebElement getUnit() {
		return unit;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getUnitPrice() {
		return unitPrice;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getDocumentSubmission() {
		return documentSubmission;
	}

	public void clickOnClaimButton(WebDriver driver) throws InterruptedException {
		DriverUtils.waitForElement(driver);
		createClaimMenu.click();
		DriverUtils.waitForElement(driver);
	}

	public boolean checkCardsTabActive() {
		boolean value = false;
		String name = cardTab.getAttribute("className");
		if (name.contains("active")) {
			value = true;
		}
		return value;
	}

	public boolean checkCreateClaimButton() {
		boolean value = false;
		value = createClaimButton.isDisplayed();
		return value;
	}

	public boolean verifyphysicainTextBox() {
		boolean value = false;
		value = physicainTextBox.isDisplayed();
		return value;
	}

	public boolean verifyConsultationCalendarIcon() {
		boolean value = false;
		value = consultationCalendarIcon.isDisplayed();
		return value;
	}

	public boolean verifyDiagnosisButton() {
		boolean value = false;
		value = diagnosisButton.isDisplayed();
		return value;
	}

	public boolean verifyDiagnosisToggle() {
		boolean value = false;
		value = diagnosisToggle.isDisplayed();
		return value;
	}
	
	public boolean verifyMultipleDiagnosis() {
		boolean value = false;
		value = multipleDiagnosis.isDisplayed();
		return value;
	}
	
	public boolean verifyFamilyDropdown()
	{
		boolean value = false;
		value = familyDropdown.isDisplayed();
		return value;
	}
	
	public boolean verifyCauseDropdown()
	{
		boolean value = false;
		value = causeDropdown.isDisplayed();
		return value;
	}
	public boolean verifySearchByCode()
	{
		boolean value = false;
		value = searchByCode.isDisplayed();
		return value;
	}
	
	public boolean verifySearchByDescription()
	{
		boolean value = false;
		value = searchByDescription.isDisplayed();
		return value;
	}
	
	public boolean verifyEstimatedCostTextBox()
	{
		boolean value = false;
		value = estimatedCost.isDisplayed();
		return value;
	}
	
	public boolean verifyInvoiceTextBox()
	{
		boolean value = false;
		value = invoiceNumber.isDisplayed();
		return value;
	}	
}

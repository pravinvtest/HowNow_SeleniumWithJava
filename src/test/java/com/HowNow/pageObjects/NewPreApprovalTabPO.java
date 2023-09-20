package com.HowNow.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPreApprovalTabPO extends BasePO {

	@FindBy(xpath = "//input[@id='claimRefInput']//following::span[3]")
	private WebElement claimStatusDropdown;

	@FindBy(css = "span.mat-option-text")
	private List<WebElement> claimStatusDropdownValues;
	
	// Service Details
	@FindBy(xpath = "//div[normalize-space()='Service Details']//following::mat-form-field[@title='Requested Source']")
	private WebElement requestedSourceDropdown;
	
	@FindBy(xpath = "//mat-form-field[@title='Admission Date']")
	private WebElement admissionDate;
	
	@FindBy(xpath = "//mat-form-field[@title='Secondary Ref.#']")
	private WebElement secondaryRef;
	
	@FindBy(xpath = "//mat-form-field[@title='Patient File Number']")
	private WebElement patientFileNumber;	
	
	@FindBy(xpath = "//mat-form-field[@title='Declaration Date']")
	private WebElement declarationDate;
	
	@FindBy(xpath = "//mat-form-field[@title='Consultation Date']")
	private WebElement consultationDate;
	
	@FindBy(xpath = "//mat-form-field[@title='FOB']")
	private WebElement fOB;
	
	@FindBy(xpath = "//mat-form-field[@title='Service Class']")
	private WebElement serviceClass;
	
	@FindBy(id = "providerAC12")
	private WebElement provider;
	
	@FindBy(name = "currency")
	private WebElement currency;
	
	@FindBy(name = "physician")
	private WebElement professional_Speciality;
	
	@FindBy(name = "dischargeDate")
	private WebElement dischargeDate;
	
	@FindBy(xpath = "//input[@id='losPrescribed']")
	private WebElement lengthOfStay_DaysPrescribed;
	
	@FindBy(xpath = "//input[@id='losApproved']")
	private WebElement lengthOfStay_DaysApproved;
	
	@FindBy(xpath = "//input[@id='reffProviderAC12']")
	private WebElement referral_Source;
	
	@FindBy(xpath = "//input[@id='reffProviderAC12']//following::input[1]")
	private WebElement emergency;
	
	@FindBy(xpath = "//mat-label[normalize-space()='Emergency']")
	private WebElement emergencyLabel;
	
	@FindBy(name = "resubmittedFrom")
	private WebElement resubmittedForm;
	
	@FindBy(xpath = "//div[@class='heading ng-star-inserted']")
	private WebElement newClaimHeader;
	
	/*
	 * @FindBy(xpath = "//div[contains(text(),'Appointment Booking')]") private
	 * WebElement appointmentBooking;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='action-link-div ng-star-inserted']//div[@class='link-div']//img[@alt='No Icon']"
	 * ) private WebElement plusIcon;
	 */
	

	List<String> dropdownValuesText;
	public List<String> getValuesInClaimStatusDropdown(WebDriver driver) {
		dropdownValuesText = new ArrayList<String>();
		waitFor(driver, claimStatusDropdown);
		highLighterMethod(claimStatusDropdown);
		claimStatusDropdown.click();
		for (int i = 0; i < claimStatusDropdownValues.size(); i++) {
			dropdownValuesText.add(claimStatusDropdownValues.get(i).getText());
		}
		return dropdownValuesText;
	}
	
	// Service Details
	public WebElement getRequestedSourceDropdownValue()
	{
		highLighterMethod(requestedSourceDropdown);
		return requestedSourceDropdown;
	}
	
	public WebElement getAdmissionDate()
	{
		highLighterMethod(admissionDate);
		return admissionDate;
	}
	
	public WebElement getSecondaryRef()
	{
		highLighterMethod(secondaryRef);
		return secondaryRef;
	}
	
	public WebElement getPatientFileNumber()
	{
		highLighterMethod(patientFileNumber);
		return patientFileNumber;
	}
	
	public WebElement getDeclarationDate()
	{
		highLighterMethod(declarationDate);
		return declarationDate;
	}
	
	public WebElement getConsultationDate()
	{
		highLighterMethod(consultationDate);
		return consultationDate;
	}
	
	public WebElement getfOB()
	{
		highLighterMethod(fOB);
		return fOB;
	}
	
	public WebElement getServiceClass()
	{
		highLighterMethod(serviceClass);
		return serviceClass;
	}
	
	public WebElement getProvider()
	{
		highLighterMethod(provider);
		return provider;
	}
	
	public WebElement getCurrency()
	{
		highLighterMethod(currency);
		return currency;
	}
	
	public WebElement getProfessional_Speciality()
	{
		highLighterMethod(professional_Speciality);
		return professional_Speciality;
	}
	
	public WebElement getDischargeDate()
	{
		highLighterMethod(dischargeDate);
		return dischargeDate;
	}
	
	public WebElement getLengthOfStay_DaysPrescribed()
	{
		highLighterMethod(lengthOfStay_DaysPrescribed);
		return lengthOfStay_DaysPrescribed;
	}
	
	public WebElement getLengthOfStay_DaysApproved()
	{
		highLighterMethod(lengthOfStay_DaysApproved);
		return lengthOfStay_DaysApproved;
	}
	
	public WebElement getReferral_Source()
	{
		highLighterMethod(referral_Source);
		return referral_Source;
	}
	
	public WebElement getEmergency()
	{
		highLighterMethod(emergency);
		highLighterMethod(emergencyLabel);
		return emergency;
	}
	
	public WebElement getResubmittedForm()
	{
		highLighterMethod(resubmittedForm);
		return resubmittedForm;
	}
	
	public WebElement getNewClaimHeader()
	{
		highLighterMethod(newClaimHeader);
		return newClaimHeader;
	}
	
	/*
	 * public WebElement getAppointmentBooking() {
	 * highLighterMethod(appointmentBooking); return appointmentBooking; }
	 * 
	 * public WebElement getPlusIcon() { highLighterMethod(plusIcon); return
	 * plusIcon; }
	 */
	
}

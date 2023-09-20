package com.HowNow.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointmentPO extends BasePO{
	
	@FindBy(xpath = "//a[@href='Appointments2.aspx']")
	private WebElement appointmentsTabLocator;
	
	@FindBy(css = "div[class='col-sm-4'] h2")
	private WebElement appointmentsDashBoardTitleLocator;
	
	@FindBy(xpath = "//ol[@class='breadcrumb']")
	private WebElement homeAppointmentsNavigationLocator;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//tr[1]/th[2]")
	private WebElement patientName;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//tr[1]/th[3]")
	private WebElement claimeReference;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//tr[1]/th[4]")
	private WebElement appointmentDate;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//tr[1]/th[5]")
	private WebElement status;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//input[1]")
	private WebElement firstRadioButton;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//input[2]")
	private WebElement secondRadioButton;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//input[3]")
	private WebElement thirdRadioButton;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-action']")
	private WebElement confirmButton;
	
	@FindBy(xpath="(//table[@class='table-condensed'])[1]")
	private WebElement calendarTable;
	
	@FindBy(xpath="(//button[@class='btn btn-grey pull-left btn-cancel'])[1]")
	private WebElement cancelCalendarButton;
	
	@FindBy(xpath="(//label[@class='lbl-suggestion'])[1]")
	private WebElement appointmentDetails;
	
	@FindBy(xpath="//span[@class='modal-title']")
	private WebElement appointmentDetailsLocator;
	
	@FindBy(xpath="(//div[@class='timepicker-picker'])[1]")
	private WebElement timeTable;
	
	@FindBy(xpath="//button[@id='btn-confirm']")
	private WebElement confirmAppointmentButton;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn btn-primary']")
	private WebElement okButton;
	
	@FindBy(xpath="//table[@id='appointmentsTbl']//tr[1]//td[5]")
	private WebElement statusValue;
	
	public void clickOnAppointmentsTab() throws InterruptedException {
		highLighterMethod(appointmentsTabLocator);
		appointmentsTabLocator.click();
		Thread.sleep(3000);
	}
	
	public WebElement getAppointmentsDashBoardTitle() {
		highLighterMethod(appointmentsDashBoardTitleLocator);
		return appointmentsDashBoardTitleLocator;
	}
	
	public WebElement getHomeAppointmentNavigaton() {
		highLighterMethod(homeAppointmentsNavigationLocator);
		return homeAppointmentsNavigationLocator;
	}
	
	public WebElement getPatientName() {
		highLighterMethod(patientName);
		return patientName;
	}
	
	public WebElement getStatus() {
		highLighterMethod(status);
		return status;
	}
	
	public WebElement getClaimeReference() {
		highLighterMethod(claimeReference);
		return claimeReference;
	}
	
	public WebElement getAppointmentDate() {
		highLighterMethod(appointmentDate);
		return appointmentDate;
	}

	public void clickFirstRadioButton() throws InterruptedException {
		firstRadioButton.click();
		Thread.sleep(2000);
	}
	
	public void clickSecondRadioButton() throws InterruptedException {
		secondRadioButton.click();
		Thread.sleep(2000);
	}
	
	public void clickThirdRadioButton() throws InterruptedException {
		thirdRadioButton.click();
		Thread.sleep(2000);
	}
	
	public void clickConfirmButton() throws InterruptedException {
		highLighterMethod(confirmButton);
		confirmButton.click();
		Thread.sleep(2000);
	}
	
	public void clickCancelCalenderButton() throws InterruptedException {
		highLighterMethod(cancelCalendarButton);
		cancelCalendarButton.click();
		Thread.sleep(2000);
	}
	
	public boolean verifyCalendarTableVisibility() throws InterruptedException {
		Boolean b= calendarTable.isDisplayed();
		highLighterMethod(calendarTable);
		Thread.sleep(2000);
		return b;
	}
	
	public WebElement getAppointmentDatails() {
		highLighterMethod(appointmentDetails);
		return appointmentDetails;
	}
	
	public WebElement getAppointmentDatailsCalendarTitle() {
		highLighterMethod(appointmentDetailsLocator);
		return appointmentDetailsLocator;
	}
	
	public boolean verifyCalendarTimeVisibility() throws InterruptedException {
		Boolean b= timeTable.isDisplayed();
		highLighterMethod(timeTable);
		Thread.sleep(2000);
		return b;
	}
	
	public boolean cancelButtonVisibility() throws InterruptedException {
		highLighterMethod(cancelCalendarButton);
		boolean b= cancelCalendarButton.isDisplayed();
		Thread.sleep(2000);
		return b;
	}
	
	public boolean confirmAppointmentButtonVisibility() throws InterruptedException {
		highLighterMethod(confirmAppointmentButton);
		boolean b= confirmAppointmentButton.isDisplayed();
		Thread.sleep(2000);
		return b;
	}
	
	public void clickOnConfirmAppointmentButton() throws InterruptedException {
		highLighterMethod(confirmAppointmentButton);
		confirmAppointmentButton.click();
		Thread.sleep(2000);
		okButton.click();
		Thread.sleep(2000);
	}
	
	public void getValuefromSearch(String claimReference) throws InterruptedException {
		highLighterMethod(search);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(claimReference);
		Thread.sleep(2500);
	}
	
	public WebElement getStatusValue() {
		return statusValue;
	}
}

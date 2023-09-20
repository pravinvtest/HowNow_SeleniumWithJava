package com.HowNow.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CourseCompletionPO extends BasePO 
{
	//click on profile icon 
	@FindBy(xpath = "//div[@class='profile-img m-l-16']")
	private WebElement profileIcon;
	// coursenamexpath 
	 @FindBy(xpath = "((//button[contains(text(),'Start Again')]//ancestor::div)[5]//div//following::h1)[1]")
	private WebElement coursename;
	 // start course 
	 @FindBy(xpath = "(//*[contains(text(),'Start')])[1]")
		private WebElement startCourseButton;
	 //exit button
	 @FindBy(xpath = "//i[@class='far fa-sign-out text-white m-l-auto']")
		private WebElement exitButton;
	 
	 //smiley icon
	 @FindBy(xpath = "//i[@class='sentiment-icon fal fa-smile useful default-icon']")
		private WebElement smileyIcon;
	 //submit review
	 @FindBy(xpath = "//textarea[@id='content_review_remarks']")
		private WebElement enterreview;
	 //submit button
	 @FindBy(xpath = "//button[normalize-space()='Submit']")
		private WebElement submitButton;
	 //review Pop-up
	 @FindBy(xpath = "//span[contains(text(),'Close')]")
		private WebElement closeLink;
	 // logoutofcoursecompletion
	 @FindBy(xpath = "(//*[contains(text(),'Logout')])[1]")
		private WebElement LogoutOfCourseCompletion;
	 // 
	 @FindBy(xpath="//div[@id='s2id_autogen3']//a[@class='select2-choice']")
	 private WebElement pageNumberfooter;
	 
	 public void validateCoursename(String course) throws InterruptedException
	 {
		 Thread.sleep(2000);
		 String coursena=coursename.getText();
		 Assert.assertEquals(course, coursena);
		
	 }
	 public void clickonStartCourse() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 startCourseButton.click();
	 }
	 public void clickonExit() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 exitButton.click();
	 }
	 public void provideReviewandSubmitIt(String reviewText) throws InterruptedException
	 {
		 Thread.sleep(2000);
		 smileyIcon.click();
		 Thread.sleep(2000);
		 enterreview.sendKeys(reviewText);
		 submitButton.click();
		 Thread.sleep(4000);
		 scroll();
		// scrollMethod(closeLink);
		// scrolltoElement(closeLink);
		 closeLink.click(); }
	 public void logoutofcoursCompletion() throws InterruptedException
	 {
		 Thread.sleep(1000);
			profileIcon.click();
		 LogoutOfCourseCompletion.click();
		 
	 }
			 
	

}

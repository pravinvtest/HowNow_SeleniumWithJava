package com.HowNow.pageObjects;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.HowNow.tests.BaseDriverUtil;

public class Creation_Course_nugget_Event extends BasePO
{
	WebDriver driver;
 // clicked on navigation bar of left side
	 @FindBy(xpath="//span[@class='nav-icon']")
	  private  WebElement navigationBar;
	 
	 // clicked on studio
	 @FindBy(xpath="//span[text()='Studio']")
	  private  WebElement clickedonStudiOption;
	// select course
		 @FindBy(xpath="(//div[@class='studio-content-creation-options']//a)[2]")
		  private  WebElement selectCourse;
	// coursename	 
		  @FindBy(xpath="//input[@id='course_name']")
		  private  WebElement enterCoursename;
		// coursename	 
		  @FindBy(xpath="//p[contains(text(),'Save and Continue')]")
		  private  WebElement courseditorSaveButton;
		 //channel 
		 @FindBy(xpath="//input[@id='s2id_autogen2']")
		  private  WebElement clickonchannel;
		 // select channnel
		 @FindBy(xpath="(//ul[@class='select2-results']//li)[4]")
		  private  WebElement selectchannelAsQa;
		 //save continour
		 @FindBy(xpath="//p[contains(text(),'Saved')]")
		  private  WebElement clickonSaveAndContinoue;
		 // click on add lession
		 @FindBy(xpath="//a[@data-title='Add Lesson']")
		  private  WebElement clickonaddlession;
		// click textiocn
				 @FindBy(xpath="//a[@aria-label='Text']")
				  private  WebElement clickontextIcon;
		// enter text
				@FindBy(xpath="//*[contains(@data-placeholder,'Enter')]//p")
				  private  WebElement enterText;
				
				// assign learners 
				@FindBy(xpath="//input[@id='s2id_autogen1']")
				  private  WebElement clickonsearchbox;
				// selectfirst user
				@FindBy(xpath="//div[@role='option']")
				  private  WebElement selectFirstUser;
				// apply button
				@FindBy(xpath="//span[text()='Apply']")
				  private  WebElement clickonApply;
				// review switch button
				@FindBy(xpath="(//label[@class='switch display-block'])[4]")
				  private  WebElement reviewsswitch;
				// review switch button
				@FindBy(xpath="//*[contains(text(),'Save & Publish')]")
				  private  WebElement clickonPublish;
				// sucessfuly message 
				@FindBy(xpath="//h3[contains(text(),'Your Course has been published!')]")
				  private  WebElement sucessmessage;
				// sucessfuly message 
				@FindBy(xpath="//*[contains(text(),'Back to Studio')]")
				  private  WebElement backtoStudio;
				// Learnerstab
				@FindBy(xpath="//p[text()='Assign Learners']")
				  private  WebElement Learnerstab;
				// CourseEditortab
				@FindBy(xpath="//p[text()='Course Editor']")
				  private  WebElement CourseEditortab;
				// Course Information' 
				@FindBy(xpath="//p[text()='Course Information']")
				  private  WebElement CourseInformationTab;
				// ReleaseDeadlinetab
				@FindBy(xpath="//p[text()='Release & Deadline']")
				  private  WebElement ReleaseDeadlinetab;
		 
		 
		 
		 
		 public void clickonNavigationBar() throws InterruptedException
		 {
			 Thread.sleep(2000);
			 System.out.println("clickied on navagation bar ");
			 navigationBar.click();
			 System.out.println("clicked on bar");
		 }
		 public void clickonStudio()
		 { System.out.println("clicking on studio");
			 clickedonStudiOption.click();
		 }
		 public void clickonCourse(String url) throws InterruptedException
		 { 
			 String curretnurl=BaseDriverUtil.driver.getCurrentUrl();
			Assert.assertEquals(url, curretnurl);
			 System.out.println("user is on clickonCourse");
		 
			 Thread.sleep(100);
			 //switchWindow(); 
			 selectCourse.click();
			 switchWindow(); 
		 }
		 public void CourseInformation(String course) throws InterruptedException, AWTException
		 {
			 System.out.println("is selected "+ CourseInformationTab.isEnabled());
			 Assert.assertTrue(CourseInformationTab.isEnabled());
			 Thread.sleep(100);
			 enterCoursename.clear();
			 Thread.sleep(100);
			 enterCoursename.sendKeys(course);
			 System.out.println("course entered ");
			// scrolltoElement(clickonchannel);
			 System.out.println("scroll to channel ");
			 clickonchannel.click();
			 clickonchannel.sendKeys("QA");
			 Thread.sleep(1000);
			 try {
				  Robot robot = new Robot();
				
				  robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
				 } 
			 catch (AWTException e) {
				 e.printStackTrace();
				 }

			 System.out.println("selecting qa channel");
			// clickonchannel.sendKeys("QA");
			 clickonSaveAndContinoue.click();
			
		 }
		
		 public void CourseEditor(String text) throws InterruptedException, AWTException
		 {
			 System.out.println("course editor area");
			 System.out.println("is selected "+ CourseEditortab.isEnabled());
		//	 Assert.assertTrue(CourseEditortab.isEnabled());
		 clickonaddlession.click();
//			int sizeofframe= BaseDriverUtil.driver.findElements(By.tagName("iframe")).size();
//				System.out.println("sizeof frame "+sizeofframe);
			 clickontextIcon.click();
			 Thread.sleep(2000);
			
			 System.out.println("is dispalted"+enterText.isDisplayed());
			 System.out.println("is enabled "+enterText.isEnabled());
			 enterText.sendKeys(text);
			// clickontextIcon.click();
			 Thread.sleep(2000);
			// JavascriptExecutor j = (JavascriptExecutor) driver;
		//	 j.executeScript("arguments[0].click();", );
			 
			 System.out.println("text entered in lession area");
			 courseditorSaveButton.click();
			 Thread.sleep(2000);
			 courseditorSaveButton.click();
			 clickonSaveAndContinoue.click();
			// clickonSaveAndContinoue.click();
		 }
				
		 public void assignLearners(String name) throws InterruptedException
		 {
			 System.out.println("assignLearners area");
			 System.out.println("is selected "+ Learnerstab.isEnabled());
			 Assert.assertTrue(Learnerstab.isEnabled());
			 clickonsearchbox.click();
			 clickonsearchbox.sendKeys(name);
			 //selectFirstUser.click();
			 Thread.sleep(2000);
			 try {
				  Robot robot = new Robot();
				
				  robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
				 } 
			 catch (AWTException e) {
				 e.printStackTrace();
				 }
			 
			 clickonApply.click();
System.out.println("assignee selected");
			 clickonSaveAndContinoue.click();
			 
			 // do some keyborad command with enter
		 }
		 public void relaseandDeadline() throws InterruptedException
		 {
			 System.out.println("relaseandDeadline area");
			 System.out.println("is selected "+ ReleaseDeadlinetab.isEnabled());
			 Assert.assertTrue(ReleaseDeadlinetab.isEnabled());
			 reviewsswitch.click();
			 clickonPublish.click();
			 Assert.assertTrue(true, sucessmessage.getText());
			 System.out.println("text message is "+sucessmessage.getText());
			 backtoStudio.click();
			 Thread.sleep(100);
		 }
	 
}

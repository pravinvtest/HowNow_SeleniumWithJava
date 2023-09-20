package com.HowNow.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.HowNow.tests.BaseDriverUtil;
import com.HowNow.tests.TC_CreateCourseHownow;

import junit.framework.Assert;

public class DashboardHownow extends BasePO {
	// click on profile icon
	@FindBy(xpath = "//div[@class='profile-img m-l-16']")
	private WebElement profileIcon;

	// click on profile option
	@FindBy(xpath = "//a[text()='My Profile']")
	private WebElement profileOption;
	// click on logout
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement selectlogout;

	// click on profile option
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboard;

	// click on settings option
	@FindBy(xpath = "//a[text()='Settings']")
	private WebElement settingOptions;

	// email id under settings tab
	@FindBy(xpath = "//input[@id='user_email' or @placeholder='Email Address']")
	private WebElement emailID;
	// clicked on navigation bar of left side
	@FindBy(xpath = "//ul[@id='js-sidebar-logo-header']")
	private WebElement navigationBar;

	// clicked on studio
	@FindBy(xpath = "//span[text()='Studio']")
	private WebElement clickedonStudiOption;
	// Notification bar
	@FindBy(xpath = "//span[@id='user-notifications']")
	private WebElement notificationBell;

	// select first notification
	@FindBy(xpath = "(//div[@id='notifications_page']//div[@class='notification-message']//p)[1]")
	private WebElement selectnotification;
	// dashboard
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashbaord;
	// dashboard
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	private WebElement homebutton;
	// viewallButtonofNotification
	@FindBy(xpath = "//a[contains(text(),'View All')]")
	private WebElement viewAll;
	// userlink
	@FindBy(xpath = "//a[@href='/dashboard/users']")
	private WebElement userlink;
	// filterOption beside add user
	@FindBy(xpath = "//button[@id='filter-btn']")
	private WebElement filter;
	// clickonGroup
	@FindBy(xpath = "//div[@id='groups-filter']//div[@id='dropdownMenuButton']")
	private WebElement groupDropdown;
	// select group
	@FindBy(xpath = "//span[@class='result-text'][normalize-space()='Demo POC vTEST']")
	private WebElement selectGroup;
	// clickon apply
	@FindBy(xpath = "//div[@id='groups-filter']//button[@type='button'][normalize-space()='Apply']")
	private WebElement clickonApplyofGroupdropdown;
	// (//table[@role='grid']//tr[6]//td)[6]//div[@class='progress_label'] --status
	// of user
	// page count
	@FindBy(xpath = "//div[@class='select2-container']")
	private WebElement pageNumberfooter;
	// change count of table
	@FindBy(xpath = "//div[@id='s2id_autogen6']//b[@role='presentation']")
	private WebElement clickonPageCount;
	// change count of table
	@FindBy(xpath = "//div[@id='user_learning_history_length']//select//option[contains(text(),'100')]")
	private WebElement clickon100;

	public void clickonProfileIcon() throws InterruptedException {
		Thread.sleep(1000);
		profileIcon.click();
	}

	public void selectProfileOption() {
		profileOption.click();
	}

	public void verifyUserEmailID(String expectedEmailId) {
		settingOptions.click();
		System.out.println("emild is visibile" + emailID.isEnabled());
		System.out.println("emild is displayed" + emailID.isDisplayed());
		String ActualEmailId = emailID.getAttribute("value");
		// System.out.println("attribute is "+ emailID.getAttribute("value"));
		System.out.println("Actual email id is " + ActualEmailId);
		Assert.assertEquals(expectedEmailId, ActualEmailId);
		// Assert.assertEquals(ActualEmailId, expectedEmailId, "Email id not matched ");
	}

	public void returtodashboardFromProfilesection() throws InterruptedException {
		profileIcon.click();
		dashboard.click();
		Thread.sleep(1000);
	}

	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		profileIcon.click();
		selectlogout.click();

	}

	public void clickonNotificationbarandSelectit(String course) throws InterruptedException {
		System.out.println("notification method course is " + course);
		notificationBell.click();
		Thread.sleep(2000);
		viewAll.click();
		Thread.sleep(2000);
		List<WebElement> list = BaseDriverUtil.driver
				.findElements(By.xpath("//div[@id='notifications_page']//div[@class='notification-message']//p"));
		System.out.println("notification size is " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains(course)) {
				list.get(i).click();
				break;
			}
		}
		// selectnotification.click();
	}

	public void clickonDashboard() {
		dashbaord.click();
	}

	public void clickoHome() {
		homebutton.click();
	}

	public void clickonUserbar() throws InterruptedException {
		System.out.println("clickonUserbar");
		Thread.sleep(2000);
		userlink.click();
	}

	public void filterSpecificUserAndClickonUser() throws InterruptedException {
		System.out.println("filterSpecificUserAndClickonUser");
		Thread.sleep(2000);
		filter.click();
		groupDropdown.click();
		Thread.sleep(2000);
		selectGroup.click();
		clickonApplyofGroupdropdown.click();
		Thread.sleep(2000);
		scroll();
		List<WebElement> userList = BaseDriverUtil.driver.findElements(By.xpath("//table[@role='grid']//tr//span//p"));
		List<WebElement> checkboxlist = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//tr//span//p"));
		System.out.println("userList size is " + userList.size());
		BaseDriverUtil.driver.findElement(By.xpath(
				"//body[1]/section[1]/div[1]/div[3]/div[2]/section[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/a[1]/div[1]/div[1]"))
				.click();
//			for(int i=0;i<userList.size();i++)
//			{
//				System.out.println("username is "+ userList.get(i).getText());
//				if(userList.get(i).getText().equals("Hemant Vtest"))
//			{
//					System.out.println("inside if loop");
//				userList.get(i).click();
//				break;
//			}
//			}
		switchWindow();
	}

	public void selectuser(String username) throws InterruptedException {
		String url = BaseDriverUtil.driver.getCurrentUrl();
		System.out.println("url is " + url);
		Assert.assertTrue(url.contains("users"));
		System.out.println("filterSpecificUserAndClickonUser");
		Thread.sleep(2000);
		filter.click();
		groupDropdown.click();
		Thread.sleep(2000);
		selectGroup.click();
		clickonApplyofGroupdropdown.click();
		Thread.sleep(2000);
		scroll();
		Thread.sleep(2000);
		WebElement ele = BaseDriverUtil.driver.findElement(By.xpath("//*[contains(text(),'"+username+"')]"));
		JavascriptExecutor js = (JavascriptExecutor) BaseDriverUtil.driver;
		js.executeScript("arguments[0].click();", ele);
		switchWindow();

	}

	public void checkStatusofCourse1(String coursename) throws InterruptedException {
		System.out.println("checking status of course " + coursename);
		Thread.sleep(2000);
//			scrolltoElement(pageNumberfooter);
//			Thread.sleep(2000);
//			System.out.println("page count is "+clickonPageCount.getText());
//			String  count =clickonPageCount.getText();
//			if(count.equals("100"))
//			{
//				System.out.println("count is updated");
//			}
//			else 
//				
//			{
//				clickonPageCount.click();
//			clickon100.click();
//			Thread.sleep(2000);
//				
//			}
//			

		// scroll();
		// List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		List<WebElement> listOfCourse = BaseDriverUtil.driver
				.findElements(By.xpath("(//table[@role='grid']//tr[@role='row'])"));
		List<WebElement> listOfCoursetext = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> listOfStatus = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> sizeOfRows = BaseDriverUtil.driver.findElements(By.xpath("//table[@role='grid']//tr//td[1]"));
		String beforexpath = "//table[@role='grid']//tr[";
		String afterxpath = "]//td[1]";
		String beforexpath1 = "//table[@role='grid']//tr[";
		String Afterxpath1 = "]//td[6]";
		System.out.println("coruse name coming from json is " + coursename);
		for (int i = 1; i <= sizeOfRows.size(); i++) {
			String actualXpath = beforexpath + i + afterxpath;
			String actualXpath1 = beforexpath1 + i + Afterxpath1;
			WebElement ele = BaseDriverUtil.driver.findElement(By.xpath(actualXpath));
			// System.out.println(ele.getText());
			WebElement ele1 = BaseDriverUtil.driver.findElement(By.xpath(actualXpath1));
			// System.out.println(ele1.getText());
			if (ele.getText().equals(coursename)) {
				System.out.println("first if loop");
				if (ele1.getText().contains("Completed")) {
					System.out.println("second if loop");
					System.out.println("Course is completed");
				}
			}

		}

	}

	public void statusofcourse(String coursename1) throws InterruptedException {
		System.out.println("checking status of course " + coursename1);
		Thread.sleep(2000);
		scroll();
		Thread.sleep(2000);
		List<WebElement> listOfCourse = BaseDriverUtil.driver
				.findElements(By.xpath("(//table[@role='grid']//tr[@role='row'])"));
		List<WebElement> listOfCoursetext = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> listOfStatus = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> sizeOfRows = BaseDriverUtil.driver.findElements(By.xpath("//table[@role='grid']//tr//td[1]"));
		String beforexpath = "//table[@role='grid']//tr[";
		String afterxpath = "]//td[1]";
		String beforexpath1 = "//table[@role='grid']//tr[";
		String Afterxpath1 = "]//td[6]";
		for (int i = 1; i < sizeOfRows.size(); i++) {
			String actualXpath = beforexpath + i + afterxpath;
			String actualXpath1 = beforexpath1 + i + Afterxpath1;
			System.out.println("actual xpath is: " + actualXpath);
			WebElement ele = BaseDriverUtil.driver.findElement(By.xpath(actualXpath));
			System.out.println(ele.getText());
			WebElement ele1 = BaseDriverUtil.driver.findElement(By.xpath(actualXpath1));
			// scrolltoElement(pageNumberfooter);
			Thread.sleep(2000);
			if (!(ele.getText().contains("coursename1"))) {
				// System.out.println("actual xpath is in while loop : "+actualXpath);
				scrolltoElement(pageNumberfooter);
				Thread.sleep(2000);
				if (BaseDriverUtil.driver.findElement(By.xpath("//a[@id='user_learning_history_next']")).isEnabled()) {
					BaseDriverUtil.driver.findElement(By.xpath("//a[@id='user_learning_history_next']")).click();
					Thread.sleep(2000);
					System.out.println("click on next button");
				} else {
					break;
				}
			} else {
				if (ele.getText().contains("coursename1")) {
					System.out.println("first if loop");
					if (ele1.getText().contains("Completed")) {
						System.out.println("second if loop");
						System.out.println("Course is completed");
					}
				}
				break;
			}

		}
	}

	public void checkStatusofCourse(String course) throws InterruptedException

	{
		System.out.println("checking status of course " + course);
		Thread.sleep(2000);
		scroll();
		List<WebElement> listOfCourse = BaseDriverUtil.driver
				.findElements(By.xpath("(//table[@role='grid']//tr[@role='row'])"));
		List<WebElement> listOfCoursetext = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> listOfStatus = BaseDriverUtil.driver
				.findElements(By.xpath("//table[@role='grid']//td[1]//div//p"));
		List<WebElement> sizeOfRows = BaseDriverUtil.driver.findElements(By.xpath("//table[@role='grid']//tr//td[1]"));
		String beforexpath = "//table[@role='grid']//tr[";
		String afterxpath = "]//td[1]";
		String beforexpath1 = "//table[@role='grid']//tr[";
		String Afterxpath1 = "]//td[6]//div[@class='progress_label']";
		for (int i = 1; i < sizeOfRows.size(); i++) {
			String actualXpath = beforexpath + i + afterxpath;
			String actualXpath1 = beforexpath1 + i + Afterxpath1;
			//System.out.println("actual xpath is: " + actualXpath);
			//System.out.println("actual xpath of status is  : " + actualXpath1);
			WebElement ele = BaseDriverUtil.driver.findElement(By.xpath(actualXpath));
			//System.out.println(ele.getText());
			WebElement ele1 = BaseDriverUtil.driver.findElement(By.xpath(actualXpath1));
			// scrolltoElement(pageNumberfooter);
			Thread.sleep(2000);
			if (ele.getText().equals(course)) {
				// System.out.println("actual xpath of status inside if loop is :
				// "+actualXpath1);
				// String
				// status=BaseDriverUtil.driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]//td[6]//div[@class='progress_label']")).getText();

				// System.out.println(BaseDriverUtil.driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]//td[6]//div[@class='progress_label']")));
				// System.out.println("first if loop");
				if (ele1.getText().equals("Completed")) {
					System.out.println("status of course " + ele.getText() + " " + ele1.getText());
					String status = ele1.getText();
					Assert.assertEquals("Completed", status);
					// System.out.println("second if loop");
					System.out.println("Course is completed");
				}
				break;
			}
		}

	}
}
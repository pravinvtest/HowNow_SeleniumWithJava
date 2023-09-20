package com.HowNow.tests;

import java.awt.AWTException;import java.util.Random;import java.lang.Math; 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.HowNow.reusemethods.ScreenShot;
import com.HowNow.reusemethods.SeleniumWebDriver;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.HowNow.pageObjects.Creation_Course_nugget_Event;
import com.HowNow.pageObjects.DashboardHownow;
import com.HowNow.pageObjects.LoginPoHownow;

public class TC_CreateCourseHownow extends  BaseDriverUtil
{
	public static  String nameOfCourse;
	  private   LoginPoHownow loginhownow;
	     private DashboardHownow dashboardHownow;
	     private Creation_Course_nugget_Event createcourse;
	     public String generatedString ;
	   
	     JSONObject LoginData;
	     public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
	    	    int leftLimit = 97; // letter 'a'
	    	    int rightLimit = 122; // letter 'z'
	    	    int targetStringLength = 10;
	    	    Random random = new Random();

	    	     generatedString = random.ints(leftLimit, rightLimit + 1)
	    	      .limit(targetStringLength)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();

	    	    System.out.println(generatedString);
	    	}
	    

	     @BeforeClass
	 	@Parameters({ "nodeIp", "nodePort", "driverType", "environment" })
	 	public void beforeClass(@Optional("5555") String nodeIp, @Optional("localhost") String nodePort,
	 			@Optional("chrome") String driverType,
	 			@Optional("https://hownowindia.com/users/sign_in") String environment) throws Exception {

	 		url = environment;

	 		driver = SeleniumWebDriver.getRemoteWebDriver(driverType, nodeIp, nodePort);

	 		// Created Object for screen shot
	 		screenShot = new ScreenShot();
	 		InputStream details = null;
	 		String dataFileName = null;

	 		if (url.equals("https://hownowindia.com/users/sign_in")) {
	 			dataFileName = "/src/test/java/data_test/LoginData.json";	
	 			} else if (url.equals("https://pulse-dev.tatsh.cloud/Login2.aspx")) {
	 				dataFileName = "/src/test/java/data_dev/Login.json";
	 				} else {
	 					dataFileName = "/src/test/java/data_test_italy/Login.json";
	 		}

	 		String path = System.getProperty("user.dir");
	 		String jsonFolderPath = path + dataFileName;
	 		File initialFile = new File(jsonFolderPath);
	 		details = new FileInputStream(initialFile);

	 		JSONTokener tokener = new JSONTokener(details);
	 		LoginData = new JSONObject(tokener);
	 		// Created the PageObject to read the Address of HTML Elements
	 		loginhownow = PageFactory.initElements(driver, LoginPoHownow.class);
	 		dashboardHownow=PageFactory.initElements(driver, DashboardHownow.class);
	 		createcourse=PageFactory.initElements(driver, Creation_Course_nugget_Event.class);
	 	}
	     @BeforeMethod()
	 	public void beforeMethod(ITestResult testResult) {
	 		extentTest = extentReports.createTest(testResult.getMethod().getMethodName()).assignAuthor("HowNow");
	 	}

	 	/**
	 	 * If previous method fails we are capturing the screen shot here
	 	 * 
	 	 * @param testResult
	 	 * @throws InterruptedException
	 	 */

	 	@AfterMethod()
	 	public void afterMethod(ITestResult testResult) throws InterruptedException {
	 		// If the test method is failed then it will take a screen shot
	 		if (!testResult.isSuccess()) {
	 			extentTest
	 					.fail(testResult.getMethod().getMethodName(),
	 							MediaEntityBuilder
	 									.createScreenCaptureFromPath(
	 											screenShot.takeScreenShot(driver, testResult.getMethod().getMethodName()))
	 									.build());
	 			extentTest.log(Status.FAIL, MarkupHelper.createLabel(testResult.getName() + " Test Case FAILED", ExtentColor.RED));
	 			extentTest.fail(testResult.getThrowable());
	 			//loginPO.logout();
	 		}
	 	}
	 	@Test(priority = 1, enabled = true, description = "Creation of course ")
		public void ValidatecourseCreated() throws IOException, InterruptedException, AWTException {

			String domain1 = LoginData.getJSONObject("TC_Login_001").getString("domain");
			String username = LoginData.getJSONObject("TC_Login_001").getString("usernameCreator");
			String passwor = LoginData.getJSONObject("TC_Login_001").getString("password");
			String email = LoginData.getJSONObject("TC_Login_001").getString("email");
			String course = LoginData.getJSONObject("TC_Login_001").getString("coursename");
			String LessionText = LoginData.getJSONObject("TC_Login_001").getString("textforLession");
			String Assignee = LoginData.getJSONObject("TC_Login_001").getString("Assginername");
			String StudioUrl = LoginData.getJSONObject("TC_Login_001").getString("studiourl");
			//nameOfCourse=generatedString+course;
			nameOfCourse=course+Math.random();
			LoginData.getJSONObject("TC_Login_001").put("coursename", nameOfCourse);
			System.out.println("updated value of course is "+LoginData.getJSONObject("TC_Login_001").getString("coursename"));
			System.out.println("new course is "+nameOfCourse);
			System.out.println("passowrd is "+ passwor);
					
			extentTest.info("Load the URL in Browser -"+ url);
			driver.get(url);
			extentTest.info("User is on domain page");
			loginhownow.clickonGetStratedButton(domain1);
			extentTest.info("Domain is entered and click on get started button ");
			extentTest.info("User is on login page of application ");
			loginhownow.loginWithCredentials(username, passwor);
			extentTest.info("User logged In ");
			dashboardHownow.clickonProfileIcon();
			extentTest.info("User clicked on profile icon ");
			dashboardHownow.selectProfileOption();
			extentTest.info("Profile option selected");
			dashboardHownow.verifyUserEmailID(email);
			extentTest.info("Email is verified ");
			dashboardHownow.returtodashboardFromProfilesection();
			extentTest.info("User  is on dashboard");
			createcourse.clickonNavigationBar();
			createcourse.clickonStudio();
			extentTest.info("User clicked on Studio ");
			createcourse.clickonCourse(StudioUrl);
			extentTest.info("User clicked on course ");
			createcourse.CourseInformation(nameOfCourse);
			extentTest.info("CourseInformation is filled ");
		createcourse.CourseEditor(LessionText);
		extentTest.info("Lession is created in course editor ");
			createcourse.assignLearners(Assignee);
			extentTest.info("Lession is Assign to user");
			createcourse.relaseandDeadline();
			extentTest.info("review section added to lession");
			dashboardHownow.logout();
			extentTest.info("User logout sucessfully ");
		}
	 	@AfterClass
		public void afterClass() {
			driver.quit();
		}

	}




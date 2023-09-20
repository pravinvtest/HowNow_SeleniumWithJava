package com.HowNow.pageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HowNow.tests.BaseDriverUtil;

import java.util.Iterator;

public class BasePO {
	
	public static void highLighterMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) BaseDriverUtil.driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	
	public static void scrollMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) BaseDriverUtil.driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
		
	public static void waitFor(WebDriver driver, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	
	public static void waitForVisibility(WebDriver driver, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	public static void waitForVisibility(WebElement element) {
		new WebDriverWait(BaseDriverUtil.driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.visibilityOf(element));
	}
	public static void scrolltoElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) BaseDriverUtil.driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
		//js.executeScript("window.scrollBy(0,250)", "");
	}
	public static void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) BaseDriverUtil.driver;
	//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,350)", "");
	}
	
	
	public static void switchWindow()
	{
		System.out.println("switching to window");
		String parent=BaseDriverUtil.driver.getWindowHandle();
		System.out.println("current window is "+parent);
System.out.println("size of window is "+BaseDriverUtil.driver.getWindowHandles().size());
		Set<String>s=BaseDriverUtil.driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
			BaseDriverUtil.driver.switchTo().window(child_window);

		System.out.println(BaseDriverUtil.driver.switchTo().window(child_window).getTitle());
		System.out.println("title of page is "+ BaseDriverUtil.driver.getTitle());
		}}
		
		
		
		
}
//	public static void getListofElement(WebElement ele)
//	{
//		BaseDriverUtil.driver.findElements(ele)
//		
//	}
}
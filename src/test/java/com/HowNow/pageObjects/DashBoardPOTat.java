package com.HowNow.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPOTat extends BasePO{
	
	@FindBy(xpath = "//span[normalize-space()='Pre-approvals']")
	private WebElement preApprovalsTab;
	
	@FindBy(xpath = "//span[normalize-space()='Edit Pre-approval']")
	private WebElement editPreApprovalsSubTab;
	
	@FindBy(xpath = "//span[normalize-space()='New Pre-approval']")
	private WebElement newPreApprovalTab;
	
	@FindBy(xpath = "//span[normalize-space()='Search Claim']")
	private WebElement searchClaimTab;
	
	public void clickOnPreApprovalsTab() throws InterruptedException {
		scrollMethod(preApprovalsTab);
		highLighterMethod(preApprovalsTab);
		preApprovalsTab.click();
		Thread.sleep(3000);
	}
	
	public void clickOnEditPreApprovalsTab() throws InterruptedException {
		scrollMethod(editPreApprovalsSubTab);
		highLighterMethod(editPreApprovalsSubTab);
		editPreApprovalsSubTab.click();
		Thread.sleep(3000);
	}
	
	public void clickOnNewPreApprovalsTab() throws InterruptedException {
		scrollMethod(newPreApprovalTab);
		highLighterMethod(newPreApprovalTab);
		newPreApprovalTab.click();
		Thread.sleep(3000);
	}
	
	public void clickOnSearchClaimTabTab() throws InterruptedException {
		scrollMethod(searchClaimTab);
		highLighterMethod(searchClaimTab);
		searchClaimTab.click();
		Thread.sleep(3000);
	}

	public void verifyValuesInClaimStatusDropdown() throws InterruptedException {
		scrollMethod(editPreApprovalsSubTab);
		highLighterMethod(editPreApprovalsSubTab);
		editPreApprovalsSubTab.click();
		Thread.sleep(3000);
	}	
}

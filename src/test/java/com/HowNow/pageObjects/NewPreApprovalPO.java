package com.HowNow.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPreApprovalPO extends BasePO {

	// This method is used for finding webElement of Pre-approvals section
	@FindBy(xpath = "//span[normalize-space()='Pre-approvals']")
	private WebElement preApprovalsTab;

	// This method is used for finding webElement of New Pre-approval
	@FindBy(xpath = "//span[normalize-space()='New Pre-approval']")
	private WebElement newPreApproval;

	// This method is used for finding webElement of claim reference
	@FindBy(xpath = "//input[contains(@id,'claimRefInput')]")
	private WebElement claimReference;

	// This method is used for finding webElement of New Claim
	@FindBy(xpath = "//div[contains(text(),'New Claim')]")
	private WebElement newClaimTitle;

	// This method is used for finding webElement of Beneficiary advanced search
	// close button
	@FindBy(xpath = "//div[@class='test-res-close ng-star-inserted']//img[@alt='No icon found']")
	private WebElement beneficiaryAdvSearchCloseBtn;

	public void clickOnPreApprovalsTab() throws InterruptedException {
		scrollMethod(preApprovalsTab);
		highLighterMethod(preApprovalsTab);
		preApprovalsTab.click();
		Thread.sleep(3000);
	}

	public void clickOnNewPreApproval() throws InterruptedException {
		highLighterMethod(newPreApproval);
		newPreApproval.click();
		waitForVisibility(claimReference);
	}

	public WebElement getNewClaimTitle() {
		waitForVisibility(newClaimTitle);
		highLighterMethod(newClaimTitle);
		return newClaimTitle;
	}

	public void clickOnBeneficiaryAdvancedSearchCloseButton() throws InterruptedException {
		waitForVisibility(beneficiaryAdvSearchCloseBtn);
		beneficiaryAdvSearchCloseBtn.click();
		waitForVisibility(claimReference);
	}
}
package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.BalanceEnquiryPageUI;

public class BalanceEnquiryPage extends AbstractPage {
	WebDriver driver;

	public BalanceEnquiryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, BalanceEnquiryPageUI.ACCOUNTNO_TXT);
		sendKeyToElement(driver, BalanceEnquiryPageUI.ACCOUNTNO_TXT, accountNo);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, BalanceEnquiryPageUI.SUBMIT_BTN);
		clickToElement(driver, BalanceEnquiryPageUI.SUBMIT_BTN);
	}

	public String getTextCurrentBalance() {
		waitForControlVisible(driver, BalanceEnquiryPageUI.BALANCE_LBL);
		return getTextElement(driver, BalanceEnquiryPageUI.BALANCE_LBL);
	}

}

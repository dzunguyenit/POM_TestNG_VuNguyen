package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.FundTransferPageUI;

public class FundTransferPage extends AbstractPage {
	WebDriver driver;

	public FundTransferPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputPayerNo(String payerNo) {
		waitForControlVisible(driver, FundTransferPageUI.PAYERSNO_TXT);
		sendKeyToElement(driver, FundTransferPageUI.PAYERSNO_TXT, payerNo);
	}

	public void inputPayeeNo(String payeeNo) {
		waitForControlVisible(driver, FundTransferPageUI.PAYEESNO_TXT);
		sendKeyToElement(driver, FundTransferPageUI.PAYEESNO_TXT, payeeNo);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, FundTransferPageUI.AMOUNT_TXT);
		sendKeyToElement(driver, FundTransferPageUI.AMOUNT_TXT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, FundTransferPageUI.DESCRIPTION_TXT);
		sendKeyToElement(driver, FundTransferPageUI.DESCRIPTION_TXT, description);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, FundTransferPageUI.SUBMIT_BTN);
		clickToElement(driver, FundTransferPageUI.SUBMIT_BTN);
	}

	public String getTextMessageWithdrawSucces() {
		waitForControlVisible(driver, FundTransferPageUI.TRANSACTIONSUCCESS_LBL);
		return getTextElement(driver, FundTransferPageUI.TRANSACTIONSUCCESS_LBL);
	}

	public String getTextCurrentBalance() {
		waitForControlVisible(driver, FundTransferPageUI.AMOUNT_LBL);
		return getTextElement(driver, FundTransferPageUI.AMOUNT_LBL);
	}

}

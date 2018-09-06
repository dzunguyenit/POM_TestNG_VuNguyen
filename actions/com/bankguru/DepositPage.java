package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.DepositUI;

public class DepositPage extends AbstractPage {
	WebDriver driver;

	public DepositPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, DepositUI.ACCOUNTNO_TXT);
		sendKeyToElement(driver, DepositUI.ACCOUNTNO_TXT, accountNo);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, DepositUI.AMOUNT_TXT);
		sendKeyToElement(driver, DepositUI.AMOUNT_TXT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, DepositUI.DESCRIPTION_TXT);
		sendKeyToElement(driver, DepositUI.DESCRIPTION_TXT, description);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, DepositUI.SUBMIT_BTN);
		clickToElement(driver, DepositUI.SUBMIT_BTN);
	}

	public String getTextMessageDepositSucces() {
		waitForControlVisible(driver, DepositUI.TRANSACTIONSUCCESS_LBL);
		return getTextElement(driver, DepositUI.TRANSACTIONSUCCESS_LBL);
	}

	public String getTextCurrentBalance() {
		waitForControlVisible(driver, DepositUI.CURRENTDEPOSIT_LBL);
		return getTextElement(driver, DepositUI.CURRENTDEPOSIT_LBL);
	}

}

package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.WithdrawPageUI;

public class WithDrawPage extends AbstractPage {
	WebDriver driver;

	public WithDrawPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, WithdrawPageUI.ACCOUNTNO_TXT);
		sendKeyToElement(driver, WithdrawPageUI.ACCOUNTNO_TXT, accountNo);
	}

	public void inputAmount(String amount) {
		waitForControlVisible(driver, WithdrawPageUI.AMOUNT_TXT);
		sendKeyToElement(driver, WithdrawPageUI.AMOUNT_TXT, amount);
	}

	public void inputDescription(String description) {
		waitForControlVisible(driver, WithdrawPageUI.DESCRIPTION_TXT);
		sendKeyToElement(driver, WithdrawPageUI.DESCRIPTION_TXT, description);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, WithdrawPageUI.SUBMIT_BTN);
		clickToElement(driver, WithdrawPageUI.SUBMIT_BTN);
	}

	public String getTextMessageWithdrawSucces() {
		waitForControlVisible(driver, WithdrawPageUI.TRANSACTIONSUCCESS_LBL);
		return getTextElement(driver, WithdrawPageUI.TRANSACTIONSUCCESS_LBL);
	}

	public String getTextCurrentBalance() {
		waitForControlVisible(driver, WithdrawPageUI.CURRENTDEPOSIT_LBL);
		return getTextElement(driver, WithdrawPageUI.CURRENTDEPOSIT_LBL);
	}

}

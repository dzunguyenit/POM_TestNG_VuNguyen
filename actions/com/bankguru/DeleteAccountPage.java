package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.DeleteAccountPageUI;

public class DeleteAccountPage extends AbstractPage {
	WebDriver driver;

	public DeleteAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, DeleteAccountPageUI.ACCOUNTNO_TXT);
		sendKeyToElement(driver, DeleteAccountPageUI.ACCOUNTNO_TXT, accountNo);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, DeleteAccountPageUI.SUBMIT_BTN);
		clickToElement(driver, DeleteAccountPageUI.SUBMIT_BTN);
	}

	public void acceptAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}

	public String getTextAlert() {
		waitForAlertPresence(driver);
		waitForIEBrowser(3000);
		return getTextAlert(driver);
	}

}

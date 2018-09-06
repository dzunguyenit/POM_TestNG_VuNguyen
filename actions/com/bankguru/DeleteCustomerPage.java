package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.DeleteCustomerPageUI;

public class DeleteCustomerPage extends AbstractPage {
	WebDriver driver;

	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputAccountNo(String accountNo) {
		waitForControlVisible(driver, DeleteCustomerPageUI.CUSTOMERID_TXT);
		sendKeyToElement(driver, DeleteCustomerPageUI.CUSTOMERID_TXT, accountNo);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, DeleteCustomerPageUI.SUBMIT_BTN);
		clickToElement(driver, DeleteCustomerPageUI.SUBMIT_BTN);
	}

	public void acceptAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}

	public String getTextAlert() {
		waitForAlertPresence(driver);
		return getTextAlert(driver);
	}

}

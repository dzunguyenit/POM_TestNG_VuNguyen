package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.AccountUI;

public class NewAccountPage extends AbstractPage {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputIdCustomer(String IdCustomer) {
		waitForControlVisible(driver, AccountUI.CUSTOMER_ID_TXT);
		sendKeyToElement(driver, AccountUI.CUSTOMER_ID_TXT, IdCustomer);
	}

	public void selectAcountType(String type) {
		selectItemInDropdown(driver, AccountUI.ACCOUNT_TYPE_CBX, type);
	}

	public void inputDeposit(String deposit) {
		waitForControlVisible(driver, AccountUI.INITIAL_DEPOSIT_TXT);
		sendKeyToElement(driver, AccountUI.INITIAL_DEPOSIT_TXT, deposit);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, AccountUI.SUBMIT_BTN);
		clickToElement(driver, AccountUI.SUBMIT_BTN);
	}

	public String getTextMessageNewAccoutSucces() {
		waitForControlVisible(driver, AccountUI.ACCOUNTGENERATESUCCESS_LBL);
		return getTextElement(driver, AccountUI.ACCOUNTGENERATESUCCESS_LBL);
	}

	public String getTextDeposit() {
		waitForControlVisible(driver, AccountUI.CURRENTDEPOSIT_LBL);
		return getTextElement(driver, AccountUI.CURRENTDEPOSIT_LBL);
	}

	public String getAccountID() {
		waitForControlVisible(driver, AccountUI.ACCOUNTID_LBL);
		return getTextElement(driver, AccountUI.ACCOUNTID_LBL);
	}

}

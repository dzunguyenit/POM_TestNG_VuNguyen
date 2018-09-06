package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.abstractPage.PageFactory;
import com.ecommerce.ui.AccountUI;

public class AccountTVPage extends AbstractPage {
	WebDriver driver;

	public AccountTVPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputFirstName(String firstName) {
		waitForControlVisible(driver, AccountUI.FIRSTNAME_TXT);
		sendKeyToElement(driver, AccountUI.FIRSTNAME_TXT, firstName);
	}

	public void inputMiddleName(String middleName) {
		waitForControlVisible(driver, AccountUI.MIDDLENAME_TXT);
		sendKeyToElement(driver, AccountUI.MIDDLENAME_TXT, middleName);
	}

	public void inputLastName(String lastName) {
		waitForControlVisible(driver, AccountUI.LASTNAME_TXT);
		sendKeyToElement(driver, AccountUI.LASTNAME_TXT, lastName);
	}

	public void inputEmail(String email) {
		waitForControlVisible(driver, AccountUI.EMAIL_TXT);
		sendKeyToElement(driver, AccountUI.EMAIL_TXT, email);
	}

	public void inputPassword(String password) {
		waitForControlVisible(driver, AccountUI.PASS_TXT);
		sendKeyToElement(driver, AccountUI.PASS_TXT, password);
	}

	public void inputConfirmPassword(String confirmPassword) {
		waitForControlVisible(driver, AccountUI.CONFIRMPASS_TXT);
		sendKeyToElement(driver, AccountUI.CONFIRMPASS_TXT, confirmPassword);
	}

	public void clickCreateAccountBtn() {
		waitForControlVisible(driver, AccountUI.CREATEACCOUNT_BTN);
		clickToElement(driver, AccountUI.CREATEACCOUNT_BTN);
	}

	public TVHome clickRegisterBtn() {
		waitForControlVisible(driver, AccountUI.REGISTER_BTN);
		clickToElement(driver, AccountUI.REGISTER_BTN);
		return PageFactory.getTVHomePage(driver);
	}

	public void inputEmailRegister(String emailRegistered) {
		waitForControlVisible(driver, AccountUI.EMAIL_REGISTERED_TXT);
		sendKeyToElement(driver, AccountUI.EMAIL_REGISTERED_TXT, emailRegistered);
	}

	public void inputPasswordRegistered(String passwordRegistered) {
		waitForControlVisible(driver, AccountUI.PASSWORD_REGISTERED_TXT);
		sendKeyToElement(driver, AccountUI.PASSWORD_REGISTERED_TXT, passwordRegistered);
	}

	public TVHome clickLoginBtn() {
		waitForControlVisible(driver, AccountUI.LOGIN_BTN);
		clickToElement(driver, AccountUI.LOGIN_BTN);
		return new TVHome(driver);
	}
}

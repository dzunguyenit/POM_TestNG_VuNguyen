package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.abstractPage.PageFactory;
import com.bankguru.ui.RegisterPageUI;

public class RegisterPage extends AbstractPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String emailValue) {
		waitForControlVisible(driver, RegisterPageUI.EMAIL_ID_TXT);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_ID_TXT, emailValue);
	}

	public void clickSubmitButton() {
		waitForControlVisible(driver, RegisterPageUI.SUBMIT_BTN);
		clickToElement(driver, RegisterPageUI.SUBMIT_BTN);
	}

	public String getUserIDInfo() {
		waitForControlVisible(driver, RegisterPageUI.USER_ID_TEXT);
		return getTextElement(driver, RegisterPageUI.USER_ID_TEXT);
	}

	public String getPasswordIDInfo() {
		waitForControlVisible(driver, RegisterPageUI.PASSWORD_ID_TEXT);
		return getTextElement(driver, RegisterPageUI.PASSWORD_ID_TEXT);
	}

	public LoginPage openLoginPage(String url) {
		openUrl(driver, url);
		return PageFactory.getLoginPage(driver);
	}
}

package com.joomla;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.joomla.ui.LoginJoomlaUI;

public class LoginJoomlaPage extends AbstractPage {
	WebDriver driver;

	public LoginJoomlaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUsername(String username) {
		waitForControlVisible(driver, LoginJoomlaUI.USERNAME_TXT);
		sendKeyToElement(driver, LoginJoomlaUI.USERNAME_TXT, username);
	}

	public void inputPassword(String password) {
		waitForControlVisible(driver, LoginJoomlaUI.PASSWORD_TXT);
		sendKeyToElement(driver, LoginJoomlaUI.PASSWORD_TXT, password);
	}

	public IndexJoomlaPage clickLogin() {
		waitForControlVisible(driver, LoginJoomlaUI.LOGIN_BTN);
		clickToElement(driver, LoginJoomlaUI.LOGIN_BTN);
		return new IndexJoomlaPage(driver);
	}

}

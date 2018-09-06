package com.bankguru;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.abstractPage.PageFactory;
import com.bankguru.ui.LoginPageUI;

public class LoginPage extends AbstractPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageUrl() {
		return getCurrentUrl(driver);
	}

	public RegisterPage clickHereLink() {
		// if (driver.toString().toLowerCase().contains("internetexplorer")) {
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		waitForControlVisible(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
		return PageFactory.getRegisterPage(driver);
	}

	public void inputEmail(String username) {
		waitForControlVisible(driver, LoginPageUI.EMAIL_TXT);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TXT, username);
	}

	public void inputPassword(String password) {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TXT, password);
	}

	public HomePage clickSubmitButton() {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BTN);
		clickToElement(driver, LoginPageUI.LOGIN_BTN);
		return PageFactory.getHomePage(driver);
	}

}

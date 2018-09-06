package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.abstractPage.PageFactory;
import com.ecommerce.ui.HomeGuru99UI;

public class HomeGuru99 extends AbstractPage {
	WebDriver driver;

	public HomeGuru99(WebDriver driver) {
		this.driver = driver;
	}

	public HomeMobile clickMobileMenu() {
		waitForControlVisible(driver, HomeGuru99UI.MOBILEMENU_LBL);
		clickToElement(driver, HomeGuru99UI.MOBILEMENU_LBL);
		return PageFactory.getHomeMobilePage(driver);
	}

	public AccountTVPage clickMyAccount() {
		waitForControlVisible(driver, HomeGuru99UI.MYACCOUNT_LBL);
		clickToElement(driver, HomeGuru99UI.MYACCOUNT_LBL);
		return PageFactory.getAccountTVPage(driver);
	}

}

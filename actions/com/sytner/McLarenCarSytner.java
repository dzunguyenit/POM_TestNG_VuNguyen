package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.sytner.ui.AudiCarSytnerUI;

public class McLarenCarSytner extends AbstractPage {
	WebDriver driver;

	public McLarenCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlMcLarenCar() {
		return getCurrentUrl(driver);
	}

	public HomeSytner clickIconSytner() {
		waitForControlVisible(driver, AudiCarSytnerUI.SYTNER_LOGO);
		clickToElement(driver, AudiCarSytnerUI.SYTNER_LOGO);
		return new HomeSytner(driver);
	}
}

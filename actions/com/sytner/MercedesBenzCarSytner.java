package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.sytner.ui.AudiCarSytnerUI;

public class MercedesBenzCarSytner extends AbstractPage {
	WebDriver driver;

	public MercedesBenzCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlMercedesBenzCar() {
		return getCurrentUrl(driver);
	}

	public HomeSytner clickIconSytner() {
		waitForControlVisible(driver, AudiCarSytnerUI.SYTNER_LOGO);
		clickToElement(driver, AudiCarSytnerUI.SYTNER_LOGO);
		return new HomeSytner(driver);
	}
}

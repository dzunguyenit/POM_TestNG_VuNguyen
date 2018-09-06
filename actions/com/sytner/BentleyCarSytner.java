package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.sytner.ui.AudiCarSytnerUI;

public class BentleyCarSytner extends AbstractPage {
	WebDriver driver;

	public BentleyCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public HomeSytner clickIconSytner() {
		waitForControlVisible(driver, AudiCarSytnerUI.SYTNER_LOGO);
		clickToElement(driver, AudiCarSytnerUI.SYTNER_LOGO);
		return new HomeSytner(driver);
	}

	public String getUrlBentleyCar() {
		return getCurrentUrl(driver);
	}
}

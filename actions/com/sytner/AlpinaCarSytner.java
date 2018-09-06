package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.sytner.ui.AlpinaCarSytnerUI;

public class AlpinaCarSytner extends AbstractPage {
	WebDriver driver;

	public AlpinaCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlAlpinaCar() {
		return getCurrentUrl(driver);
	}

	public HomeSytner clickIconSytner() {
		waitForControlVisible(driver, AlpinaCarSytnerUI.SYTNER_LOGO);
		clickToElement(driver, AlpinaCarSytnerUI.SYTNER_LOGO);
		return new HomeSytner(driver);
	}
}

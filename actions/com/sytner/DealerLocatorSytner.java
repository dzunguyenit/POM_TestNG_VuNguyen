package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.sytner.ui.DealerLocatorSytnerUI;

public class DealerLocatorSytner extends AbstractPage {
	WebDriver driver;

	public DealerLocatorSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlDealerLocator() {
		return getCurrentUrl(driver);
	}

	public HomeSytner clickHomeIcon() {
		waitForControlVisible(driver, DealerLocatorSytnerUI.HOME_ICON);
		clickToElement(driver, DealerLocatorSytnerUI.HOME_ICON);
		return new HomeSytner(driver);
	}

	public HomeSytner clickSytnerGroup() {
		waitForControlVisible(driver, DealerLocatorSytnerUI.SYTNERGROUP_ICON);
		clickToElement(driver, DealerLocatorSytnerUI.SYTNERGROUP_ICON);
		return new HomeSytner(driver);
	}
}

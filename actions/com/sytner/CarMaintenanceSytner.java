package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class CarMaintenanceSytner extends AbstractPage {
	WebDriver driver;

	public CarMaintenanceSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlCarMaintenance() {
		return getCurrentUrl(driver);
	}
}

package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class SavedVehicleSytner extends AbstractPage {
	WebDriver driver;

	public SavedVehicleSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlSavedVehicle() {
		return getCurrentUrl(driver);
	}
}

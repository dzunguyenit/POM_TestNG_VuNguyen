package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class UsedCarSearchSytner extends AbstractPage {
	WebDriver driver;

	public UsedCarSearchSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlUsedCarSearch() {
		return getCurrentUrl(driver);
	}

}

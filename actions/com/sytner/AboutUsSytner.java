package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class AboutUsSytner extends AbstractPage {
	WebDriver driver;

	public AboutUsSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlAboutUs() {
		return getCurrentUrl(driver);
	}
}

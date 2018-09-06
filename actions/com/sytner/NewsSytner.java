package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class NewsSytner extends AbstractPage {
	WebDriver driver;

	public NewsSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlNewsSytner() {
		return getCurrentUrl(driver);
	}
}

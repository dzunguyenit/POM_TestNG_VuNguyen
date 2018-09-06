package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class PromotionsSytner extends AbstractPage {
	WebDriver driver;

	public PromotionsSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlPromotions() {
		return getCurrentUrl(driver);
	}
}

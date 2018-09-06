package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_010_Promotions extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private PromotionsSytner promotionsSytner;
	String urlPromotions;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlPromotions = "https://www.sytner.co.uk/promotions/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_010_MenuItems_010_Promotions() {
		promotionsSytner = homeSytner.openPromotionsSytnerPage(driver);
		verifyEquals(urlPromotions, promotionsSytner.getUrlPromotions());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

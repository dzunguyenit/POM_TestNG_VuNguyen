package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_012_SellYourCar extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private SellYourCarSytner sellYourCarSytner;
	String urlSellYourCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlSellYourCar = "https://www.sytner.co.uk/sell-your-car/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_012_MenuItems_012_SellYourCar() {
		sellYourCarSytner = homeSytner.openSellYourCarSytnerPage(driver);
		verifyEquals(urlSellYourCar, sellYourCarSytner.getUrlSellYourCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

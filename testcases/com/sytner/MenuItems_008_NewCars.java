package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_008_NewCars extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private NewCarSytner newCarSytner;
	String urlNewCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlNewCar = "https://www.sytner.co.uk/new-cars/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_008_MenuItems_008_NewCars() {
		newCarSytner = homeSytner.openNewCarSytnerPage(driver);
		verifyEquals(urlNewCar, newCarSytner.getUrlNewCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_009_CarMaintenance extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private CarMaintenanceSytner carMaintenanceSytner;
	String urlCarMaintenance;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlCarMaintenance = "https://www.sytner.co.uk/car-maintenance/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_009_MenuItems_009_CarMaintenance() {
		carMaintenanceSytner = homeSytner.openCarMaintenanceSytnerPage(driver);
		verifyEquals(urlCarMaintenance, carMaintenanceSytner.getUrlCarMaintenance());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

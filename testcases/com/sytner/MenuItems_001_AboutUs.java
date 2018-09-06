package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_001_AboutUs extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private AboutUsSytner aboutUsSytner;
	// private SavedVehicleSytner savedVehicleSytner;

	String urlAboutUs;
	int totalVehicle;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlAboutUs = "https://www.sytner.co.uk/about-us/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_001_MenuItems_001_AboutUs() {
		aboutUsSytner = homeSytner.openAboutUsSytnerPage(driver);
		verifyEquals(urlAboutUs, aboutUsSytner.getUrlAboutUs());

	}

	// @Test
	// public void TC_006_MenuItems_006_SavedVehicles() {
	// savedVehicleSytner = homeSytner.openSavedVehicleSytnerPage(driver);
	// verifyEquals(urlCareer, savedVehicleSytner.getUrlSavedVehicle());
	// }

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_008_LandRover extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private LandRoverCarSytner landRoverCarSytner;
	String urlLandRoverCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlLandRoverCar = "https://www.sytner.co.uk/landrover/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_025_JumpPoints_008_LandRover() {
		verifyTrue(homeSytner.checkDisplayLandRoverIcon(driver));
		landRoverCarSytner = homeSytner.clickLandRoverIcon(driver);
		verifyEquals(urlLandRoverCar, landRoverCarSytner.getUrlLandRoverCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

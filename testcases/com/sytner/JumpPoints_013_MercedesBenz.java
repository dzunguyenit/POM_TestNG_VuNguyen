package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_013_MercedesBenz extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private MercedesBenzCarSytner mercedesBenzCarSytner;
	String urlMercedesBenzCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlMercedesBenzCar = "https://www.sytner.co.uk/mercedes-benz/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_030_JumpPoints_013_MercedesBenz() {
		verifyTrue(homeSytner.checkDisplayMercedesBenzIcon(driver));
		mercedesBenzCarSytner = homeSytner.clickMercedesBenzIcon(driver);
		verifyEquals(urlMercedesBenzCar, mercedesBenzCarSytner.getUrlMercedesBenzCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

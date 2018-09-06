package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_018_Smart extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private SmartCarSytner smartCarSytner;
	String urlSmartCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlSmartCar = "https://www.sytner.co.uk/smart/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_035_JumpPoints_018_Smart() {
		verifyTrue(homeSytner.checkDisplaySmartIcon(driver));
		smartCarSytner = homeSytner.clickSmartCarIcon(driver);
		verifyEquals(urlSmartCar, smartCarSytner.getUrlSmartCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

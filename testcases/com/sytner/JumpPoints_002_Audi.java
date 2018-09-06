package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_002_Audi extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private AudiCarSytner audiCarSytner;
	String urlAudiCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlAudiCar = "https://www.sytner.co.uk/audi/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_019_JumpPoints_002_Audi() {
		verifyTrue(homeSytner.checkDisplayAudiIcon(driver));
		audiCarSytner = homeSytner.clickAudiIcon(driver);
		verifyEquals(urlAudiCar, audiCarSytner.getUrlAudiCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

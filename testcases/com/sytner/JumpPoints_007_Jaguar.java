package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_007_Jaguar extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private JaguarCarSytner jaguarCarSytner;
	String urlJaguarCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlJaguarCar = "https://www.sytner.co.uk/jaguar/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_024_JumpPoints_005_Ferrari() {
		verifyTrue(homeSytner.checkDisplayJaguarIcon(driver));
		jaguarCarSytner = homeSytner.clickJaguarIcon(driver);
		verifyEquals(urlJaguarCar, jaguarCarSytner.getUrlJaguarCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

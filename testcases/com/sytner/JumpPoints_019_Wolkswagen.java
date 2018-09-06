package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_019_Wolkswagen extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private WolkswagenCarSytner wolkswagenCarSytner;
	String urlWolkswagenCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlWolkswagenCar = "https://www.sytner.co.uk/volkswagen/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_036_JumpPoints_019_Wolkswagen() {
		verifyTrue(homeSytner.checkDisplayWolkswagenIcon(driver));
		wolkswagenCarSytner = homeSytner.clickWolkswagenCarIcon(driver);
		verifyEquals(urlWolkswagenCar, wolkswagenCarSytner.getUrlWolkswagenCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

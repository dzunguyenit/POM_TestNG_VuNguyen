package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_022_GraypaulClassicCars extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private GraypaulClassicCarsSytner graypaulClassicCarsSytner;
	String urlGraypaulClassicCars;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlGraypaulClassicCars = "https://www.graypaulclassiccars.com/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_039_JumpPoints_JumpPoints_022_GraypaulClassicCars() {
		verifyTrue(homeSytner.checkDisplayGraypaulIcon(driver));
		graypaulClassicCarsSytner = homeSytner.clickGraypaulIcon(driver);
		verifyEquals(urlGraypaulClassicCars, graypaulClassicCarsSytner.getUrlGraypaulClassicCars());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

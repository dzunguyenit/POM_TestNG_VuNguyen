package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_015_Porsche extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private PorscheCarSytner porscheCarSytner;
	String urlPorscheCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlPorscheCar = "https://www.sytner.co.uk/porsche/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_032_JumpPoints_015_Porsche() {
		verifyTrue(homeSytner.checkDisplayMiniIcon(driver));
		porscheCarSytner = homeSytner.clickPorscheCarIcon(driver);
		verifyEquals(urlPorscheCar, porscheCarSytner.getUrlPorscheCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

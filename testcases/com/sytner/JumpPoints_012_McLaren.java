package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_012_McLaren extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private McLarenCarSytner mcLarenCarSytner;
	String urlMcLarenCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlMcLarenCar = "https://www.sytner.co.uk/mclaren/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_029_JumpPoints_012_McLaren() {
		verifyTrue(homeSytner.checkDisplayMclarenIcon(driver));
		mcLarenCarSytner = homeSytner.clickMcLarenIcon(driver);
		verifyEquals(urlMcLarenCar, mcLarenCarSytner.getUrlMcLarenCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

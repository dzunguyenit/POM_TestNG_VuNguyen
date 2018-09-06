package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_003_Bentley extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private BentleyCarSytner bentleyCarSytner;
	String urlBentleyCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlBentleyCar = "https://www.sytner.co.uk/bentley/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_020_JumpPoints_003_Bentley() {
		verifyTrue(homeSytner.checkDisplayBentleyIcon(driver));
		bentleyCarSytner = homeSytner.clickBentleyIcon(driver);
		verifyEquals(urlBentleyCar, bentleyCarSytner.getUrlBentleyCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

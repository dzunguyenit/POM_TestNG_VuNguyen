package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_010_Lexus extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private LexusCarSytner lexusCarSytner;
	String urlLexusCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlLexusCar = "https://www.sytner.co.uk/lexus/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_027_JumpPoints_010_Lexus() {
		verifyTrue(homeSytner.checkDisplayLexusIcon(driver));
		lexusCarSytner = homeSytner.clickLexusIcon(driver);
		verifyEquals(urlLexusCar, lexusCarSytner.getUrlLexusCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

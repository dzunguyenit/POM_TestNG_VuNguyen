package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_021_SytnerSelect extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private SytnerSelectCarSytner sytnerSelectCarSytner;
	String urlSytnerSelectCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlSytnerSelectCar = "https://www.sytner.co.uk/sytner-select/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_038_JumpPoints_021_SytnerSelect() {
		verifyTrue(homeSytner.checkDisplaySytnerSelectIcon(driver));
		sytnerSelectCarSytner = homeSytner.clickSytnerSelectIcon(driver);
		verifyEquals(urlSytnerSelectCar, sytnerSelectCarSytner.getUrlSytnerSelectCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}

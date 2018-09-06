package com.sytner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abstractPage.AbstractPage;
import com.sytner.ui.HomeSytnerUI;

public class HomeSytner extends AbstractPage {
	WebDriver driver;

	public HomeSytner(WebDriver driver) {
		this.driver = driver;
	}

	public Boolean checkTotalVehicle() {
		waitForControlVisible(driver, HomeSytnerUI.MAKES_CBX);
		clickToElement(driver, HomeSytnerUI.MAKES_CBX);
		waitForControlVisible(driver, HomeSytnerUI.QUANTITY_VEHICLE_LBL);
		List<WebElement> list = driver.findElements(By.xpath(HomeSytnerUI.QUANTITY_VEHICLE_LBL));
		int toTal = 0;
		for (int i = 0; i < list.size(); i++) {
			toTal = toTal + Integer.parseInt(list.get(i).getText());

		}
		if (toTal > 7000)
			return true;
		return false;
	}

	public Boolean checkValueInMakesDropdown(int index, String value) {
		waitForControlVisible(driver, HomeSytnerUI.VALUE_VEHICLE_DROPDOWN);
		List<WebElement> list = driver.findElements(By.xpath(HomeSytnerUI.VALUE_VEHICLE_DROPDOWN));
		for (int i = 0; i < list.size(); i++) {
			list.get(i).getText();

		}
		return verifyEquals(value, list.get(index).getText());
	}

	public Boolean checkDisplayOKButton(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.MAKES_CBX);
		clickToElement(driver, HomeSytnerUI.MAKES_CBX);
		waitForControlVisible(driver, HomeSytnerUI.OK_BTN);
		return isControlDisplayed(driver, HomeSytnerUI.OK_BTN);
	}

	public void chooseValueMakeDropdown(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.MAKES_CBX);
		clickToElement(driver, HomeSytnerUI.MAKES_CBX);
		waitForControlVisible(driver, HomeSytnerUI.VALUE_VEHICLE_CKCBOX);
		executeJavascriptToElement(driver, HomeSytnerUI.VALUE_VEHICLE_CKCBOX);
	}

	public Boolean checkDisplayCancelButton(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CANCEL_BTN);
		return isControlDisplayed(driver, HomeSytnerUI.CANCEL_BTN);
	}

	public String getUrlHomePage(WebDriver driver) {
		return getCurrentUrl(driver);
	}

	public Boolean checkDisplayUrlSearchCar(WebDriver driver) {
		return getCurrentUrl(driver).contains("https://www.sytner.co.uk/car-search/search");
	}

	public Boolean checkDisplaySearchCarButton(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CARSEARCH_BTN);
		return isControlDisplayed(driver, HomeSytnerUI.CARSEARCH_BTN);
	}

	public Boolean checkDisplayMakeLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.MAKE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.MAKE_LBL);
	}

	public Boolean checkDisplayNoMinPriceLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.NOMIN_PRICE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.NOMIN_PRICE_LBL);
	}

	public Boolean checkDisplayNoMaxPriceLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.NOMAX_PRICE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.NOMAX_PRICE_LBL);
	}

	public Boolean checkDisplayModelLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.MODEL_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.MODEL_LBL);
	}

	public Boolean checkDisplayPostcodeLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.POSTCODE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.POSTCODE_LBL);
	}

	public Boolean checkDisplayPriceRangeLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.PRICE_RANGE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.PRICE_RANGE_LBL);
	}

	public Boolean checkPriceRangeRadioSelected(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.PRICE_RANGE_RADIO);
		return isControlSelected(driver, HomeSytnerUI.PRICE_RANGE_RADIO);
	}

	public void clickPriceRangeRadio(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.PRICE_RANGE_RADIO);
		clickToElement(driver, HomeSytnerUI.PRICE_RANGE_RADIO);
	}

	public void clickPostcodeDropdown(WebDriver driver) {
		executeJavascriptToBrowser(driver, "$('.filter-distance .filter-options').slideDown()");
	}

	public void clickMinPriceDropdown(WebDriver driver) {
		executeJavascriptToBrowser(driver, "$('.filter-distance .filter-options').slideDown()");
	}

	public Boolean checkDisplayEnterPostCode(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.ENTER_POSTCODE_TXT);
		return isControlDisplayed(driver, HomeSytnerUI.ENTER_POSTCODE_TXT);
	}

	public Boolean checkDisplayAnyDistance(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.ANY_DISTANCE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.ANY_DISTANCE_LBL);
	}

	public Boolean checkDisplayAllLabel(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.OK_BTN);
		executeJavascriptToElement(driver, HomeSytnerUI.OK_BTN);
		waitForControlVisible(driver, HomeSytnerUI.MODEL_CBX);
		executeJavascriptToBrowser(driver, "$('.filter-model .filter-options').slideDown()");
		waitForControlVisible(driver, HomeSytnerUI.ALL_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.ALL_LBL);
	}

	public Boolean checkDisplayPleaseSelectMakeFirst(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.MODEL_CBX);
		executeJavascriptToBrowser(driver, "$('.filter-model .filter-options').slideDown()");
		waitForControlVisible(driver, HomeSytnerUI.NOMAKE_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.NOMAKE_LBL);
	}

	public Boolean checkDisplayOKModelbutton(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.OK_MODEL_BTN);
		return isControlDisplayed(driver, HomeSytnerUI.OK_MODEL_BTN);
	}

	public Boolean checkDisplayCancelModelbutton(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CANCEL_MODEL_BTN);
		return isControlDisplayed(driver, HomeSytnerUI.CANCEL_MODEL_BTN);
	}

	public void clickSearchCar(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CARSEARCH_BTN);
		clickToElement(driver, HomeSytnerUI.CARSEARCH_BTN);
	}

	public Boolean checkDisplayPagination(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.PAGINATION_ICON);
		return isControlDisplayed(driver, HomeSytnerUI.PAGINATION_ICON);
	}

	public Boolean checkDisplayCarSearch(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CARSEARCH_LBL);
		return isControlDisplayed(driver, HomeSytnerUI.CARSEARCH_LBL);
	}

	public Boolean checkDisplayAlpinaIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "ALPINA", "ALPINA");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "ALPINA", "ALPINA");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "ALPINA", "ALPINA");
	}

	public Boolean checkDisplayAudiIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Audi", "Audi");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Audi", "Audi");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Audi", "Audi");
	}

	public Boolean checkDisplayBMWIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "BMW", "BMW");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "BMW", "BMW");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "BMW", "BMW");
	}

	public Boolean checkDisplayBentleyIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Bentley", "Bentley");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Bentley", "Bentley");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Bentley", "Bentley");
	}

	public Boolean checkDisplayMiniIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "MINI", "MINI");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "MINI", "MINI");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "MINI", "MINI");
	}

	public Boolean checkDisplayRollsRoyceIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Rolls Royce", "Rolls-Royce");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Rolls Royce", "Rolls-Royce");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Rolls Royce", "Rolls-Royce");
	}

	public Boolean checkDisplaySeatIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "SEAT", "SEAT");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "SEAT", "SEAT");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "SEAT", "SEAT");
	}

	public Boolean checkDisplaySmartIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Smart", "smart");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Smart", "smart");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Smart", "smart");
	}

	public Boolean checkDisplayWolkswagenIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.WOLKSWAGEN_POINT_ICON);
		hoverMouse(driver, HomeSytnerUI.WOLKSWAGEN_POINT_ICON);
		return isControlDisplayed(driver, HomeSytnerUI.WOLKSWAGEN_POINT_ICON);
	}

	public Boolean checkDisplayVolvoIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Volvo", "Volvo");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Volvo", "Volvo");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Volvo", "Volvo");
	}

	public Boolean checkDisplaySytnerSelectIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Sytner Select", "Sytner Select");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Sytner Select", "Sytner Select");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Sytner Select", "Sytner Select");
	}

	public Boolean checkDisplayGraypaulIcon(WebDriver driver) {
		removeAttributeInDOM(driver, HomeSytnerUI.GRAYPAUL_LINK, "onclick");
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Graypaul Classic Cars", "Graypaul Classic Cars");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Graypaul Classic Cars", "Graypaul Classic Cars");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Graypaul Classic Cars",
				"Graypaul Classic Cars");
	}

	public Boolean checkDisplayLandRoverIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Land Rover", "Land Rover");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Land Rover", "Land Rover");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Land Rover", "Land Rover");
	}

	public Boolean checkDisplayLexusIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Lexus", "Lexus");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Lexus", "Lexus");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Lexus", "Lexus");
	}

	public Boolean checkDisplayJaguarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Jaguar", "Jaguar");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Jaguar", "Jaguar");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Jaguar", "Jaguar");
	}

	public Boolean checkDisplayFerrariIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Ferrari", "Ferrari");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Ferrari", "Ferrari");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Ferrari", "Ferrari");
	}

	public Boolean checkDisplayMaseratiIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Maserati", "Maserati");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Maserati", "Maserati");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Maserati", "Maserati");
	}

	public Boolean checkDisplayMclarenIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Mclaren", "McLaren");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Mclaren", "McLaren");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Mclaren", "McLaren");
	}

	public Boolean checkDisplayPorscheIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Porsche", "Porsche");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Porsche", "Porsche");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Porsche", "Porsche");
	}

	public Boolean checkDisplayMercedesBenzIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Mercedes Benz", "Mercedes-Benz");
		hoverMouse(driver, HomeSytnerUI.CAR_POINT_ICON, "Mercedes Benz", "Mercedes-Benz");
		return isControlDisplayed(driver, HomeSytnerUI.CAR_POINT_ICON, "Mercedes Benz", "Mercedes-Benz");
	}

	public AlpinaCarSytner clickAlpinaIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "ALPINA", "ALPINA");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "ALPINA", "ALPINA");
		return new AlpinaCarSytner(driver);
	}

	public MercedesBenzCarSytner clickMercedesBenzIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Mercedes Benz", "Mercedes-Benz");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Mercedes Benz", "Mercedes-Benz");
		return new MercedesBenzCarSytner(driver);
	}

	public MiniCarSytner clickMiniCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "MINI", "MINI");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "MINI", "MINI");
		return new MiniCarSytner(driver);
	}

	public PorscheCarSytner clickPorscheCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Porsche", "Porsche");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Porsche", "Porsche");
		return new PorscheCarSytner(driver);
	}

	public RollsRoyceCarSytner clickRollsRoyceCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Rolls Royce", "Rolls-Royce");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Rolls Royce", "Rolls-Royce");
		return new RollsRoyceCarSytner(driver);
	}

	public SeatCarSytner clickSeatCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "SEAT", "SEAT");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "SEAT", "SEAT");
		return new SeatCarSytner(driver);
	}

	public SmartCarSytner clickSmartCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Smart", "smart");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Smart", "smart");
		return new SmartCarSytner(driver);
	}

	public WolkswagenCarSytner clickWolkswagenCarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.WOLKSWAGEN_POINT_ICON);
		executeJavascriptToElement(driver, HomeSytnerUI.WOLKSWAGEN_POINT_ICON);
		return new WolkswagenCarSytner(driver);
	}

	public JaguarCarSytner clickJaguarIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Jaguar", "Jaguar");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Jaguar", "Jaguar");
		return new JaguarCarSytner(driver);
	}

	public SytnerSelectCarSytner clickSytnerSelectIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Sytner Select", "Sytner Select");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Sytner Select", "Sytner Select");
		return new SytnerSelectCarSytner(driver);
	}

	public GraypaulClassicCarsSytner clickGraypaulIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Graypaul Classic Cars", "Graypaul Classic Cars");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Graypaul Classic Cars",
				"Graypaul Classic Cars");
		return new GraypaulClassicCarsSytner(driver);
	}

	public VolvoCarSytner clickVolvoIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Volvo", "Volvo");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Volvo", "Volvo");
		return new VolvoCarSytner(driver);
	}

	public LamborghiniCarSytner clickLamborghiniIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Lamborghini", "Lamborghini");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Lamborghini", "Lamborghini");
		return new LamborghiniCarSytner(driver);
	}

	public LexusCarSytner clickLexusIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Lexus", "Lexus");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Lexus", "Lexus");
		return new LexusCarSytner(driver);
	}

	public MaseratiCarSytner clickMaseratiIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Maserati", "Maserati");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Maserati", "Maserati");
		return new MaseratiCarSytner(driver);
	}

	public McLarenCarSytner clickMcLarenIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Mclaren", "McLaren");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Mclaren", "McLaren");
		return new McLarenCarSytner(driver);
	}

	public LandRoverCarSytner clickLandRoverIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Land Rover", "Land Rover");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Land Rover", "Land Rover");
		return new LandRoverCarSytner(driver);
	}

	public AudiCarSytner clickAudiIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Audi", "Audi");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Audi", "Audi");
		return new AudiCarSytner(driver);
	}

	public BentleyCarSytner clickBentleyIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Bentley", "Bentley");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Bentley", "Bentley");
		return new BentleyCarSytner(driver);
	}

	public FerrariCarSytner clickFerrariIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "Ferrari", "Ferrari");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "Ferrari", "Ferrari");
		return new FerrariCarSytner(driver);
	}

	public BMWCarSytner clickBMWIcon(WebDriver driver) {
		waitForControlVisible(driver, HomeSytnerUI.CAR_POINT_ICON, "BMW", "BMW");
		executeJavascriptToElement(driver, HomeSytnerUI.CAR_POINT_ICON, "BMW", "BMW");
		return new BMWCarSytner(driver);
	}

}

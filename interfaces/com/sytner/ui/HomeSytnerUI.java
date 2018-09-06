package com.sytner.ui;

public class HomeSytnerUI {
	public static final String CARSEARCH_LBL = "//label[@for='section-11042']//span[contains(.,'Cars')]";
	public static final String MAKE_LBL = "//*[@class='filter-heading']//span[text()='Makes']";
	public static final String MODEL_LBL = "//*[@class='value']//span[text()='Model']";
	public static final String NOMIN_PRICE_LBL = "//*[@class='value']//*[contains(text(),'No min price')]";
	public static final String NOMAX_PRICE_LBL = "//*[@class='value']//*[contains(text(),'No max price')]";
	public static final String ANY_DISTANCE_LBL = "//*[@class='value']//span[text()='Any distance']";
	public static final String ENTER_POSTCODE_TXT = "//input[@id='filter-input-postcode']";
	public static final String POSTCODE_LBL = "//*[@class='label']//span[contains(.,'Postcode/Distance')]";
	public static final String PRICE_RANGE_LBL = "//span[contains(.,'Price Range')]";
	public static final String PRICE_RANGE_RADIO = "//span[contains(.,'Price Range')]/preceding-sibling::i";
	public static final String NOMAKE_LBL = "//div[@class='no-make']";
	public static final String ALL_LBL = "//*[@class='select-all']//span[contains(text(),'All')]";
	public static final String CARSEARCH_BTN = "//*[@title='Search']";
	public static final String QUANTITY_VEHICLE_LBL = "//*[contains(@class,'option make-')]//span[@class='count']";
	public static final String VALUE_VEHICLE_DROPDOWN = "//*[contains(@class,'option make-')]//span[@class='label']";
	public static final String VALUE_VEHICLE_CKCBOX = "//*[@for='make-abarth']//i[@class='icon']";
	public static final String CANCEL_BTN = "//*[@data-name='make']//span[contains(.,'Cancel')]";
	public static final String CANCEL_MODEL_BTN = "//*[@data-name='model']//span[contains(.,'Cancel')]";
	public static final String OK_BTN = "//*[@data-name='make']//span[contains(.,'OK')]";
	public static final String OK_MODEL_BTN = "//*[@data-name='model']//span[contains(.,'OK')]";
	public static final String MAKES_CBX = "//*[@id='search']//*[@class='filter filter-make']";
	public static final String MODEL_CBX = "//*[@id='search']//*[@class='filter filter-model']";
	public static final String PAGINATION_ICON = "//*[@class='cycle-pager-container']/ul";
	public static final String CAR_POINT_ICON = "//*[contains(@title,'%s')]//*[contains(text(),'%s')]";
	public static final String WOLKSWAGEN_POINT_ICON = "//*[@title='Volkswagen']//*[contains(text(),'Volkswagen')]";
	public static final String GRAYPAUL_LINK = "//*[@href='http://www.graypaulclassiccars.com/']";
}

package com.ecommerce.ui;

public class HomeMobileUI {
	public static final String COST_SONYXPERIA_LBL = "//*[@id='product-price-1']//*[contains(text(),'%s')]";
	public static final String SONYXPERIA_IMAGE = "//img[@id='product-collection-image-1']";
	public static final String IPHONE_ADDTOCART_BTN = "//h2[a[contains(text(),'IPhone')]]/following-sibling::div//button[contains(.,'Add to Cart')]";
	public static final String SONY_ADDTOCART_BTN = "//h2[a[contains(text(),'Sony Xperia')]]/following-sibling::div//button[contains(.,'Add to Cart')]";
	public static final String ADDTOCOMPARE_SONY_LBL = "//*[contains(@href,'product/1/uenc')]";
	public static final String ADDTOCOMPARE_IPHONE_LBL = "//*[contains(@href,'product/2/uenc')]";
	public static final String COMPARE_BTN = "//button[contains(@title,'Compare')]";
	public static final String COMPAREPRODUCT_LBL = "//h1[contains(text(),'Compare Products')]";
}

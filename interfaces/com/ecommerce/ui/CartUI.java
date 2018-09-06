package com.ecommerce.ui;

public class CartUI {
	public static final String CODECOUPON_TXT = "//*[@id='coupon_code']";
	public static final String APPLY_LBL = "//button[@value='Apply']";
	public static final String DISCOUNT_LBL = "//span[contains(.,'%s')]";
	public static final String QTY_TXT = "//input[contains(@title,'Qty')]";
	public static final String UPDATE_BTN = "//button[@title='Update']";
	public static final String MAXQUANTITY_ERR = "//*[@id='shopping-cart-table']//p[@class='item-msg error']";
	public static final String EMPTYCART_BTN = "//button[@id='empty_cart_button']";
	public static final String EMPTY_LBL = "//*[contains(text(),'Shopping Cart is Empty')]";
}

package com.ecommerce.ui;

public class TVHomeUI {
	public static final String REGISTERSUCCESS_LBL = "//span[contains(.,'Thank you for registering with Main Website Store.')]";
	public static final String TVMENU_LBL = "//a[contains(.,'TV')]";
	public static final String LGLCD_ADDTOWISHLIST_LBL = "//*[contains(@href,'product/4/form')]";
	public static final String SHAREWISHLIST_BTN = "//button[@name='save_and_share']";
	public static final String EMAIL_TXTAREA = "//textarea[@id='email_address']";
	public static final String MESSAGE_TXTAREA = "//textarea[@id='message']";
	public static final String SHARESUCCESS_LBL = "//span[contains(.,'Your Wishlist has been shared.')]";
	public static final String SHAREWITHLIST_INFOR_BTN = "//button[contains(.,'Share Wishlist')]";
	public static final String ACCOUNT_LBL = "//*[@class='skip-links']//span[text()='Account']";
	public static final String LOGOUT_LBL = "//a[@title='Log Out']";
	public static final String MYWISHLISTMENU_LBL = "//*[@class='block-content']//*[contains(text(),'My Wishlist')]";
	public static final String ADDTOCART_MYWISHLIST_BTN = "//button[@title='Add to Cart']";
	public static final String COUNTRY_DROPDOWN = "//select[@name='country_id']";
	public static final String STATE_DROPDOWN = "//select[@id='region_id']";
	public static final String ZIP_TXT = "//input[@id='postcode']";
	public static final String ESTIMATE_LBL = "//button[@title='Estimate']";
	public static final String FLATRATE_LBL = "//span[contains(.,'%s')]";
	public static final String FLATRATE_RADIO = "//input[@id='s_method_flatrate_flatrate']";
	public static final String UPDATETOTAL_BTN = "//button[@title='Update Total']";
	public static final String SHIPANDHANDLE_LBL = "//td[contains(.,'Shipping & Handling (Flat Rate - Fixed)')]/following-sibling::td/span[@class='price']";
	public static final String PROCEEDCHECKOUT_BTN = "//*[@class='cart-totals']//button[@title='Proceed to Checkout']";
	public static final String ADDRESS_TXT = "//input[@id='billing:street1']";
	public static final String CITY_TXT = "//input[@id='billing:city']";
	public static final String STATEBILLING_DROPDOWN = "//select[@id='billing:region_id']";
	public static final String ZIPBILLING_TXT = "//input[@id='billing:postcode']";
	public static final String COUNTRYBILLING_DROPDOWN = "//select[@id='billing:country_id']";
	public static final String TELEPHONEBILLING_TXT = "//input[@id='billing:telephone']";
	public static final String CONTINUE_BTN = "//button[@onclick='billing.save()']";
	public static final String CONTINUEFLATRATE_BTN = "//button[@onclick='shippingMethod.save()']";
	public static final String MONEYORDER_RADIO = "//input[@id='p_method_checkmo']";
	public static final String PAYMENTSAVE_BTN = "//button[@onclick='payment.save()']";
	public static final String PLACEORDER_BTN = "//button[@onclick='review.save();']";
	public static final String ORDERSUCCESS_LBL = "//h1[contains(.,'Your order has been received.')]";

}

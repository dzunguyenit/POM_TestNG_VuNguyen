package com.bankguru.ui;

public class CustomerPageUI {
	public static final String CUSTOMERNAME_TXT = "//input[@name='name']";
	public static final String DATEOFBIRTH_TXT = "//input[@id='dob']";
	public static final String ADDRESS_TXTAREA = "//textarea[contains(@name,'addr')]";
	public static final String CITY_TXT = "//input[@name='city']";
	public static final String STATE_TXT = "//input[@name='state']";
	public static final String PIN_TXT = "//input[@name='pinno']";
	public static final String MOBILENUMBER_TXT = "//input[@name='telephoneno']";
	public static final String EMAIL_TXT = "//input[@name='emailid']";
	public static final String PASSWORD_TXT = "//input[@name='password']";
	public static final String SUBMIT_BTN = "//input[@name='sub']";
	public static final String REGISTERSUCCESS_LBL = "//p[contains(text(),'Customer Registered Successfully!!!')]";
	public static final String CUSTOMERID_LBL = "//td[text()='Customer ID']/following-sibling::td";
	public static final String CUSTOMERID_TXT = "//input[@name='cusid']";
	public static final String SUBMITOEDIT_BTN = "//input[@name='AccSubmit']";
	public static final String UPDATESUCCESS_LBL = "//p[contains(text(),'Customer details updated Successfully!!!')]";
	public static final String CUSTOMERNAME_ERRORMSG = "//*[@id='message']";
	public static final String ADDRESS_ERRORMSG = "//*[@id='message3']";
	public static final String CITY_ERRORMSG = "//*[@id='message4']";
	public static final String STATE_ERRORMSG = "//*[@id='message5']";
	public static final String PIN_ERRORMSG = "//*[@id='message6']";
	public static final String TELEPHONE_ERRORMSG = "//*[@id='message7']";
	public static final String EMAIL_ERRORMSG = "//*[@id='message9']";
	public static final String CUSTOMERID_ERRORMSG = "//*[@id='message14']";
}

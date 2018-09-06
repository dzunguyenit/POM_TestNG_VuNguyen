package com.bankguru.ui;

public class WithdrawPageUI {
	public static final String ACCOUNTNO_TXT = "//input[@name='accountno']";
	public static final String AMOUNT_TXT = "//input[@name='ammount']";
	public static final String DESCRIPTION_TXT = "//input[@name='desc']";
	public static final String TRANSACTIONSUCCESS_LBL = "//p[contains(text(),'Transaction details of Withdrawal for Account')]";
	public static final String SUBMIT_BTN = "//input[@name='AccSubmit']";
	public static final String CURRENTDEPOSIT_LBL = "//*[contains(text(),'Current Balance')]/following-sibling::td";
}

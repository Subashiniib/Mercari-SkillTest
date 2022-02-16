package pages;

import org.openqa.selenium.WebDriver;

import Common.Constants;

public class addAddressPage extends CommonPageAction {
	private static WebDriver driver;
	private static final String myPage = "//i[contains(text(),'My Page'])";
	private static final String deliveryAddress = "//a[contains(text(),'Delivery Address'])";
	private static final String deliveryAddress_Label = "//h1[contains(text(),'Delivery Address List'])";
	private static final String addNewAddress = "//a[contains(text(),'Add New'])";
	private static final String FieldName = "//input[@id='%s']";
	private static final String FieldName_Select = "//Select[@id='%s']";
	private static final String addAddress = "//a[@text()='Add Address']";
	private static final String addressPane = "//div[@class='addressList_wrap']";
	private static final String NewaddressPane = "(//div[@class='addressList_wrap'])[Index]";

	public addAddressPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickMyPageButton() {
		getElement(myPage).click();
	}

	public void clickEditUserInformation() {
		getElement(deliveryAddress).click();
	}

	public void checkEditUserInformationPageDisplayed() {
		isFieldDisplayed(deliveryAddress_Label, "Delivery Address label");
	}

	public void clickAddNewAddressButton() {
		clickWebElement(addNewAddress);
	}

	public void selectCountries(String argOption, String argFieldName) {
		selectListboxValue(String.format(FieldName_Select, Constants.COUNTRYID), argOption, argFieldName);
	}

	public void enterZipCode(String argZipCode) {
		enterTextInWebElement(String.format(FieldName, Constants.MEMBER_ZIPCODE), argZipCode);
	}

	public void enterState(String argState) {
		enterTextInWebElement(String.format(FieldName, Constants.STATEPROVINCEREGIONTEXT), argState);
	}

	public void enterAddress1(String argAddress1) {
		enterTextInWebElement(String.format(FieldName, Constants.MEMBER_ADDRESS1), argAddress1);
	}

	public void enterAddress2(String argAddress2) {
		enterTextInWebElement(String.format(FieldName, Constants.MEMBER_ADDRESS2), argAddress2);
	}

	public void enterAddress3(String argAddress3) {
		enterTextInWebElement(String.format(FieldName, Constants.MEMBER_ADDRESS3), argAddress3);
	}

	public void enterCity(String argCity) {
		enterTextInWebElement(String.format(FieldName, Constants.MEMBER_CITY), argCity);
	}

	public void enterDeliveryName(String argMyDeliveryName) {
		enterTextInWebElement(String.format(FieldName, Constants.MYDELIVERYNAME), argMyDeliveryName);
	}

	public void enterTelephoneNumber(String argTelePhoneNumber) {
		enterTextInWebElement(String.format(FieldName, Constants.MYDELIVERY_TEL), argTelePhoneNumber);
	}

	public void clickmainShoppingAddress(String argOption) {
		if (argOption.equals("Yes")) {
			clickWebElement(String.format(FieldName, Constants.MYDELIVERY_MAIN));
		}
	}

	public void enterAddressBookName(String argAddressBookName) {
		enterTextInWebElement(String.format(FieldName, Constants.MYDELIVERY_DELIVERYTITLE), argAddressBookName);
	}

	public void clickAddAddressButton() {
		clickWebElement(addAddress);
	}

	public int getAddressCount() {
		return getElementSize(addressPane);
	}

	public String getAddedAddressText() {
		int maxSize = getElementSize(addressPane);
		return getTextOfWebElement(NewaddressPane.replace("Index", Integer.toString(maxSize)));
	}

}

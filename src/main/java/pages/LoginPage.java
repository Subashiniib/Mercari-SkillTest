package pages;

import org.openqa.selenium.WebDriver;

import data.ConfigProvider;

public class LoginPage extends CommonPageAction {
	private static WebDriver driver;
	private static final String tab = "//a[contains(text(),'%s')]";
	private static final String URL = ConfigProvider.getValueOf("URL");
	private static final String userName = "//input[@name='email']";
	private static final String password = "//input[@name='password']";
	private static final String logOut = "//i[@text='Logout']";

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void Load() {
		LoadPage(URL);
	}

	public void clickLoginButton(String argButtonName) {
		getElement(String.format(tab, argButtonName)).click();
	}

	public void enterUserName(String argUserName) {
		enterTextInWebElement(userName, argUserName);
	}

	public void enterPassword(String argPassword) {
		enterTextInWebElement(password, argPassword);
	}

	public void isApplicationlaunched(String argFieldName) {
		isFieldDisplayed(String.format(tab, argFieldName), "Login Button");
	}

	public void isLoginSccessfull() {
		isFieldDisplayed(logOut, "LogOut Button");
	}

}

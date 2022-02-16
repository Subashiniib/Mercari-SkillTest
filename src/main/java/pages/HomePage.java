package pages;

import org.openqa.selenium.WebDriver;

import data.ConfigProvider;

public class HomePage extends CommonPageAction {
	private static WebDriver driver;
	private static final String searchBar = "//input[@id='search']";
	private static final String tab = "//a[contains(@title,'%s')]";
	private static final String pane = "//yt-formatted-string[contains(text(),'%s')]/ancestor::a";
	private static final String URL = ConfigProvider.getValueOf("URL");

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void Load() {
		LoadPage(URL);
	}

	public void searchForVideo(String textToSearch) {
		enterTextInWebElement(searchBar, textToSearch);
	}

	public void gotoTab(String TabName) {
		getElement(String.format(tab, TabName)).click();
	}

	public void gotoPane(String PaneName) {
		getElement(String.format(pane, PaneName)).click();
	}

}

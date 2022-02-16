package pages;

import org.openqa.selenium.WebDriver;

public class ProductDetails extends CommonPageAction {
	private static WebDriver driver;
	private static final String searchBar = "//input[@placeholder='What are you looking for?']";
	private static final String searchButton = "//button[@class='search-btn']";
	private static final String searchHeader = "//h1[@class='searchHeader__heading']";
	private static final String product = "(//div[@class='itemCard__itemInfo'])[%s]//div[@class='itemCard__itemName']";
	private static final String product_Description = "//Section[@id='itemHeader']/h1";

	public ProductDetails(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void searchProduct(String argProduct) {
		enterTextInWebElement(searchBar, argProduct);
	}

	public void clickSearchButton(String argButtonName) {
		getElement(String.format(searchButton, argButtonName)).click();
	}

	public void isSearchResultDisplayed() {
		isFieldDisplayed(searchHeader, "Search Result");
	}

	public void clickProduct(int productnumber) {
		getElement(String.format(product, Integer.toString(productnumber))).click();
	}

	public String getProductHeader() {
		return getTextOfWebElement(product_Description);
	}

}

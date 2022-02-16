package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailsSteps extends AbstractSteps {

	
	@When("user searches for {string} in the search bar")
	public void verify_Mercari_HomePage_Is_Displayed(String SearchText) {
		getPages.getProductDetailsPage().searchProduct(SearchText);
		getPages.getProductDetailsPage().clickSearchButton("Search Button");
		getPages.getLoginPage().Load();
	}
	@And("Verify that search result is displayed")
	public void verify_that_search_result_is_displayed() {
		getPages.getProductDetailsPage().isSearchResultDisplayed();
		
	}
	@Then("click on the {integer} rd search result product")
	public void click_on_the_3_rd_search_result_product(int productno) {
		getPages.getProductDetailsPage().clickProduct(productno);
	}
	
	@Then("verify search result belongs to {string}")
	public void verify_search_result_belongs_to(String expectedProduct) {
		String actualProduct=getPages.getProductDetailsPage().getProductHeader();
		if(actualProduct.contains(expectedProduct)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
		//this can be validated using assertion 
	}
	
	

}

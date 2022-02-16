package steps;

import Common.Constants;
import data.ConfigProvider;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends AbstractSteps {

	
	@Then("Verify Mercari Home page is displayed")
	public void verifyMercariHomePageIsDisplayed() {
		getPages.getLoginPage().isApplicationlaunched(Constants.LOGIN);
	}
	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		getPages.getLoginPage().clickLoginButton(Constants.LOGIN);
		getPages.getMercariHomePage().Load();
		
	}
	
	@When("Login with valid UserName and Password using login with email option")
	public void loginwithvalidUserNameandPasswordusingloginwithemailoption() {
		getPages.getLoginPage().enterUserName(ConfigProvider.getValueOf("UserName"));
		getPages.getLoginPage().enterPassword(ConfigProvider.getValueOf("Password"));
		getPages.getLoginPage().clickLoginButton(Constants.LOGIN);
		getPages.getLoginPage().isLoginSccessfull();
	}
	

}

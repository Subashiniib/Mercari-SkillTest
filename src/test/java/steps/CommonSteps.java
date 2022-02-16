package steps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends AbstractSteps {

    @Given("user is on mercari home page")
    public void userIsOnMercariHomePage()
    {
        initDriver();
        getPages.getMercariHomePage().Load();
    }



    @When("user navigates to {string} tab and clicks {string} pane")
    public void user_navigates_to_tab_and_clicks_pane(String tab,String pane) {
        // Write code here that turns the phrase above into concrete actions
        getPages.getMercariHomePage().gotoTab(tab);
        getPages.getMercariHomePage().gotoPane(pane);
    }
    
}

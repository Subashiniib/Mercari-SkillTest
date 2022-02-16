package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addAddressSteps extends AbstractSteps {
public int TotalAddressCountBefore;
public int TotalAddressCountAfrer;
    @Then("user navigates to {string} tab and clicks {string} pane")
    public void userNavigatesToTabandClicksPane(String MainMenu, String subMenu)
    {
    	getPages.getAddAddressPage().clickMyPageButton();
    	getPages.getAddAddressPage().clickEditUserInformation();
    	getPages.getAddAddressPage().checkEditUserInformationPageDisplayed();
    }
    
    @When("add adress with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void addadress(String Country, String ZipCode, String State, String Address1, String Address2, String Address3, String City, String RecipientName, String TelephoneNum, String MainShippingAddress, String AddressBookName) {
    	TotalAddressCountBefore=getPages.getAddAddressPage().getAddressCount();
    	getPages.getAddAddressPage().clickAddNewAddressButton();
    	getPages.getAddAddressPage().selectCountries(Country, "Country");
    	getPages.getAddAddressPage().enterZipCode(ZipCode);
    	getPages.getAddAddressPage().enterState(State);
    	getPages.getAddAddressPage().enterAddress1(Address1);;
    	getPages.getAddAddressPage().enterAddress2(Address2);
    	getPages.getAddAddressPage().enterAddress3(Address3);
    	getPages.getAddAddressPage().enterCity(City);
    	getPages.getAddAddressPage().enterDeliveryName(RecipientName);
    	getPages.getAddAddressPage().enterTelephoneNumber(TelephoneNum);
    	getPages.getAddAddressPage().clickmainShoppingAddress(MainShippingAddress);
    	getPages.getAddAddressPage().enterAddressBookName(AddressBookName);
    	getPages.getAddAddressPage().clickAddAddressButton();
    	TotalAddressCountAfrer=getPages.getAddAddressPage().getAddressCount();
    	if(TotalAddressCountAfrer>TotalAddressCountBefore) {
    		System.out.println("Address added sccessfully - PASSED");
    	}else {
    		System.out.println("Address not added sccessfully - FAILED");
    	}
    		
    }
    
    @And("verify that the entered {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} deatails are displayed")
    public void verifythattheentered(String Country, String ZipCode, String State, String Address1, String Address2, String Address3, String City, String RecipientName, String TelephoneNum, String MainShippingAddress, String AddressBookName) {
    	String newAddress=getPages.getAddAddressPage().getAddedAddressText();
    	compareValues(newAddress,Country);
    	compareValues(newAddress,ZipCode);
    	compareValues(newAddress,State);
    	compareValues(newAddress,Address1);
    	compareValues(newAddress,Address2);
    	compareValues(newAddress,Address3);
    	compareValues(newAddress,City);
    	compareValues(newAddress,RecipientName);
    	compareValues(newAddress,TelephoneNum);
    	compareValues(newAddress,AddressBookName);
    	//this can be validated using assertion 
    }

   public void compareValues(String ActualValue, String ExpectedValue) {
	   if(ActualValue.contains(ExpectedValue)) {
		   System.out.println("PASSED");
	   }else {
		   System.out.println("FAILED");
	   }
   }
}

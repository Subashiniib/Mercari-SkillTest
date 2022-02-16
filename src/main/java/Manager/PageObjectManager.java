package Manager;

import org.openqa.selenium.WebDriver;
import pages.addAddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetails;

public class PageObjectManager {

  private static HomePage _mercariHomePage;
  private static addAddressPage _addAddressPage;
  private static LoginPage _loginPage;
  private static ProductDetails _productDetails;
  private static WebDriver driver;
  

  public PageObjectManager(WebDriver driver)
  {
    this.driver=driver;
  }

  public HomePage getMercariHomePage()
  {
      return _mercariHomePage==null? _mercariHomePage= new HomePage(driver):_mercariHomePage;
  }

  public addAddressPage getAddAddressPage()
  {
      return _addAddressPage==null? _addAddressPage=new addAddressPage(driver):_addAddressPage;
  }
  
  public LoginPage getLoginPage()
  {
      return _loginPage==null? _loginPage=new LoginPage(driver):_loginPage;
  }
  
  public ProductDetails getProductDetailsPage()
  {
      return _productDetails==null? _productDetails=new ProductDetails(driver):_productDetails;
  }


}

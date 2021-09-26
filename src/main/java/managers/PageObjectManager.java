package managers;
  
import org.openqa.selenium.WebDriver;
import pageobjects.CheckOutPage;
import pageobjects.GooglePage;
//import pageobjects.LoginPage;
import pageobjects.ProductsPage;



public class PageObjectManager<homePage> {
 
	private WebDriver driver;
 	private ProductsPage productsPage;
 
	
 	private GooglePage homePage;
 	private CheckOutPage checkoutPage;
	//private LoginPage loginPage;
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
 
	
	  public GooglePage getHomePage(){
      return (homePage == null) ? homePage = new GooglePage(driver) : homePage;
      }
	 
 
	
 
	public ProductsPage getProductListingPage() {
 
		return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;
 
	}
 
	
 
	/*
	 * public AddToCartPage getAddToCartPage() {
	 * 
	 * return (addToCartPage == null) ? addToCartPage = new AddToCartPage(driver) :
	 * addToCartPage;
	 * 
	 * }
	 */
 
	
 
	public CheckOutPage getCheckoutPage() {
 
		return (checkoutPage == null) ? checkoutPage = new CheckOutPage(driver) : checkoutPage;
 
	}
	
	/*
	 * public LoginPage getLoginPage() {
	 * 
	 * return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	 * 
	 * }
	 */
 
	
}
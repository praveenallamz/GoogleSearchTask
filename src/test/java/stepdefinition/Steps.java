package stepdefinition;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.CheckOutPage;
import pageobjects.GooglePage;
import pageobjects.ProductsPage;


public class Steps {
	
	static WebDriver driver;
	TestContext testContext;
    GooglePage homePage;
	ProductsPage GoogleResultsPage;
	CheckOutPage checkOutPage;
	//LoginPage loginPage;

	public Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		GoogleResultsPage = testContext.getPageObjectManager().getProductListingPage();
		checkOutPage = testContext.getPageObjectManager().getCheckoutPage();
		//loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^user is on Home Page$")
	public void userIsOnHomePage(){
		homePage.navigateTo_HomePage();
	}
 
	@When("^he search for \"(.*)\"$")
	public void heSearchFor(String SearchText)  {
		homePage.enterTEXT(SearchText);
		}
	
	@When("^choose the first item from list$")
	public void choose_the_first_item_from_list() throws Throwable {
		GoogleResultsPage.clickOnFirstLink();	
	}
 
	@When("^Verify the logo is displayed$")
	public void verify_the_logo_is_displayed() throws Throwable {
		//checkOutPage.clickSoppingCart();
		checkOutPage.LogoDisplayed();
		homePage.closeBrowser();
	}
 
}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class GooglePage {
	WebDriver driver;
	String baseUrl;
	
	//@FindBy(id="twotabsearchtextbox")
	//private WebElement searchBox;
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@class='nav-input']")
	private WebElement searchButton;
	
	 
	 
	  public GooglePage(WebDriver driver)
	      {
		  this.driver = driver;
	      PageFactory.initElements(driver, this);
	    }
	 
	 
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(chromeOptions);
		 * driver.get(FileReaderManager.getInstance().getConfigReader().
		 * getApplicationUrl());
		 */
	}
	public void enterTEXT(String SearchText){
		searchBox.sendKeys(SearchText);
		//searchBox.sendKeys(Keys.RETURN);
		searchBox.submit();
	}
	
	/*
	 * public void clickOnSearchButton(){ searchButton.click(); }
	 */

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
	

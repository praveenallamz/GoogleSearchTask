package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

	WebDriver driver;

	//@FindBy(xpath = "//h2[@data-attribute='Head First Java, 2nd Edition']")
	//private WebElement headFirstJava;
	
	@FindBy(xpath="//*[@id='rso']//h3/a")
	private WebElement headFirstJava;


	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@SuppressWarnings("unused")
	public void clickOnFirstLink() {
		//By kk = headFirstJava;
		// wait until the google page shows the result
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				//.until(ExpectedConditions.presenceOfElementLocated(kk));
				.until(ExpectedConditions.presenceOfElementLocated(By.id("result-stats")));
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
		System.out.println(findElements.size());

		for (int i = 0; i < findElements.size(); i++) {
			findElements = driver.findElements(By.xpath("//*[@id='rso']//h3"));
			findElements.get(0).click();
			break;
		}
	}

}

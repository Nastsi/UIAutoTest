package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	
	WebDriver driver;
	
	WebElement elementCalculator;
	
	@FindBy (xpath = "//table[@class='ElumCf']//tr[3]//div[@class='XRsWPe MEdqYd']")
	WebElement multiplyButton;
	
	@FindBy (xpath = "//div[@class='XRsWPe UUhRt']")
	WebElement equalSignButton;
	
	@FindBy (xpath = "//span[@class='vUGUtc']")
	WebElement expression;
	
	@FindBy (xpath = "//span[@id='cwos']")
	WebElement result;
	
	public CalculatorPage(WebDriver driver)
    {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	
	public WebElement getMultiplyButton() {
		return multiplyButton;
	}
	
	public WebElement getEqualSignButton() {
		return equalSignButton;
	}
	
	public WebElement getExpression() {
		return expression;
	}
	
	public WebElement getResult() {
		return result;
	}

	public void setNumberOrAddOrSubtract(String number) {
		elementCalculator = driver.findElement(By.xpath("//div[.='" + number + "']"));
		elementCalculator.click();
	}
}

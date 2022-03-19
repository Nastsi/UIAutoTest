package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//input[@name='q']")
	WebElement fieldSearch;
	
	@FindBy (xpath = "//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")
	WebElement buttonSearch;

    public HomePage(WebDriver driver)
    {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getButtonSearch() {
    	return buttonSearch;
    }

    public void setFieldSearch(String text) {
    	fieldSearch.sendKeys(text);
    }
}

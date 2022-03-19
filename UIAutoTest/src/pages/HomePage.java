package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;

    public HomePage(WebDriver driver)
    {
    	this.driver = driver;
    	
    	driver.get("https://www.google.com/");
    }

}

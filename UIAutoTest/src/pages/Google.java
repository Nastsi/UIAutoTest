package pages;

import org.openqa.selenium.WebDriver;

public class Google {
	
	WebDriver webDriver;

    public Google(WebDriver driver)
    {
        webDriver = driver;
    }

    public HomePage homePage() {return new HomePage((webDriver));}
    public CalculatorPage calculatorPage() {return new CalculatorPage((webDriver));}
}

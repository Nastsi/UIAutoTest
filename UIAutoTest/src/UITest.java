import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Google;

class UITest {
	
	WebDriver driver;
	WebDriverWait wait;
	Google site;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiapischikova/Documents/GitHub/UIAutoTest/UIAutoTest/bin/chromedriver");
		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterEach
	void tearDown() throws Exception {
		if (driver != null)
			driver.quit();
	}

	@Test
	void test() {
		site = new Google(driver);

    	driver.get("https://www.google.com/");
		
		site.homePage().setFieldSearch("Калькулятор");
		wait.until(ExpectedConditions.visibilityOf(site.homePage().getButtonSearch()));
		site.homePage().getButtonSearch().click();
		
		site.calculatorPage().setNumberOrAddOrSubtract("1");
		site.calculatorPage().getMultiplyButton().click();
		site.calculatorPage().setNumberOrAddOrSubtract("2");
		site.calculatorPage().setNumberOrAddOrSubtract("−");
		site.calculatorPage().setNumberOrAddOrSubtract("3");
		site.calculatorPage().setNumberOrAddOrSubtract("+");
		site.calculatorPage().setNumberOrAddOrSubtract("1");
		site.calculatorPage().getEqualSignButton().click();
		
		Assert.assertEquals(site.calculatorPage().getExpression().getText(),"1 × 2 - 3 + 1 =");
		Assert.assertEquals(site.calculatorPage().getResult().getText(),"0");
		
	}

}

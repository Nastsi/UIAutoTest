import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

class UITest {
	
	WebDriver driver;
	HomePage site;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/anastasiapischikova/Documents/GitHub/UIAutoTest/UIAutoTest/bin/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		site = new HomePage(driver);
	}

}

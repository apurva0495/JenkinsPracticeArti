package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomTest {

	public WebDriver driver;
	@Test
	@Parameters("browser")
	public void chromeB(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	
}

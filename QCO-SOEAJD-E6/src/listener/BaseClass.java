package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(TestngImplementation.class)
public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void launch() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}

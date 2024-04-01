package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnCrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launch(String bname) {
		if(bname.contains("firefox")) {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
		else if(bname.contains("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.quit();
		}
}
}
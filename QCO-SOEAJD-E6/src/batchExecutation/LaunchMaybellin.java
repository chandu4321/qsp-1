package batchExecutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchMaybellin {

	@Test(groups = "beauty")
	public void maybelline() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in/");
		driver.quit();
	}
}

package batchExecutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchSwiggy {

	@Test
	public void swiggy() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/city/bangalore");
		driver.quit();
	}
}

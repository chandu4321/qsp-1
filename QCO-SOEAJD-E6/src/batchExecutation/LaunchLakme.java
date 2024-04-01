package batchExecutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchLakme {

	@Test(groups = "beauty")
	public void lakme() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		driver.quit();
	}
}

package batchExecutation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchSugar {

	@Test(groups = "beauty")
	public void sugar() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/");
		driver.quit();
	}
}

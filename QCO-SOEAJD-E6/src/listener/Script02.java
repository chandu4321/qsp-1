package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script02 extends BaseClass{

	@Test
	public void demo() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.linkText("ComputingInternet")).click();
		Thread.sleep(3000);
		
	}
}

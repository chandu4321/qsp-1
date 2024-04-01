package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script02 extends BaseClass{
	
	@Test
	public void text() throws InterruptedException {
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText());
		Thread.sleep(2000);

	}
}

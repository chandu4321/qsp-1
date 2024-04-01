package listener;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 extends BaseClass{

	@Test
	public void demo() throws InterruptedException {
		driver.findElement(By.linkText("Rer")).click();
		Thread.sleep(3000);
	}
}

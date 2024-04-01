package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script01 extends BaseClass{

	@Test
	public void bookPage() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(3000);
	}
}

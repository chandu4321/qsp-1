package annatation;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script extends LearnConfigurationAnnotations{

	@Test
	public void code() {
		driver.findElement(By.partialLinkText("Books")).click();
		
	}
}


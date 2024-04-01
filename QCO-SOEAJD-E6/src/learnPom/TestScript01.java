package learnPom;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass{

	@Test
	public void demo() throws InterruptedException {
//		HomePagePom hp= new HomePagePom(driver);
//		hp.getRegisterLink().click();
//		Thread.sleep(3000);
		
	//	driver.findElement(By.linkText("Registerlink")).click();
		
		HomePagePom hp= new HomePagePom(driver);
		hp.getNewsLetterEmailBox().sendKeys("books");
	}
}

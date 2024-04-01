package learnPom;

import org.testng.annotations.Test;

public class TestScript03 extends BaseClass{
	
	@Test
	public void text() throws InterruptedException{
		HomePagePom hp= new HomePagePom(driver);
		System.out.println(hp.getWelcomeText().getText());
		Thread.sleep(2000);
	}
}

package learnPom;

import org.testng.annotations.Test;

public class TestScript02 extends BaseClass{
	
	@Test
	public void registerPage() throws InterruptedException {
		HomePagePom hp=new HomePagePom(driver);
		RegisterPom rp= new RegisterPom(driver);
		hp.getRegisterLink().click();
		rp.getFemaleRadioButton().click();
		rp.getFirstNameBox().sendKeys("Geetha");
		rp.getLastNameBox().sendKeys("cn");
		rp.getEmailBox().sendKeys("geetha@gmail.com");
		Thread.sleep(4000);
		
	}
}

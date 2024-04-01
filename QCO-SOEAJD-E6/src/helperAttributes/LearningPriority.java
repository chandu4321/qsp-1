package helperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningPriority {

	@Test(priority = -1)
	public void login() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test(priority = 1)
	public void logout() {
		Reporter.log("user has logout the appln",true);
	}
	
	@Test(priority = 0)
	public void addToCart() {
		Reporter.log("user has added a product to cart",true);
	}
}


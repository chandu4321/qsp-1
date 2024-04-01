package helperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test
	public void register() {
		Reporter.log("user has register the appln",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void product() {
		Reporter.log("user selected a product",true);
	}
	

}

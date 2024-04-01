package annatation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LearnConfigurationAnnotations {
	public static WebDriver driver;
	
	@BeforeSuite
	public void connDB() {
		Reporter.log("DataBase is connected",true);
	}
	
	@AfterSuite
	public void closeDB() {
		Reporter.log("DataBase connections is closed",true);
	}
	
	@BeforeTest
	public void preCon() {
		Reporter.log("pre conn",true);
	}
	
	@AfterTest
	public void postCon() {
		Reporter.log("post conn",true);
	}
	
	@BeforeClass
	public void launch() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("enter email & paswword",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("user has logout the appl",true);
	}
}


package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("bangalore541@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("bangalore123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}

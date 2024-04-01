package assertMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	String fname="geetha";
	String lname="cn";
	String Email="geetha@gmail.com";
	String password="geetha123";
	String conpassword="geetha123";
	@Test
	public void demo() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		SoftAssert sa = new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getTitle(), "Demo Web Shop", "user is not nagivated to the appln");
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user is not nagivated to register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		sa.assertTrue(gender.isSelected(), "user not clicked on female radio button");
		WebElement name = driver.findElement(By.id("FirstName"));
		name.sendKeys(fname);
		sa.assertEquals(name.getAttribute("value"), "geetha","First name is not matching");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys(lname);
		sa.assertEquals(lastName.getAttribute("value"), "cn","Last name is not matching");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(Email);
		sa.assertEquals(email.getAttribute("value"), "geetha@gmail.com","email is not matching");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.sendKeys(password);
		sa.assertEquals(pswd.getAttribute("value"), "geetha123","password not matched");
		WebElement compwd = driver.findElement(By.id("ConfirmPassword"));
		compwd.sendKeys(conpassword);
		sa.assertEquals(compwd.getAttribute("value"), "geetha123","com password is not matching");
		driver.findElement(By.id("register-button")).click();
		sa.assertTrue(true, "user not clicked on register button");
		sa.assertAll();
	}
}

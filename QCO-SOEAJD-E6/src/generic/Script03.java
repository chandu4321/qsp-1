package generic;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script03 {

	@Test
	public void launch() throws IOException  {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		UtilityMethod um= new UtilityMethod();
		//to fetch the data from properties file
		//driver.get(um.getDataFromProperties("url"));
		
		
		//to fetch the data from excel file
		driver.get(um.getDataFromExcel("Sheet3", 3, 2));
	
	}
}

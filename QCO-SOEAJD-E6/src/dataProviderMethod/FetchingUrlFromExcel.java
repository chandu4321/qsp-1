package dataProviderMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingUrlFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File("./testDataFolder/excelData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		
		String url = wb.getSheet("Sheet3").getRow(3).getCell(2).getStringCellValue();
		
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
	}
}

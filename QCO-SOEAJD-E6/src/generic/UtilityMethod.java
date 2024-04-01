package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {

	public String getDataFromProperties(String key) throws IOException  {
		FileInputStream fis= new FileInputStream("./testData/TestData.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getDataFromExcel(String sheetName, int rowValue, int cellValue) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/ExcelData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getRow(rowValue).getCell(cellValue).toString();
	}
	
}

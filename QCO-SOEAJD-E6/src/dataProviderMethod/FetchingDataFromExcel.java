package dataProviderMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

	//1)create a file
	File file= new File("./testDataFolder/excelData.xlsx");
	
	//2)FileInputStream
	FileInputStream fis= new  FileInputStream(file);
	
	//3)workbook
	Workbook wb=WorkbookFactory.create(fis);
	
	String name = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name);
	double num = wb.getSheet("Sheet2").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(num);
	boolean input = wb.getSheet("Sheet2").getRow(4).getCell(0).getBooleanCellValue();
	System.out.println(input);
	}
}
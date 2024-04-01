package dataProviderMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderScript {
	@DataProvider(name= "testdata")
	public String[][] getData(){
		String[][] data= new String[2][4];
		data[0][0]="anagha";
		data[0][1]="bangalore";
		data[0][2]="9878765544";
		data[0][3]="A+";
		
		data[1][0]="swathi";
		data[1][1]="mysore";
		data[1][2]="9876554323";
		data[1][3]="Ab-";
		return data;			
	}
	
	@Test(dataProvider = "testdata")
	public void demo(String name, String place, String no, String bloodGroup) {
		System.out.println(name);
		System.out.println(place);
		System.out.println(no);
		System.out.println(bloodGroup);
	}
}

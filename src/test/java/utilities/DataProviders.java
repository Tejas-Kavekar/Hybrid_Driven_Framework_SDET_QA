package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	// DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws Exception {
		
		String path = ".\\testData\\Opencart_LoginData.xlsx"; // taking xl file from testData folder
		
		ExcelUtility xlutil=new ExcelUtility(path); // Creating an object for ExcelUtility
		
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][]=new String[totalrows][totalcols];  // Created two dimensional array which can store data
		
		for(int i=1; i<=totalrows; i++) {  // 1  //read the data from xl storing in two dimensional array
			 
			for(int j=0; j<totalcols; j++) {  //0   i is row & j is col
				
				loginData[i-1][j]= xlutil.getCellData("Sheet1", i, j);  // 1,0
				
			}
		}
		return loginData;  // returning two dimension array
		
		
		
	}
	
	// DataProvider 2
}

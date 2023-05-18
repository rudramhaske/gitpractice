package Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	
	DataFormatter formator=new DataFormatter();
	
@Test(dataProvider="driveTest")
public void driverDeta(String username, String Pass) 
{
	
	System.out.println(username+Pass);
	
}



@DataProvider(name="driveTest")
 public Object getDeta() throws IOException
 {
	  
	  String path= System.getProperty("user.dir")+"\\src\\test\\resources\\TestDeta.xlsx";
	  FileInputStream file =new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet sheet= wb.getSheetAt(0);
	  int TotalrowCount= sheet.getPhysicalNumberOfRows();
	  XSSFRow row= sheet.getRow(0);
	  int TotalCellCount = row.getLastCellNum();
	  
	  // create Object 
	  Objects[][] deta=new Objects[TotalrowCount-1][TotalCellCount];
	  
	  for(int i=0;i<TotalrowCount-1;i++) 
	  {
		   row= sheet.getRow(i+1);
		  for(int j=0;j<TotalCellCount;j++) 
		  {
		
			String value= row.getCell(j).getStringCellValue();
			 
		  }
	  }
	    
	Object value = null;
	return value;
 }
	
 
}

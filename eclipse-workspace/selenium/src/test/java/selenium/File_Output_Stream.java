package selenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.Test;

public class File_Output_Stream {
	
	@Test
	public void writeDataIntoExcellSheet() {
		
		try {
			
			FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\Excell_Data.xlsx");
			
			
			
		} 
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

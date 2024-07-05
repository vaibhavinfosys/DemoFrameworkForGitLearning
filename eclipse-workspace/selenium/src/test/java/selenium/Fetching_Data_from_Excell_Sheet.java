package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Fetching_Data_from_Excell_Sheet {
	
	
	@Test
	public void Fetching_Data_From_excell_Sheet() throws Throwable, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Excell_Data.xlsx");
		
	      Sheet sheet=WorkbookFactory.create(fis).getSheet("Sheet1");
	      
	      int[] twoDArray = new int[3];
	      
	      for(int i=0;i<3;i++) {
	    	  
	    	  for(int j=0;j<3;j++) {
	    		  
	    		  String username = sheet.getRow(twoDArray[j]).getCell(twoDArray[j]).getStringCellValue();
	    		  
	    		  System.out.println(username);
	    		  
	    	  }
	      }

	      
			/*
			 * String username = sheet.getRow(1).getCell(0).getStringCellValue();
			 * 
			 * System.out.println(username);
			 */
		                  
		
		       
		
		
		
	}

}

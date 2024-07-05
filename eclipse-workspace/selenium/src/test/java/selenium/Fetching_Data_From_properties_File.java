package selenium;

import java.io.FileInputStream;
import java.util.Properties;

public class Fetching_Data_From_properties_File {
	
	public static void main(String[] args) throws Throwable {
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\selenium\\data.properties");
		
		prop.load(fis);
		
		String name=prop.getProperty("Name");
		
	String mailId=prop.getProperty("EmailID");
	
	System.out.println(mailId);
		
		System.out.println(name);
		
		
		
		
		
		
		
		
	}

}

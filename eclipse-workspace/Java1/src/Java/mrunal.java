package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mrunal {
	
	public static void main(String[] args) {
		
		String [] array={"january","march","Octomber","Dec"};
		
		
	      
		
	List<String> al=new ArrayList<String>();
	
	for(String a:array) {
		
	        al.add(a);
	}
	
	System.out.println(al);
	
	
	 Collections.reverse(al);
	 
	 System.out.println(al);
		
		
	}

}

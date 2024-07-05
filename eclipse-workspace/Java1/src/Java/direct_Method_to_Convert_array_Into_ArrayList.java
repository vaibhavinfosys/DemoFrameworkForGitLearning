package Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class direct_Method_to_Convert_array_Into_ArrayList {
	

	public static void main(String[] args) {
		
		int [] array= {1,2,3,5,6};
		
	   ArrayList<Integer> al = IntStream.of(array).boxed().collect(Collectors.toCollection(ArrayList::new));
	   
	   System.out.println(al);
	   
	   
	  Collections.reverse(al);
	  
	  System.out.println(al);
	  
	  int [] newArray= {1,4,5,0,6,0,0};
	  
	  String arr = newArray.toString();
	  
	  System.out.println(arr);
	  
	  StringBuffer buffer=new StringBuffer(arr);
	  
	     String  rev = buffer.reverse().toString();
	     
	     System.out.println(rev);
	     
	     
	          
	   
	   
		
		
		
		
		
		
		
		
		
	}

}

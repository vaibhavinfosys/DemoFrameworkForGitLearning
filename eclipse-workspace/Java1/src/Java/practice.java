package Java;

import java.util.HashMap;
import java.util.Map;

public class practice {
	
public static void main(String[] args) {
	

	String s1="Vaibhav Mahadev Hulwan";
	
      System.out.println(s1.length());
	
	      String str = s1.replace(" ", "");
	      
	      String str2=str.toLowerCase();
	      
	      System.out.println(str.length());
	      
	      if(s1.length()==str.length()) {
	    	  
	    	  System.out.println("Test Case is Pass");
	      }
	      
	      else {
	    	  
	    	  System.out.println("Test case is fail");
	      }
	      
	      
	     char[] chrarray = str2.toCharArray();
	     
	     System.out.println(chrarray);
	     
	     Map<Character, Integer> map=new HashMap<Character, Integer>();
	     
	     System.out.println(map);
	     
	         for(char c:chrarray) {
	        	 
	        	 System.out.println(c);
	        	 
	        	 if(map.containsKey(c)) {
	        		 
	        		 map.put(c, map.get(c)+1);
	        		 
	        		 
	        	 }
	        	 
	        	 else {
	        		 
	        		 map.put(c, 1);
	        	 }
	        	 
	        	
	         }
	         
	         System.out.println(map);
	      
	      
	      

}
}
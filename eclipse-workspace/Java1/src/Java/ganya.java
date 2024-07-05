package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ganya {
	
	public static void main(String[] args) {
		
		

		 String name="Vaibhav Mahadev Hulwan";
	      
	      String newName=name.replace(" ","");
	      
	      System.out.println(newName);
	      
	      char [] charArray=newName.toCharArray();
	      
	      Map<Character,Integer> map=new HashMap<Character,Integer>();
	      
	      System.out.println(charArray.length);
	        
	        for(char c:charArray){
	            
	            if(map.containsKey(c)){
	                
	                map.put(c,map.get(c)+1);
	            }
	            
	            else{
	                
	                map.put(c,1);
	            }
	            
	        }
	        
	         System.out.println(map);
		
	
}
	
}

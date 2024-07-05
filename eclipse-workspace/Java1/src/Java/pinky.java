package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class pinky {
	
	public static void main(String[] args) throws Throwable {
		
		// To fnd the duplicate character in String
		
		String name="Java prorgaming learn from greek";
		
		//String newName=name.toLowerCase();
		
		String newName=name.replace(" ", "");
		
		char [] charArray=newName.toCharArray();
		
		 List<Character> list=new ArrayList<Character>();
		 
		 Set<Character> set=new HashSet<Character>();
		 
		 for(char c:charArray) {
			 
			 if(!set.add(c)) {
				 
				 list.add(c);
			 }
		 }
		 
		 System.out.println(set);
		
		 System.out.println(list);
		
		
		
		
	   
	}

}

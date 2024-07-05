package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testing {
	
	public static void main(String[] args) {
		
		Testing.reverseArray();
		
	}
	
	
	public static void reverseArray() {
		
		String s1="Vaibhav mahadev Hulwan";
		
		String text=s1.toLowerCase();
		
		String text2=text.replace(" ", "");
		
	   char [] 	charArray=text2.toCharArray();
		
		
		 Set<Character> set=new HashSet<Character>();
		 
		 List<Character> list=new ArrayList<Character>();
		 
		 for(char c:charArray) {
			 
			 if(!set.add(c)) {
				 
				 list.add(c);
			 }
		 }
		 
		 System.out.println("Duplicate Character in a String is  " +  list);
		 
		 System.out.println("Unique  Character in a String is   " + set);
		
		
	}
}

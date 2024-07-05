package Java;

import java.util.HashMap;
import java.util.Map;

public class To_find_the_Number_of_characters_occurence_In_String {
	
	public static void main(String[] args) {
		
            String name="vaibhav hulwan";
            
            String newString = name.replace(" ", "");
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		char[] StrArray = newString.toCharArray();
		
		for(char c: StrArray) {
			
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			
			else {
				
				charMap.put(c,1);
			}
		}
		
		System.out.println(newString + " : " + charMap);
		
		
		    
		
		
		
	
		
		
	}
	
}
	


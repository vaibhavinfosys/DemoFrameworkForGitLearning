package Java;

import java.util.HashMap;
import java.util.Map;

public class To_Find_the_Alphabete {
	
	public static void main(String[] args) {
		
		
		String name="Today is tusday.";
		
		String newName=name.replace(".","");
		String namewithoutString = newName.replaceAll(" ", "");
		System.out.println(namewithoutString);
		
		char[] charArray = namewithoutString.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		
		for(char c:charArray) {
			
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

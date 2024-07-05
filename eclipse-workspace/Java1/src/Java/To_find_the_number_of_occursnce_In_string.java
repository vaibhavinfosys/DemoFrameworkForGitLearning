package Java;

import java.util.HashMap;
import java.util.Map;

public class To_find_the_number_of_occursnce_In_string {
	
	public static void main(String[] args) {
		
		String s1="Vaibhav mahadev Hulwan";
		
		System.out.println("String length is " + s1.length());
		
		    char[] ch = s1.toCharArray();
		    
		    System.out.println(ch);
		    
		    System.out.println("Array length is " + ch.length);
		    
		    for(int i=0;i<=ch.length-1;i++) {
		    	
		    	for(int j=1;j<=ch.length-1;j++) {
		    		
		    		Map<Character, String> map=new HashMap<Character, String>();
		    		
		    		map.put(ch[i], s1);
		    		
		    		
		    	}
		    	
		    }
		    
		    System.out.println();
	}

}

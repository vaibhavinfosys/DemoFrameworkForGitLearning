package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
	
	public static void main(String[] args) {
		
		
		
		
     java.util.Map<String,List<String >> map=new HashMap<>();
     
        
    

     // Add values to the Map
     addValueToMap(map, "India", "Pune");
     addValueToMap(map, "India", "Ahmadabad");
     addValueToMap(map, "India", "Banglore");
     
     System.out.println(map.get("India"));
     
     
     
     
     
     
     
    
     
     
     
     
		
		
		
	}

	private static void addValueToMap(java.util.Map<String, List<String>> map, String Key, String Value) {
		// TODO Auto-generated method stub
		
		
		List<String> values = map.getOrDefault(Key, new ArrayList<>());
        values.add(Value); // Add the value to the list
        map.put(Key, values);
		
	}

}

package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Neww {
	
	public static void main(String[] args) {
		
		int [] arr = {2,4,5,3,5,6,3};

		List<Integer> list=new ArrayList<Integer>();
		
		Set<Integer> set=new HashSet<Integer>();
		
		  for(int a:arr) {
			  
			  if(!set.add(a)) {
				  
				  list.add(a);
				  
				  
				  
				  
			  }
		  }

		  
		  System.out.println(list);

		
	}

}

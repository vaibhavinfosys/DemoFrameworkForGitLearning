package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tange {
	
	public static void main(String[] args) {
		
		
	// to find the duplicate number in the array
	
	int [] arr= {2,4,5,4,7,8,9,4,5};
	
	   List<Integer> list=new ArrayList<Integer>();
	   
	   Set<Integer> set=new HashSet<Integer>();
	   
	   for(int array:arr) {
		   
		   if(!set.add(array)) {
			   
			   list.add(array);
		   }
		   
	   }
	   
	   System.out.println(list);
	   
	   System.out.println(set);

}

}

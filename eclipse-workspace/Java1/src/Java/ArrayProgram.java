package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProgram {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6};
		
		List<Integer> list=new ArrayList<Integer>();
		
	for(int a:array) {
		
		list.add(a);
	}
	
	System.out.println("Before reversing" + list );
	
	Collections.reverse(list);
	
	System.out.println("After reversing" + list);
	
	
	
	
}

}

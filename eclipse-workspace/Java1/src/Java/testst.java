package Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class testst {
	
	public static void main(String[] args) {
	
		testst.sortingArray();
	
  }
	
	public static void sortingArray() {
		
		Integer [] array= {6,3,6,0,6,2,0,1,0,0};
		
		 Arrays.sort(array,Collections.reverseOrder());
		 
	 System.out.println(Arrays.toString(array));
		
	}

}

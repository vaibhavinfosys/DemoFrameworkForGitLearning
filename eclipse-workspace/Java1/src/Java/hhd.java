package Java;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class hhd {
	
	public static void main(String[] args) {
		
		
		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		        int[] newArray = new int[array.length + 2];

		        // Copy elements up to the 4th position
		        for (int i = 0; i < 4; i++) {
		            newArray[i] = array[i];
		        }

		        // Insert new elements 10 and 16 at the 4th and 5th positions
		        newArray[4] = 10;
		        newArray[5] = 16;

		        // Copy remaining elements from the original array
		        for (int i = 4; i < array.length; i++) {
		            newArray[i + 2] = array[i];
		        }

		        // Print the new array
		        System.out.println(Arrays.toString(newArray));
		 
		


	          


}
}
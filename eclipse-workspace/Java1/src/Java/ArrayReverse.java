package Java;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		
		int [] array1= {1,2,3,4,5};
		
		int [] array2= {6,7,8,9,10};
		
		String arr=Arrays.toString(array1);
		
		System.out.println(arr);
		
		
		
		int l1=array1.length;
		
		int l2=array2.length;
		
		int [] combineArray=new int[l1+l2];
		
		
	// copy first array in newArray
		
		for(int i=0;i<=array1.length-1;i++) {
			
			combineArray[i]=array1[i];
		}
		
	// copy second array in newArray
		
		for(int i=0;i<=array2.length-1;i++) {
			
			combineArray[array1.length+i]=array2[i];
			
		}
		
		// print the combine array
		
		/*
		 * for(int a:combineArray) {
		 * 
		 * System.out.print(a+" ");
		 * 
		 * 
		 * }
		 */
		
		System.out.println("Combine array is -------");
		
		String combinearr=Arrays.toString(combineArray);
		
		System.out.println(combinearr);
		
		int [] reveresedArray=new int[l1+l2];
		
		for(int i=combineArray.length-1;i>=0;i--) {
			
			reveresedArray[i]=combineArray[i];
		}
		
		System.out.println("Reversed array is -------");
		
		String rev=Arrays.toString(reveresedArray);
		
		System.out.println(rev);
		
		
	}
	
	

}

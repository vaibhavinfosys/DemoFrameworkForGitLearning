package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reverse_Array {

	
	public static void main(String[] args) {
		
		
		
		int [] array1= {1,2,3,4,5};
		
		int l1=array1.length;
		
		int [] array2= {6,7,8,9,10};
		
		int l2=array2.length;
		
		int L=l1+l2;
		
		
		
		
		int [] newArray=new int[L];
		
		for(int i=0;i<=array1.length-1;i++) {
			
			newArray[i]=array1[i];
		}
		
		for(int i=0;i<=array2.length-1;i++) {
			
			newArray[i+5]=array2[i];
		}
		
		
		String array = Arrays.toString(newArray);
		
		System.out.println(array);
		
		// convert array into ArrayList
		
		List<Integer> list=new ArrayList<Integer>();
		
		/*
		 * for(int i=0;i<=newArray.length-1;i++) {
		 * 
		 * list.add(i);
		 * 
		 * }
		 */
		
		
		for(int lis:newArray) {
			
			list.add(lis);
			
			
		}
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		
		
		List<Integer> linkedlist=new LinkedList<Integer>();
		
		
		linkedlist.add(1);
		
		linkedlist.add(2);
		
		linkedlist.add(3);
		
		linkedlist.add(4);
		
		linkedlist.add(5);
		
		
		System.out.println(linkedlist);
		
		linkedlist.add(2, 10);
		
		System.out.println(linkedlist);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

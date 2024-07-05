package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Convert_Array_into_ArrayList {
	
	public static void main(String[] args) {
		
		int [] array= {2,3,5,6,7,8};
	
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		for(int values:array) {
			
			al.add(values);
		}
		
		
		System.out.println(al);
		
		
		long count = al.stream().count();
		
		System.out.println(count);
	}

}

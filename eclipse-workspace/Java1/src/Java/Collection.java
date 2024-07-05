package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection {
	
	public static void main(String[] args) {
		
		
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Apple");
		al.add("mango");
		al.add("pinapple");
		al.add("Apple");
		al.add("mango");
		al.add("Apple");
		
		
		System.out.println(al);
		
		HashSet<String> set=new HashSet<String>();
		
		set.addAll(al);
		
		System.out.println(set);
		
		boolean result = set.contains("Apple");
		
		System.out.println(result);
		
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		Iterator<String> iterator = al.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
	}

}

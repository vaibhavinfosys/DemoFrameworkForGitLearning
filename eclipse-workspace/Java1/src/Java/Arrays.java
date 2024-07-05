package Java;

public class Arrays {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6,7,8};
		
		System.out.println(array.length);
		
		// output {1,2,3,4,10,16,6,7,8}
		
		int [] newArray=new int[array.length+1];
		
		System.out.println(newArray.length);
		
		// copy element upto 4th position
		
		for(int i=0;i<4;i++) {
			
			newArray[i]=array[i];
		}
		
		// insert new array in the 4th and 5th position
		
		newArray[4]=10;
		newArray[5]=16;
		
		// copy remaining array 
		
		for(int i=5;i<array.length;i++) {
			
			newArray[i+1]=array[i];
		}
		
		
		System.out.println(java.util.Arrays.toString(newArray));
		
		
		
		
		
		
		
		
		
	}

}

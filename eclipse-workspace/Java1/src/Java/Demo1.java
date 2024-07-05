package Java;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String s1="Java Programming";
		
		  // to convert the string in to the String array
		
	   String[] str2 = s1.split(" ");
	   
	   for(int i=str2.length-1;i>=0;i--) {
		   
		   System.out.print(str2[i] + " ");
	   }
		
		
		
	}

}

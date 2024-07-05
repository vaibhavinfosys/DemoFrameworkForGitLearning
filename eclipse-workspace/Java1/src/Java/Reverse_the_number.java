package Java;

public class Reverse_the_number {
	
	public static void main(String[] args) {
		
		int number=12345;
		
		int rev=0;
		
		for(int i=number;i>0;i=i/10) {   // i=1234
			
			int remainder=i%10;     // int remainder=5
			
		     rev=rev*10+remainder;   // rev=0*10+5=5
		}
		
		System.out.println(rev);
		
	}

}

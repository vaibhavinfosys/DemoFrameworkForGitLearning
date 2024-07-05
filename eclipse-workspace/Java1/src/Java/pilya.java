package Java;

public class pilya {
	
	public static void main(String [] args){
		
		int number=123456789;
		
		int rev=0;
		
		for (int i=number;i>0;i=i/10) { //  i=123456789 another logic is i=123456789/10=12345678
			
		    int remainder = i%10;   // 123456789%10=9
		    
		    rev=rev*10+remainder; //  rev=9
		}
		
		System.out.println(rev);
		
		if(rev==number) {
			
			System.out.println("Given number is palindrom");
		}
		
		else {
			
			System.out.println("Given number are not palindrom");
		}
		
		String numbers="123456789";
		
		
		
	int newformat=Integer.parseInt(numbers);
	
	System.out.println(newformat);
	
	System.out.println(newformat/10);
		
	      
		
		
	}
}
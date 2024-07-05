package Java;

public class Logical_Code {
	
	public static void main(String[] args) {
		
		
		
	
	    
	    father fath=new son();
	    
	    fath.foo();
		 
		}
	
	
	
	
	

}

class father{
	
	public static void foo() {
		
		System.out.println("I am your dad beta");
	}
}

class son extends father{
	
	public static void foo() {
		
		System.out.println("I am son your dad");
	}
}

package Java;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s1="Vaibhav Hulwan";
		
		   // String[] split = s1.split("//s+");
		    
		     String [] words=s1.split(" ");
		     
		     System.out.println(words);
		     
		     for(String word:words) {
		    	 
		         
		           
		           StringBuffer bfr=new StringBuffer(word);
		           
		          System.out.print(bfr.reverse());
		           
		           
		       }
		     }
		    
				/*
				 * for(int i=split.length-1;i>=0;i--) {
				 * 
				 * 
				 * }
				 */
		
		
	}



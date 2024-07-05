package Java;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;





class student{
		int rollNumber;
		
		String studentname;
		
		static  String collage="TKIET";
	
	student(int number,String name){
		
		rollNumber=number;
		
		studentname=name;
		
	}
	
	public void display() {
		
		System.out.println(rollNumber+" "+ studentname+" "+collage);
	}
}

public class Demo {
	
	public static void main(String[] args) {
		
		student st1=new student(12,"Vaibhav");
		
		st1.display();
		
		student st2=new student(23,"Satish");
		
		st2.display();
		
		student st3=new student(34,"Aneesh");
		
		st3.display();
		
		student st4=new student(45,"Vishal");
		
		st4.display();
		
		student st5=new student(50,"Mayur");
		
		st5.display();
		
		
		
		
		
	}
}

 


	
   
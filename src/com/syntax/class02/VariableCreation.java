package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {

		//1 way to create a variable
		byte b=10; //create a variable and assigned a value
		
		//2 way to create a variable
		int i; //create a variable
		i=100;//assign value
		
		// We need to create a variable only once
		//then we can use it as many times as we want
		
		//3 way to create a variable
		//create variable = declare a variable
		int num1, num2, num3;
		
		num1 = 100; //assign value or initialize variable
		num2 = 200;//assign the value
		num3 = 300;
		
		System.out.println(num2); //200
		//int num1=100; error -> duplicate variable
		
		// ? Can I change a value of a variable???
		num2=2000;//reassign	
		
		System.out.println(num2);//2000
		
		//1 variable can only hold 1 value at one time/per line 
		//but can change later replace with something new 200 vs 2000
	
		boolean boo=true;
		System.out.println(boo);
		boo=false;
		System.out.println(boo);
		boo=true;
		System.out.println(boo);
		
		
	}

}

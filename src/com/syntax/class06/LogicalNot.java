package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {


		boolean boo=!true;
		System.out.println(boo);// false
		
		boolean boo1 = !false;
		System.out.println(boo1); //true
		
		
		
		boolean rain = false;
		
		if (!rain) {
			System.out.println("go outside");// if false then statement will output
		}
		
		String day = "Monday";
		
		if (!day.equals("Sunday")) {
		System.out.println("Not Sunday");	
			
		}
		
		else {
			System.out.println("_________________");
		}
		
		
		boolean checkbox=false;
		
		if(!checkbox) {
			System.out.println("Click and select");
		}
		
		
		
	}

}

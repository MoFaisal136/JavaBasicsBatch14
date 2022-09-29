package com.syntax.class05;

public class RecapIfElse {

	public static void main(String[] args) {
		// shortcut for main method = main+ctrl+space
		
		String phone = "motorolla"; 
		/*if String phone = "motorolla"; 
		 * it will not be allowed in through "Door"
		 * if no else statement is met
		 */
		
		if (phone.equals("iPhone")) {
			
			System.out.println("wanna buy");
		}
		else if (phone.equals("Samsung")){
			
			System.out.println("for friend");
		}
		else if(phone.equals("Nokia")) {
			
			System.out.println("buy for yo momma");
		}
		else {
			System.out.println("ain't the phone mang");
		}
		
		
		

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your current time");

		int hour = input.nextInt();

		String timeOfDay;// currently do not value until reading below
		
		
		//** below took out syso and introduced another variable^^**
		
		if (hour >= 1 && hour <= 11) {
			timeOfDay="Morning";
			
			
		} else if (hour >= 12 && hour <= 15) {
			timeOfDay="Afternoon";
			
		} else if (hour >= 16 && hour <= 20) {
			timeOfDay="Evening";
			
			
		} else if (hour >= 21 && hour <= 24) {
			timeOfDay="Night";
		}
		
		else {
			System.out.println("Wrong number entered");
			timeOfDay= "Invalid";
		}
		
		System.out.println(timeOfDay);
		
	}

}

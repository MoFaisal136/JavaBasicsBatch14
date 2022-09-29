package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {

		String day ="Saturday";
		
		if (day.equals("Saturday")|| day.equals("Sunday")) {
			// True OR False ALWAYS gives true
			
			System.out.println("LOGICAL OR I have java class");
		}
		else {
			System.out.println("No class");
		}
		
		
		//testing AND
		if (day.equals("Saturday")&& day.equals("Sunday")) {

			
			System.out.println("I have java class");
		}
		else {
			System.out.println("LOGICAL AND No class");
		}
		System.out.println("________");
		
		
		
		double money = 90000;
		
		String title = "automation tester";
		
		if (title.equals("automation tester") || money ==120000){
			// T									F		= TRUE
			
			System.out.println("happy");
		}
		
		 if (title.equals("manual tester")|| money == 90000) {
			 System.out.println("manual tester money");
		 }
		 
		 if (title.equals("automation tester")|| money ==60000) {
			 
			 System.out.println("do better");
		 }
		
	}

}

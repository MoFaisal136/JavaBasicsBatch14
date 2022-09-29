package com.syntax.class10;

public class StringExample {

	public static void main(String[] args) {


		String[] week = {"Monday", "Friday", "Thursday", "Saturday", "Wednesday","Tuesday", "Sunday"};
		
		for (String day:week) {
			//System.out.println(day);
		//} OP = ELEMENTS
		
		/*
		 * if day is Sunday -> it is a fun day
		 * otherwise -> boring
		 */
		if(day.equals("Sunday")) {
			System.out.println(day+" is a fun day");
			
		}else if(day.equals("Friday")){

			System.out.println(day+ " relax day");
		
		}else {
			System.out.println(day+ " boring day");}
		}
		
	}

}

package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int time= 9;
		String day= "Monday";
		
		if(day.equals("Monday")) {// String=NonPrimitive (==)NO 	(.equals(""))YES
			/*Outer if condition **THINK OF AS DOOR TO GET IN**
			 * If True only inner condtions will be checked
			 * if False NO inner condition will be checked
			 * 
			 */
			
			if (time>7) {	//Inner if condition
				System.out.println("Go to office");
			}
			if (time<6) {
				System.out.println("Sleep more");
			}
		}

	}

}

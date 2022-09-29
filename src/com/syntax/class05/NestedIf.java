package com.syntax.class05;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean allergy = true;
		
		String allergyType= "Peanut";
		
		if(allergy) {
			System.out.println("What allergies you got?");
			
			if (allergyType.equals("pollen")) {
				System.out.println("Stay inside during spring");
			}
		}else 
		{
			System.out.println("you good hammy");
		}
	}

}

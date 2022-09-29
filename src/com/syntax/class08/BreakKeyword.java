package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		for(int i=1; i<5; i++) {
			
			System.out.println("Halleu");
			
				if (i==3) {
					break;// exits loop used within some type of condition
				}
		}
		
		System.out.println("Bye");
		System.out.println("________________________________________");
		/*
		 * Used in these scenarios:
		 * When app being developed and site contains links and pages 
		 * appear within link
		 * Automation capacity is able to grab all links within site
		 * Allows movement through all links(tabs) on a site
		 * Home		Course		Enroll		Webinar		etc...
		 * 						^	
		 * want enroll so it breaks the loop on number 3
		 */
		
		boolean hungry=true;
		
		while(hungry) {
			System.out.println("GEEV ME FEWWWD");
			break;
		}
		
		
		
	}

}

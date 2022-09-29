package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i=1; i<3; i++)	{	//outer loop controls inner loop
			
			System.out.println("Halleu");
			
			for (int j=1; j<=3; j++) {	//inner loop depends on outer loop
				System.out.println("bye");
			}
		}
		System.out.println("End of Code");
		System.out.println("_____________________________________________________________________________________");
		
		for (int k=0; k<=2; k++) {
			
			for (int n=1; n<4; n++) {
				System.out.println(k+" "+n);
			}
		}
		
		/*
		 * This is used in retrieving data from excel columns and rows 
		 */
	}

}

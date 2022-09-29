package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		for(int i =1; i<5; i++) {
			
			if (i==3) {
			
			continue;
			}
			
			System.out.println(i);
			System.out.println("Halleu");
			System.out.println("how are yew");
			
			
			//Print nums 1-20 EXCEPT 3, 7, 11
			
			for (int k=1; k<=20; k++) {
				
				if(k==3 || k==7 || k == 11) {
					continue;
					
				}
				System.out.print(k+" ");
			
				
				
			}
			/*
			 *  Continue continues to the next iteration/cycle
			 *  moment Java sees continue it goes back to the beginning of the loop
			 *  it usually used inside coniditions
			 */
			
			
		}
		
		
		
	}

}

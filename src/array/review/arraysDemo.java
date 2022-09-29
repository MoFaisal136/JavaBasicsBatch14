package array.review;

import java.util.Arrays;

public class arraysDemo {

	public static void main(String[] args) {

		String [] shirt = new String [] {"black", "blue", "red", "white"};
		System.out.println(shirt.length);
		
		for(int i =0; i<shirt.length; i++) {
			System.out.println("Lets try "+shirt[i]);
		}
		
		
		// ENHANCED
		for (String top: shirt) {
			System.out.println(top);
			
		}
		
		System.out.println("***************************");
		// prints all elements of array without a loop  
		System.out.println(Arrays.toString(shirt));
		
	}

}

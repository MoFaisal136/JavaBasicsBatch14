package com.syntax.class10;

public class Enhanced2DArray {

	public static void main(String[] args) {


		String[][] countries= {
				{"USA", "Canada"}, //1 array with index 0
				{"Colombia", "Brazil", "Ecuador", "Peru"},//2 array index 1 
				{"Nigeria", "Egypt", "Kenya"},//3 array index 2 
				{"Germany", "Turkey"}, //4 array index index 3 
				{"Kazakhastan", "South Korea", "Japan", "Bangladesh"}	
		};	
		// first array will be stored in country
		for(String [] country:countries) {
			
			//Retrieving all values within 2D array
			for(String c:country) {
		
				if (c.equals("USA")) {
					System.out.println(c+ " is my home country");
				}else {
				
				System.out.println(c+" ");
				}
			}
			System.out.println();
		}
		
	}

}

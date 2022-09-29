package com.syntax.class10;

public class TwoDEnhanced {

	public static void main(String[] args) {


		
		String[][] arr= {

                {"Mohammad", "Shahansha", "Ingrid", "Nadia"},
                {"A", "B", "C", "D"}
        };
		
		
		for(String[]singleArray:arr) {// loops over 1d or single array
			
			for(String el:singleArray) {//loops over each element of the 1dArray 
				
				System.out.print(el+" ");
			}
			System.out.println();
		}
		
		System.out.println("___________________________________________________");
		
		
		
	}

}

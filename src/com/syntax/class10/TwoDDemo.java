package com.syntax.class10;

public class TwoDDemo {

	public static void main(String[] args) {

		String[][] countries= {
				{"USA", "Canada"}, //1 array with index 0
				{"Colombia", "Brazil", "Ecuador", "Peru"},//2 array index 1 
				{"Nigeria", "Egypt", "Kenya"},//3 array index 2 
				{"Germany", "Turkey"}, //4 array index index 3 
				{"Kazakhastan", "South Korea", "Japan", "Bangladesh"}	
		};		
		System.out.println(countries.length);//5 number of arrays or rows
		
		int elements01 =countries[0].length;
		System.out.println("Num of elements in 1st array "+elements01);
		// num of elements in 1st array
		
		int elements02 =countries[1].length;
		System.out.println("Num of elements in 1st array "+elements02);
		

		System.out.println("________________getting all values of 2d array___________________");
	
		
		
		
	//Loops over rows
	for (int r =0; r<countries.length; r++) {
		for (int c=0; c<countries[r].length; c++) {// column will be counted off of num of rows
			System.out.print(countries[r][c]+" ");
		}
		
		
	}
	
	
	
	
	
	
	}

}

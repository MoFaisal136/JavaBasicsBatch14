package com.syntax.class10;

public class TwoDNestedCont {

	public static void main(String[] args) {
		

		String[][] arr= {

                {"Mohammad", "Shahansha", "Ingrid", "Nadia"},
                {"A", "B", "C", "D"}
        };
		
		for(int i=0; i<arr.length; i++) {//iterates over rows
			
			for(int a = 1; a<arr[i].length; a++) {//iterates over columns
				
				System.out.print(arr[i][a]+" ");
			}
		}
		
		
		
		
	}

}

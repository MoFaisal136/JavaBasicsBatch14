package com.syntax.class08;

public class NestedLoopExample {

	public static void main(String[] args) {

		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					System.out.println(a + " " + b + " " + c);

				}
			}
		}
		System.out.println("_________________________________________________");
		
		//multiplication table
		
		for (int d=1; d<=9; d++) {
			for (int e=1; e<=9; e++)
				System.out.println(d+" x "+e+" = " + d*e);
		}
		
		
		
		
	}

}

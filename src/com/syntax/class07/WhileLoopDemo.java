package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

		
		int time = 10;
		
		if (time <12) {
			System.out.println("gm");
		}
		
		/*
		 * while (time<12) {//infinite loop  
		 * System.out.println("gm");
		 * }
		*/
		while (time <12) {
			time++;
			System.out.println("gm");
		}
	}

}

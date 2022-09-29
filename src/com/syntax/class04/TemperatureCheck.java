package com.syntax.class04;

public class TemperatureCheck {

	public static void main(String[] args) {
		/*Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature 
		 * is below 32 then it should print 
		 * “Water will freeze with temperature ”, 
		 * otherwise “Water will NOT freeze with temperature ”.
		 * 
		 */
		
		double temp=35;	//store in decimal but use type casting
		if (temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp);
			
		}
		

	}

}

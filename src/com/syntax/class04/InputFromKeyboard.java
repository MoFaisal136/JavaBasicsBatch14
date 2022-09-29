package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us take the input from 
		 * the keyboard. It contains many different smaller
		 * modules called METHODS that can help us take 
		 * String, booleans basically all types of data
		 * from the keyboard
		 */
		Scanner input=new Scanner(System.in);
		//A message will be displayed to the user on the console to enter name
		System.out.println("Please enter your name");
		//Activates the java program to take the input from the keyboard and store
		String name = input.next();
		//prints whatever name is entered on the keyboard on the console
		System.out.println("Hello "+name);
	}

}

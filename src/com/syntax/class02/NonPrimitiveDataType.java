package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
		//String is jut 1 example of non primitive data type
		
		String name ="Asma";		
		String address="123 address street";
		String phone ="123 456 7890";
		int age = 17;
		//String age = "17"; //anything inside "" ->becomes a String
		
		String character ="A";
		
		//ctrl + space -> auto completes the statement
		//syso + ctrl + space + enter
		
		System.out.println(name);
		
		// My name is Asma
		System.out.println("My name is " +name);
		
		//Asma is 17
		System.out.println(name +" is " + age);
		
		String fruit = "apple";
		double price = 1.99;
		
		//The price of the apple is 1.99
		
		System.out.println("The price of the " +fruit+" is " + price);
		
		/* to attach any value (int, double, boolean, char, String, etc...)
		 * to a String we use +
		 * + next to the String acts as Concatenation
		 */
		
		//The price of mango is 2.99
		fruit = "mango";
		price = 2.99;
		
		System.out.println("The price of " + fruit + " is " +price);
		
		
		String vegetable = "potato";
		double price2 = 9.99;
		//The price of potato is 9.99
		
		System.out.println("The price of " + vegetable + " is " + price2);
		
		//The price of onion is 6.99
		vegetable = "onion";
		price2 = 6.99;
		System.out.println("The price of " + vegetable + " is " + price2);
		
		
		

	}

}

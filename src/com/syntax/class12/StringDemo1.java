package com.syntax.class12;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Today is Sunday";
		String day = str.substring(9);
		//will get every char past index 9
		
		System.out.println(day);
		System.out.println(str.substring(6,8));
		
		char c = str.charAt(4);//calling the method charAt on str object
		
		System.out.println(c);
		
		char[] charArr=str.toCharArray();
		System.out.println(charArr);
		System.out.println(Arrays.toString(charArr));
		
		//find index of a
		int index=str.indexOf("a");
		System.out.println(index);
		
		// index of second a
		System.out.println(str.indexOf("a",6));
	}

}

package com.syntax.class09;

public class Array1 {

	public static void main(String[] args) {

		int[] 	arr	=	new int [4];
//DATA TYPE/ARRAY	VARIABLE		ELEMENTS
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
	//Store elements in indexes
		
		// accessing elements from array
		System.out.println(arr[2]);
		
		System.out.println(arr[1]+arr[2]);
		
		System.out.println("_____________________________________________________");
		
		
		//Storing String values
		
		String[] name = new String [5];
		//   ALWAYS HAVE TO SPECIFY ^
		
		name[0]="Shahansha";
		name[1]= "Mohammad";
		name[2]= "Faisal";
		name[3]= "Ingrid";
		name[4]= "Nadia";
		
		System.out.println("Hello "+name[4]);
	}

}

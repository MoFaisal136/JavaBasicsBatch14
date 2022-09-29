package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * Type casting -> converting one value from from data type to another 
		 * 
		 * Converting one data type to another
		 * *******NEED TO USE PARENTHESIS TO CONVERT********
		 * Smaller to Larger Java will not complain
		 * But larger to smaller Java will complain
		 */
		
		byte box1=127;//smallest box
		short box2=3333;//double the size of byte in terms of bits
		int box3 = 45454545;//32 bits larger box MOST COMMONLY used
		long box4 = 45454545L; // Large box
		float box5 = 312045123; // Can store even larger numbers
		double box6 = 875646515; //Largest 
		
		//int num =15.2; -> we can't store the decimal num in a box type of int
		
		int num =(int)15.2;
		System.out.println(num);
		
		//byte num2=(byte)box2; WORKS
		//System.out.println(num2);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short num3 =box1;
		System.out.println(num3);
		
		long box7=box1;
		System.out.println(box7);// we can do this because box7 is larger than box1
		
		float box8 =(float)box6; 
		/* 
		 * as box6 is larger it is double we need type casting to assign
		 */
		char a =(char)66;// Based of of ASCII-> all characters stored as numbers
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		/*
		 * trying to fit content of larger box into smaller box Java will complain
		 * and give an unexpected value
		 * not to worry about giving binary based answer
		 */
		
		
		
		short box=127; // more than 127 needs larger
		//byte box2 = (byte)box;
		//System.out.println(box2);
		
		/*
		 * What is type casting?
		 * =Converting one data type to another data type
		 *Why should I learn about type casting?
		 *
		 *=So that we can use the code that is written by someone else to make our life
		 *easier, or when we will be working in teams we will be able to merge the code
		 *
		 *What is the syntax for type casting?
		 *when we are converting something smaller to bigger it happens automatically
		 *we just assign the variable CALLED widening/implicit/automatic
		 *HOWEVER large to small need =() called narrowing/explicit/manual conversion
		 *
		 */
		
		
		
		
	}

}

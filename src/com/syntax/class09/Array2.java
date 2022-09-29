package com.syntax.class09;

public class Array2 {

	public static void main(String[] args) {

		int [] nums=new int [3];
		
		nums [1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]);
		
	
		
		System.out.println("_________________________________");
		
		
		String[] color=new String[3];
		
		color [0]="red";
		color [1]="white";
		color [2]="blue";
		//color [3]="black";
		
	//System.out.println(color[3]);
		/*
		 * Will get error with [3] because [3] already includes [0], [1]. [2]
		 * 														3 INDEXES ALREADY
		 */
		
		System.out.println(color[2]);
	}

}

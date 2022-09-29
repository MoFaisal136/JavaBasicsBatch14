package com.syntax.class07;

import java.util.Scanner;

public class SwitchHW3 {

	public static void main(String[] args) {

		Scanner aaa = new Scanner(System.in);
	    System.out.println("Enter 1st Number");
	    double num1 = aaa.nextInt();
	    System.out.println("Enter 2nd Number");
	    double num2 = aaa.nextInt();
	    System.out.println("Enter the operator");
	    String oper=aaa.nextLine();
	    char op = aaa.next().charAt(0);
	    
	    double result = 0;
	    
	    switch (op) {
	    case'+':
	    	result = num1+num2;
	    	break;
	    case'-':
	    	result = num1-num2;
	    	break;
	    case'*':
	    	result = num1*num2;
	    	break;
	    case'/':
	    	result = num1/num2;
	    	break;
	    	
	    
	    
	    }
	    
	    System.out.println(result);
	}

}

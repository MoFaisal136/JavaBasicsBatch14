package com.syntax.class07;

import java.util.Scanner;

public class CalculatorHW3 {
public static void main(String[] args) {
	
	Scanner aaa = new Scanner(System.in);
    System.out.println("Enter 1st Number");
    double num1 = aaa.nextInt();
    System.out.println("Enter 2nd Number");
    double num2 = aaa.nextInt();
    System.out.println("Enter the operator");
    String oper=aaa.nextLine();
    char op = aaa.next().charAt(0);
    double result=0 ;
    boolean wrong=false;

    if (op == '+') {
        System.out.println("The result is: " + (num1 + num2));
    } else if (op == '-') {
        System.out.println("The result is: " + (num1 - num2));
    } else if (op == '*') {
        System.out.println("The result is: " + (num1*num2));
    } else if (op == '/') {
        System.out.println("The result is: " + (num1 / num2));
    } else {
        System.out.println("enter valid operator");
        wrong=true;
        
    }
    if (!wrong) {
    	System.out.println(result);
    }
}
}

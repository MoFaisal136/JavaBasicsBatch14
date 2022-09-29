package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//+, -, *, /, %

		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder = c%d; //10/3
		int div = c/d; //10/3
		
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(remainder+" REMAINDER");
		
		int e=10;
		int f=5;
		
		System.out.println("division = " +e/f); //2
		System.out.println("remainder = " +e%f); //0
		
		System.out.println(20%7);
		
		System.out.println("Sum is = " +sum);
		System.out.println("sub is = " +sub);
		System.out.println("Remainder is = " +remainder);//1
		System.out.println("Div is = " +div);//3 but in actuality its 3.333333
		
		double num1 = 10;
		double num2=3;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		float number1 = 10.0f;
		float number2 = 3.0F;//f/F does not matter
		
		System.out.println("Division of float = "+number1/number2);
		System.out.println("Remainder of float = "+number1%number2);
		
		System.out.println(10+10/10);
		System.out.println((10+10)/10);//parenthesis are needed
	}

}

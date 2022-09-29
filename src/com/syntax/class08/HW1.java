package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);


        for(int i=1; i<=3; i++) {
            System.out.println("Please write a name");
            String name=input.nextLine();
            System.out.println("Good afternoon "+name);
            System.out.println("---------------------------------");
        }
	}

}

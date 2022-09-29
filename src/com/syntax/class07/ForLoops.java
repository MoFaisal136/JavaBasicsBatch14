package com.syntax.class07;

public class ForLoops {

	public static void main(String[] args) {
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Halleu");
		}

		System.out.println("_______________");
		
		
		//print numbers from 1-20
		
		for (int i = 1; i<=20; i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("___________");
		System.out.println("________");
		//print numbers from 30-10
		
		for (int m=30; m>=10; m--) {
			System.out.print(m+" ");
			
		}
		
		System.out.println("________");
		System.out.println("________");
		for(int z = 0; z<=10; z+=2) {
			System.out.print(z+" ");
		}
		
		System.out.println("________");
		System.out.println("________");
		
		int sum=0;
		
		for(int j=1; j<=6; j++) {
			sum+=j;
			
		}
		System.out.println(sum);
		
		
	}

}

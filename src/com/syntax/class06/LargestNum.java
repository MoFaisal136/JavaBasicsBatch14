package com.syntax.class06;

public class LargestNum {

	public static void main(String[] args) {

		int n1 = 100;
		int n2 = 200;
		int n3 = 300;

		int largest = 0;

		if (n1 > n2 && n1 > n3) {
			largest = n1;
		} else if (n2 > n1 && n2 > n3) {
			largest = n2;
		} else if (n3 > n1 && n3 > n2) {
			largest = n3;

		}
		System.out.println(largest);

		int n4 = 10;
		int n5 = 10;
		int n6 = 10;
		int large = 0;

		if (largest != 0) {
			if (large % 2 == 0) {
				System.out.println(large + " is even");
			} else {
				System.out.println(large + " is odd");
			}

		}
	}

}

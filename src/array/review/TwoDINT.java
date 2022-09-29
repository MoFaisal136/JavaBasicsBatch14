package array.review;

import java.util.Arrays;

public class TwoDINT {

	public static void main(String[] args) {

		
		int[][]arr = new int[][] {
			{10, 20, 30},
			{25, 25, 63}
			
		};
		// prints entire index 
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr[1][2]);
		int smallest = arr[0][0];
		
		for(int i =0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j]<smallest) {
					smallest = arr[i][j];
				}
			}
		}
		System.out.println(smallest);
		
	}

}

package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		// matching case must be same type as variable********
		char choice='Y';
		String answer;
		
		switch(choice) {
		//CANNOT HAVE DUPLICATE CASES*********
		case 'Y':  // CANNOT USE &&, ||, !***
			answer="Yes";
			break;
			
		case 'N':
			answer="No";
			break;
			
		case 'M':
			answer="Maybe";
			break;
			
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
	}

}





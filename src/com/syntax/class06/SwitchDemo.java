package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		int day = 6;
/*
 *  if statement condition based t/f
 */
		if (day == 1) {
			System.out.println("if Monday");
		} else if (day == 2) {
			System.out.println("if Tuesday");
		} else if (day == 3) {
			System.out.println("if Wednesday");
		} else if (day == 4) {
			System.out.println("if Thursday");
		} else if (day == 5) {
			System.out.println("if Friday");
		} else if (day == 6) {
			System.out.println("if Saturday");
		} else if (day == 7) {
			System.out.println("if Sunday");
		} else {
			System.out.println("if Invalid");
		}
		System.out.println("________________");
		
		/*
		 * switch case is value based
		 * knows when to jump to matching case
		 */
		String name;
		
		switch(day) {
		
		case 1:
			name ="switch Monday";
			break;
		case 2 :
			name = "switch Tuesday";
			break;
		case 3:
			name ="switch Wednesday";
			break;
		case 4 :
			name = "switch Thursday";
			break;
		case 5:
			name ="switch Friday";
			break;
		case 6 :
			name = "switch Saturday";
			break;
		case 7:
			name = "switch Sunday";
			break;
	
		default:
			name="switch invalid";
			break;
			
		}
		System.out.println(name);
	}
}
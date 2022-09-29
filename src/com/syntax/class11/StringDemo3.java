package com.syntax.class11;

public class StringDemo3 {

	public static void main(String[] args) {

		
		String fname = "Nadia";
		String lname= "Shaikh";
		
		System.out.println(fname+lname);
		System.out.println(fname.concat(" ").concat(lname));
		
		String str=" ";
		
		System.out.println(str.isEmpty());
		/*isEmpty() returns True if a String is empty
		 * will return false even if space is in String var
		 * 
		 * isBlank does not count the spaces
		 * 
		 */
		//System.out.println(str.isBlank());
		
	}

}

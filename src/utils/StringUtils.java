package utils;

public class StringUtils {

	//CREATING a METHOD 
	
	//1. create behavior
	public void printAllIndexes(String str,char charToSearch) {
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)==charToSearch) {
				System.out.println(i);
			} 
		}
		
	}
	
	
}

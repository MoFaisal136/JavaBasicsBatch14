package com.syntax.class11;

import com.syntax.class11.Phone;

public class PhoneTester {
	//MAIN METHOD IN THIS CLASS
	public static void main(String[] args) {

		/*
		 * if class whose object we are creating
		 * is present inside the same package
		 * we don't need to import it
		 */
		Phone iphone = new Phone();
		iphone.model="iPhone 14 Pro Max";
		iphone.make="Apple";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		//new Phone() => To create the object
		  Phone samsungPhone=new Phone();
	        samsungPhone.model="S22 Ultra";
	        samsungPhone.make="Samsng";
	        samsungPhone.year=2022;
	        samsungPhone.makeCall();

		
	}

}

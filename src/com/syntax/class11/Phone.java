package com.syntax.class11;

public class Phone {
	
	//MAIN METHOD IN ANOTHER CLASS
	  
	  /*
	   * Create a Class “Phone”. 
	   * Create 3 Objects of it: iPhone, Pixel, Samsung 
	   * with specific attributes and behaviors.
	   */
     
    //create attributes and Methods
	   String make;
	    String model; 
	    String color;
	    int year;
	    int storage;

	    void makeCall() {
	        System.out.println("Making a call using "+model);
	    }

	    void takePictures() {
	        System.out.println("Taking picture with "+model);
	    }

	    void browseInternet() {
	        System.out.println("Browsing the Internet using "+ model);
	    }


}



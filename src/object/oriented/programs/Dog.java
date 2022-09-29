package object.oriented.programs;

public class Dog {
	
	
	/*
	 * state what it looks like ATTRIBUTES/PROPERTIES/FIELDS
	 * All represent state of an object
	 */
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	
	/*
	 * void defines behavior
	 * 
	 * These are the behaviors of a dog
	 * Behaviors aka METHODS/ FUNCTIONS
	 */
	void bark () {
		System.out.println("Barking......");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping.....");
	}
	
public static void main(String[] args) {
	
	// creating objects from a class
	Dog dog1=new Dog();// LIKE SCANNER
	//new Dog(); => creates an object of class Dog
	
	
	// calling a behavior on a object
	dog1.bark();
	
	dog1.sleep();
}

	

}

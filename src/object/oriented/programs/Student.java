package object.oriented.programs;

public class Student {

	// state
	String name;
	String id;
	int age;
	double weight;
	char gender;

	void study() {// behavior should be defined individually

		System.out.println("Studet is studying");
	}

	void deleteMsg() {
		System.out.println("deleting msg from discord");
	}

	void eat() {
		System.out.println("Eating pizzzzzzzzzza..");
	}

	public static void main(String[] args) {
			Student student1 = new Student();
	//creating an object -> name of class + nameOfObject = new +class
			student1.name="Ingrid";
			student1.id="625";
			student1.age=21;
			
			System.out.println(student1.name);
			System.out.println(student1.age);
			
			student1.eat();
			student1.eat();
			student1.eat();
			
		Student student2 = new Student();
		
		student2.name="Nadia";
		student2.gender='F';
		student2.age=26;
		student2.weight=100;
		
		System.out.println(student2.name);
		student2.eat();

			
			
			
		}
}

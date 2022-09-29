package array.review;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		
		String[] individualsRoom1= new String[] {"Ingrid", "Nadia", "Amy"};
		String[] individualsRoom2= new String[] {"Ariana", "Noor", "Saluan"};
		String[] individualsRoom3= new String[] {"Hanah", "Zunaira", "Aliza"};
		
		String[][] rooms=new String[3][];
		// can leave empty because each^ array can store however many elements
		rooms[0]=individualsRoom1;
		rooms[1]=individualsRoom2;
		rooms[2]=individualsRoom3;
		
		System.out.println(rooms[1][1]);
		
	}

}

package assisted;

public class Accessmodifier {
	

		    public int legCount;
		    public void display() {
		        System.out.println("I am an animal.");
		        System.out.println("I have " + legCount + " legs.");
		    }
		    public static void main( String[] args ) {
		        Accessmodifier animal = new Accessmodifier();

		        animal.legCount = 4;
		        animal.display();
		    }
}
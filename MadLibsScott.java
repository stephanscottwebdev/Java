import java.util.Scanner;

//Stephan Scott
public class MadLibsScott {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a name.");
		String name = in.nextLine();
		
		System.out.println("Please enter an object.");
		String objectOne = in.nextLine();
		
		System.out.println("Please enter an object.");
		String objectTwo = in.nextLine();
		
		System.out.println("Please enter an object.");
		String objectThree = in.nextLine();
		
		System.out.println("Please enter a past tense verb.");
		String verb = in.nextLine();
		
		System.out.println("Please enter an adjective.");
		String adj = in.nextLine();
		
		System.out.println(name + " had a little " + objectOne + " it's " + objectTwo + " was silky as snow, and everywhere that " + name + " " + verb + " the " + objectThree + " was sure to go.");
	}
	
}

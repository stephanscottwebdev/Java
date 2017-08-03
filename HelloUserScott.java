import java.util.Scanner;
//Stephan Scott
public class HelloUserScott {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			//Ask the user for their first name.
			//Ask the user for their age.
			//Take the name they provided and capitalize the first letter.  Return the capitalized first name in the answer back to them.
			//Take the input for their current age and add one to it.
			//Reply back to the user "Howdy, Name.  Next year you will be X years old."
			
			System.out.println("What is your first name?");
			String fName = in.nextLine();
			
			System.out.println("How old are you? (No lying!)");
			int age = in.nextInt();
			
			char start = fName.charAt(0);
			int ageAdd = age + 1;
			
			System.out.println("Howdy " + fName + " next year you will be " + ageAdd + " years old.");
			
		}
}

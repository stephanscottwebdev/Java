	import java.util.Scanner;
	//Stephan Scott
	
public class CompareNamesScott {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
		
			System.out.println("Please enter a name:");
			String nameOne = in.nextLine();
			
			System.out.println("Please enter another name:");
			String nameTwo = in.nextLine();
			
			//Boolean ignoreCase = nameOne.equalsIgnoreCase(nameTwo);
			
			if (nameOne.equalsIgnoreCase (nameTwo))
				System.out.println("They are the same name.");
			else
				System.out.println("They are not the same name.");
		}
}

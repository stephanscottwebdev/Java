import java.util.Scanner;
	//Stephan Scott
public class CompareNumbers {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter a number.");
			double numOne = in.nextDouble();
			
			System.out.print("Please enter another number.");
			double numTwo = in.nextDouble();
			
			//Find out if the numbers are equal, greater than or less than each other
			boolean greaterthan = numOne > numTwo;
			System.out.print(numOne + " is greater than " + numTwo + ". " + greaterthan);
			
			boolean lessthan = numOne < numTwo;
			System.out.print(numOne + " is less than " + numTwo + ". " + lessthan);
			
			boolean equalto = numOne == numTwo;
			System.out.print(numOne + " are equal " + numTwo + ". " + equalto);
			
		}
}

import java.util.Scanner;
	//Stephan Scott
public class CompareNumbersModifiedScott {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter a number.");
			double numOne = in.nextDouble();
			
			System.out.print("Please enter another number.");
			double numTwo = in.nextDouble();
			
			if (numOne > numTwo) {
			       System.out.print(numOne + " is greater than " + numTwo);
			} else if (numOne < numTwo) { 
			       System.out.print(numOne + " is less than " + numTwo); 
			} else if (numOne == numTwo) { 
			       System.out.print(numOne + " is equal to " + numTwo); 
			} 
			
		}
}

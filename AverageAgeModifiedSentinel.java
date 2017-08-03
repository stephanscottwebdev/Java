//Stephan Scott
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AverageAgeModifiedSentinel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//int totalAges = 0;
		int counter = 0;
		int total = 0;
		
		System.out.println("This program will calculate the average age.");
		System.out.println("To begin, please enter the amount of people you will be entering ages for.");
		System.out.println("When you are finished adding ages, type '999'");

		int age = input.nextInt();
		
		while (age != 999)
		{ // 999 is the Sentinel value.
			total += age; // Running total.
			counter++;
			
			System.out.print("Please enter an age.");
			age = input.nextInt();

			
		}	
		double averageAge = (double) total / counter;

		System.out.printf("The average age in your family is %.2f " , averageAge);
		input.close();
		
	}

}

//Stephan Scott
import java.util.Scanner;

public class AverageAgeModifiedScott {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the age of the first person in your family.");
		int personOne = in.nextInt();
		
		System.out.println("Please enter the age of the second person in your family.");
		int personTwo = in.nextInt();
		
		System.out.println("Please enter the age of the third person in your family.");
		int personThree = in.nextInt();
		
		System.out.println("Please enter the age of the fourth person in your family.");
		int personFour = in.nextInt();
		
		
		double sumOfAges = personOne + personTwo + personThree + personFour;
		
		System.out.println("The sum of my familys age is " + sumOfAges + ".");
		
		double averageAge = sumOfAges / 4;
		
		System.out.println("The average age in my family is " + averageAge + ".");
	}

}

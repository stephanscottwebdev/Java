//Stephan Scott
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AverageAgeModifiedAgainScott {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*
		Modify it to prompt the user for how many ages they would like to enter.  
		Run the user through a while loop prompting them to enter an age for the number of times they provided.  
		After the last age is entered, return the average age back to them.  Verify that the age returned back to 
		them displays a decimal point (double).  The input of the ages should be integers - not doubles.
		Verify that your loop is correct and ends appropriately.  If you submit an infinite loop, 
		you will receive zero points.  Infinite loops equals not happy instructor.
		*/
		
		int counter = 0;
		int total = 0;
		
		System.out.println("How many ages would you like to enter?");
		//String numberOfAgesQuestion = JOptionPane.showInputDialog("How many ages would you like to enter?");
		int numberOfAges = in.nextInt();
		
		while (counter < numberOfAges){
			System.out.print("Please enter an age.");
			//String enterAge = JOptionPane.showInputDialog("Please enter an age.");
			int age = in.nextInt();
			
			total += age;
			counter++;
		}	
		
		double averageAge = (double)total / numberOfAges;
		System.out.printf("The average age in your family is %.2f " , averageAge);
		//String averageAgeAnswer = JOptionPane.showInputDialog("The average age in my family is %.2f " , averageAge);
	}

}

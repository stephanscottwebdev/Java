import java.util.Scanner;

//Stephan Scott
public class PrintStarsScott {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("How many rows of stars would you like to see?");
		int starAmount = in.nextInt();	
		
		String star = "******************";
		int counter = 1;
		
		do {
			System.out.println(star);
			counter++;
		}while (counter <= starAmount);{
			
		}
	}
}

import java.util.Scanner;
//Stephan Scott

public class EFScaleScott {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*Write the program that prompts the user for a three second wind gust in MPH.  
		Return the EF rating for the provided 3 second gust based on the table to your right. 
		Add input validation to your program.  The following inputs would be errors for our program:
		Gust less than 65
		Any negative numbers
		Any input that is not a sequence of numbers 
		If your user enters any of these items, we want to provide and error and exit the program.	
		*/
		System.out.print("Please enter a three second wind gust in MPH: ");
		int windGust = in.nextInt();
		
		if (in.hasNextInt() ){
			
		if (windGust > 65) {	
		
		if (windGust > 200) {
		       System.out.print("EF Rating 5");
		} else if (windGust < 200) { 
		       System.out.print("EF Rating 4"); 
		} else if (windGust >= 166) { 
		       System.out.print("EF Rating 3"); 
		} else if (windGust >= 136) { 
		       System.out.print("EF Rating 2"); 
		} else if (windGust >= 111) { 
		       System.out.print("EF Rating 1"); 
		} else if (windGust < 86) { 
		       System.out.print("EF Rating 0"); 
		} 
			
		} else{
			System.out.println("There was an input error. Please only use numbers.");
		}
		
		} else {
			System.out.println("MPH is too low for an EF Rating.");
		}
		in.close();
		
		
	}
}
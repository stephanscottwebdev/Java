//Stephan Scott
import java.util.Scanner;
public class PasswordValidationScott {

	public static void main (String [] args) {

		String inputPassword;							

		Scanner input = new Scanner (System.in);		

		System.out.println("Please enter a password. Password requirements are: ");
		System.out.println("Must be at least 8 characters");
		System.out.println("Must have at least 1 uppercase letter");
		System.out.println("Must have at least 1 lowercase letter");
		System.out.println("Must have at least 1 digit");	
		System.out.println("Password:");
		inputPassword = input.next();					

		System.out.println(PasswordCheck(inputPassword));	
		System.out.println("");

		main(args);									

	}

	public static String PasswordCheck (String Password) {

		String result = "Valid Password";			
		int length = 0;								
		int numCount = 0;							
		int capCount = 0;							


		for (int x =0; x < Password.length(); x++) {
			if ((Password.charAt(x) >= 47 && Password.charAt(x) <= 58) || (Password.charAt(x) >= 64 && Password.charAt(x) <= 91) ||
				(Password.charAt(x) >= 97 && Password.charAt(x) <= 122)) { //I found an example like this online but dont really understand how it works. Its basically ASCII, but in my code I allow special characters? Is that basically it?
					
				} else {
					result = "Your Password contains an invalid character!";		
				}

			if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {		
				numCount ++; //numbers
			}

			if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {		
				capCount ++; //caps
			}

			length = (x + 1);										

		}

		if (numCount < 1){											
			result = "Please include a number in your Password!";
		}

		if (capCount < 1) {											
			result = "Please include a capital letter in your Password!";
		}

		if (length < 8){							
			result = "Your password is Too Short!";
		}

			return (result);										
	} 
} //Mine repeats after its validated. I dont like that.


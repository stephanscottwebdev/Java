import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number.");
		int n = in.nextInt();
		
		if (n > 10) {
		       System.out.print("*****");
		} else if (n > 7) { 

		       System.out.print("****"); 
		} else if (n > 4) { 

		       System.out.print("***"); 
		} else if (n > 1) { 

		       System.out.print("**"); 
		}

		System.out.println("*");
	}
}

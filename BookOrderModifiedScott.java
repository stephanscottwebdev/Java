//Stephan Scott

import java.util.Scanner;

public class BookOrderModifiedScott {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the price of your first book.");
		double bookOne = in.nextDouble();
		
		System.out.println("Please enter the price of your next book.");
		double bookTwo = in.nextDouble();
		
		System.out.println("Please enter the price of your next book.");
		double bookThree = in.nextDouble();
		
		System.out.println("Please enter the price of your final book.");
		double bookFour = in.nextDouble();

		double bookShipping = 2.95;
		System.out.println("Shipping: $" + bookShipping);

		double bookTax = 6.5;
		
		
		double booksSubtotal = bookOne + bookTwo + bookThree + bookFour;
		System.out.printf("Subtotal: $" + "%.2f" , booksSubtotal);
		
		double booksTaxed = booksSubtotal / bookTax;
		System.out.printf("Tax: $" + "%.2f" , booksTaxed);
		
		double bookTotal = booksTaxed + booksSubtotal;
		System.out.printf("Total: $" + "%.2f" , bookTotal + bookShipping);

	}
}

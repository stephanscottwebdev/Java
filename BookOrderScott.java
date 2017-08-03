//Stephan Scott
public class BookOrderScott {
	public static void main(String[] args) {
		/* Read the book subtotal (the price of all the books added together) and the number of books.
		Compute the tax (6.5 percent of the total book price).
		Compute the shipping charge ($2.95 per book).
		The price of the order is the sum of the total book price, the tax, and the shipping charge.
		Print the price of the order.
		
		Translate this pseudocode into a Java program.  Rather than providing a major number for the book subtotal, 
		create a variable (probably a double) with the book subtotal and a variable for the number of books (
		probably an int since you can't have a decimal points worth of books).  
		Remember to change these numbers after you've finished your program to make sure it works correctly. */
		
		double bookOne = 45.99;
		System.out.println("Total price for this book is $" + bookOne + ".");
		double bookOneWithTax = bookOne / 6.5;
		System.out.println("The tax for this book is $" + bookOneWithTax + ".");
		double bookOneTotalWithTax = bookOne + bookOneWithTax;
		System.out.println("Your book total is $" + bookOneTotalWithTax);
		double bookShipping = 2.95;
		System.out.println("The shipping cost for every book is $" + bookShipping);
		double bookOneTotalWithShipping = bookOneTotalWithTax + bookShipping;
		System.out.println("Your total with shipping is $" + bookOneTotalWithShipping);
		
		double bookTwo = 54.99;
		double bookTwoWithTax = bookTwo / 6.5;
		double bookThree = 29.99;
		double bookThreeWithTax = bookThree / 6.5;
		double bookFour = 79.99;
		double bookFourWithTax = bookFour / 6.5;
		
		int bookCountTotal = 4;
		double bookTax = 6.5;
		
		
		double booksSubtotal = bookOne + bookTwo + bookThree + bookFour;
		
		double booksTaxed = booksSubtotal / bookTax;
		double bookTotal = booksTaxed + booksSubtotal;
		
		System.out.println("The subtotal for your books is $" + booksSubtotal + " for a total of " + bookCountTotal + " books.");
		System.out.println("Your total tax is $" + booksTaxed + ".");
		System.out.println("The total with tax is $" + bookTotal + ".");
	}
}

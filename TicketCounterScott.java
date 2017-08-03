import java.util.Scanner;

//Stephan Scott
public class TicketCounterScott {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int ticketInventory = 75;
		final int MAX_TICKETS = 6;
		int totalBuyers = 0;

		while (ticketInventory > 0) {
			System.out.print("How many tickets would you like to buy, maximum of 6 per user.");
			int ticketsPurchased = in.nextInt();
			totalBuyers++;

			while (ticketsPurchased > MAX_TICKETS || ticketsPurchased < 1 || ticketsPurchased > ticketInventory) {
				if (ticketsPurchased > MAX_TICKETS || ticketsPurchased < 1) {
					System.out.print("Please choose a ticket between 1 and 6.");
				} else {
					System.out.print("There are not enough tickets to complete your order. There are " + ticketInventory
							+ " available.");
				}
				ticketsPurchased = in.nextInt();

			}
			ticketInventory -= ticketsPurchased;
		}
			System.out.println("The tickets for this event have sold out. There were a total of " + totalBuyers
					+ " buyers for this event.");
		
	}
}

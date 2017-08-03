import java.util.Scanner;
//Stephan Scott

public class ShopperRewardsScott {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Please enter the cost of your groceries: ");
			double cost = in.nextDouble();
			
			double disc1 = 14;
			double disc2 = 12;
			double disc3 = 10;
			double disc4 = 8;
			
			
			double savings1 = cost * disc1 * .01;
			double savings2 = cost * disc2 * .01;
			double savings3 = cost * disc3 * .01;
			double savings4 = cost * disc4 * .01;

			
			if (cost > 210) {
			       System.out.print("You've recieved a " + disc1 + "% discount on your food purchase, ");
			       System.out.printf("a savings of $" + "%.2f! " , savings1);
			} else if (cost > 150) { 
			       System.out.print("You've recieved a " + disc2 + "% discount on your food purchase and "); 
			       System.out.printf("a savings of $" + "%.2f! " , savings2);
			} else if (cost > 60) { 
			       System.out.print("You've recieved a " + disc3 + "% discount on your food purchase and "); 
			       System.out.printf("a savings of $" + "%.2f! " , savings3);
			} else if (cost > 10) { 
			       System.out.print("You've recieved an " + disc4 + "% discount on your food purchase and "); 
			       System.out.printf("a savings of $" + "%.2f! " , savings4);
			} else if (cost < 10) { 
			       System.out.print("Sorry, no discount available. "); 
			} 
			
			if (cost > 99.01) {
			       System.out.print("You also recieved a 3¢ per gallon fuel discount!");
			} else if (cost > 99) { 
			       System.out.print("You also recieved a 2¢ per gallon fuel discount!"); 
			} else if (cost > 49) { 
			       System.out.print("You also recieved a 1¢ per gallon fuel discount!"); 
			} else if (cost < 10) { 
			       System.out.print("Sorry, no fuel discount available."); 
			} 
			//If they spend between $1 and $49, they receive a 1¢ discount per gallon of gas.  
			//If they spend between $49.01 and $99, they receive a 2¢ discount per gallon of gas.  
			//If they spend more than $99.01, they receive a 3¢ discount per gallon of gas.
			//Report their discount savings, amount of discount 
			//(formatted to two decimal places) and gas discount back to them.
		}
}

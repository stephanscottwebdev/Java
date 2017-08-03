//Stephan Scott
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MidtermScott 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		boolean ZZZ = true;
	
		int bonus = 0;
		
		double sales = 0;
		//sales = input.nextDouble();
		double allStar = sales * .03;
		double notAllStar = sales * .02;
		
		String FirstName = JOptionPane.showInputDialog("What is your First name?");
		String LastName = JOptionPane.showInputDialog("What is your Last name?");
		String TotalSales = JOptionPane.showInputDialog("What were your total sales?");
		String fNameCap = FirstName.substring(0, 1).toUpperCase() + FirstName.substring(1);
		String lNameCap = LastName.substring(0, 1).toUpperCase() + LastName.substring(1);
		String allStarQuestion = JOptionPane.showInputDialog("Press y for all-star, n for non all-star: ");
		//String y = (Double.parseDouble(y));
		String nextPerson = JOptionPane.showInputDialog("");
		String bonusFourStar = "****";
		String bonusTwoStar = "**";
		
			while (!input.equals("ZZZ")) 
			{
			       System.out.println("First Name: " + FirstName );
			       System.out.println("Last Name: " + LastName );
			       System.out.println("Total Sales: " + TotalSales );
				sales = input.nextDouble();
			} 
			if (bonus > 100) 
				{
				   System.out.print(bonusFourStar + allStar);
	    	   }else 
	    	   {
	    		   System.out.print(bonusTwoStar + notAllStar);
	    	   }
			
			       
			} 
		}
	
	//:( Java is interesting but difficult.


import java.util.Scanner;

//Stephan Scott
public class ChildcareChargesScott {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rates[][] = 
			{      
				{30, 60, 88, 115, 140},
                {26, 52, 70, 96, 120},                 
                {24, 46, 67, 89, 110},
                {22, 40, 60, 75, 88},
                {20, 35, 50, 66, 84} 
            };
		System.out.println("Whats the age of your child?");
		System.out.println("How many days per week will they attend?");
		System.out.println("When you are finished adding ages, type '999'");
		
		int age = input.nextInt();
		int days = input.nextInt();
		//while (age != 999 || days != 999){
			for (int row = 0; row < rates.length; row++){
				for(int column = 0; column < rates[row].length; column++){
					System.out.println(rates[row][column]);
				}
			}
				if (//This is where I get lost){
					
				}
			
		}
	}



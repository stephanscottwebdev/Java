import java.util.Scanner;

//Stephan Scott
public class RandomNumbersScott 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers would you like to see?");
		int total = input.nextInt();
		
		System.out.print("Whats the lowest number you would like to see?");
		int lowest = input.nextInt();
		
		System.out.print("Whats the highest number you would like to see?");
		int highest = input.nextInt();
		
		for (int i = 1; i <= total; i++ )
		{
			int output = (int) (Math.random() * (highest - lowest + 1)) + lowest; //This doesnt make sense to me.
			System.out.println(output);
		}
	}
}

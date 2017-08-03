import java.util.Scanner;

//Stephan Scott
public class WordCounterScott {
	public static void main(String[] args)
	{
		
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a phrase.");
	String phrase = input.nextLine();
		countWords(phrase);
	}
	
	/**
	 * This will count the number of words in a phrase. Displaying an int.
	 * @param str takes a phrase as a String.
	 * @return returns the number of words in the phrase as an int.
	 */
	
	public static int countWords(String str)
	{
		int blankCount = 1;
		
		for (int i = 0; i < str.length(); i++)
		{
			String sub = str.substring(i, i + 1);
			if (sub.equals(" ")) {
				blankCount++;
			}
		}
		System.out.println("The number of words in your phrase is: " + blankCount);
		return blankCount;
	}
}

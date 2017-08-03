import java.util.Scanner;

//Stephan Scott
public class VowelFoundScott 
{
	public static final String SENTINEL = "exit";
	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a word: ");
	String str = input.nextLine();
	boolean exit = true;
	
    int count = 0;
    while (!str.equals(SENTINEL))
    {
            for (int i = 0; i < str.length(); i++) 
            {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                    count++;
                    System.out.println(count + " vowel(s) in " + str);
                    System.out.println("Please enter another word.");
                    String nextStr = input.nextLine();
                    System.out.println(count + " vowel(s) in " + nextStr);
                    break;
                }
            }
	}
}
}
//Im having issues with exiting the program.


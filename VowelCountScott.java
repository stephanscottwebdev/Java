import java.util.Scanner;

//Stephan Scott
public class VowelCountScott {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word. I will tell you how many vowels are in your word.");
		String phrase = input.nextLine();
		
		int vowelCount = 0;
		
		String sub = phrase.substring(0);
		
			 if(sub.equals("a,e,i,o,u")){
			 vowelCount++;
			 System.out.println(vowelCount);
			 }
			 }
	}


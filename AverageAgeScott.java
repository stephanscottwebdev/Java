//Stephan Scott
public class AverageAgeScott {

	public static void main(String[] args) {
		
		int stephanAge = 32;
		System.out.println("My age is " + stephanAge + ".");
		int allisonAge = 31;
		System.out.println("My wifes age is " + allisonAge + ".");
		int nevaehAge = 12;
		System.out.println("My daughters age is " + nevaehAge + ".");
		int rufusTheDog = 5;
		System.out.println("The Rufie boys age is " + rufusTheDog + ".");
		
		int sumOfAges = stephanAge + allisonAge + nevaehAge + rufusTheDog;
		
		System.out.println("The sum of my familys age is " + sumOfAges + ".");
		
		int averageAge = sumOfAges / 4;
		
		System.out.println("The average age in my family is " + averageAge + ".");
	}

}

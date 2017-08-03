//Stephan Scott
public class ComputeBalanceScott {
	public static void main(String[] args) {
		computeBalance(1000, .045, 3);
		//should return $1141.17

		computeBalance(2000, .03, 5);
		//should return $2318.55

		computeBalance(3000, .01, 10);
		//should return $3313.87
	}
	public static void computeBalance(double initialBalance, double rate, int years)
	{
		int compound = 1;
		
		if(compound < years) 
		{
			double balance = initialBalance * Math.pow(1 + (rate / compound), compound * years);
			System.out.printf("Your balance is %.2f",  balance);
			System.out.println();
		}
	}
}

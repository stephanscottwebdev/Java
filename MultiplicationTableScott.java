//Stephan Scott
public class MultiplicationTableScott 
{

	public static void main(String[] args) 
	{
		
		final int CMAX = 12;
		final int RMAX= 12;

        for(int c = 1; c <= CMAX; c++) 
        {
        	for(int r = 1; r <= RMAX; r++) 
        	{
            System.out.printf("%4d", r * c);
        	}
        System.out.println();
        }
    }
}

	

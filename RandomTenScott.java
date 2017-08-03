import java.util.Arrays;

//Stephan Scott
public class RandomTenScott {
	int count = 0;
	public static void main(String[] args)
	{

		int[] numbers = new int[10];  

	    for(int i = 0; i < numbers.length; i++) 
	    {
	      numbers[i] = (int)(Math.random() * 20 + 1);
	    }
	    
	    System.out.println("All array items: " + Arrays.toString(numbers));
	  
		//printReversed(numbers);
		
		System.out.println(Arrays.toString(numbers));
	     System.out.print("Elements: [");
	     for (int element: numbers){
	    	 System.out.print(element + ", ");
	     }
	     System.out.println("]");
	    
	     System.out.print("Even index elements: [");
	     for (int i = 0; i < numbers.length; i=i+2){
	    	 System.out.print(numbers[i]+", ");
	     }
	     System.out.println("]");
	     
	     System.out.print("Even elements: [");
	     for (int i = 0; i < numbers.length; i++){
	    	 if (numbers[i] % 2 == 0){
	    		 System.out.print(numbers[i]+", ");
	    	 }
	     }
	     System.out.println("]");
	     
	     System.out.print("Reverse elements: [");
	     for (int i = numbers.length - 1; i >= 0; i--){
	    	 System.out.print(numbers[i]+", ");
	     }
	     System.out.println("]");
	     System.out.println("First element: " + numbers[0]);
	     System.out.println("Last element: " + numbers[numbers.length -1]);
	     System.out.println("Largest: " + largestElem(numbers));
	     System.out.println("Smallest: " + lowestElem(numbers));
	     
	     public static void int largestElem(int[] numbers){
			 int largestElem = numbers[0];
			 for (int i=1; i < numbers.length; i++){
				 if (numbers[i] > largestElem){
					 largestElem = numbers[i];
				 }
			 }
			 return largestElem;
		 }
		 
		 public static void int lowestElem(int[] numbers){
			 int lowestElem = numbers[0];
			 for (int i=1; i < numbers.length; i++){
				 if (numbers[i] < lowestElem){
					 lowestElem = numbers[i];
				 }
			 }
			 return lowestElem;
		 }
	   }//Im still having issues with these. I tried integrating your code with what I was doing and it didnt work well. Ha
}
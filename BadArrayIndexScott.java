import java.io.IOException;
import java.util.Scanner;

public class BadArrayIndexHaggerty {

	public static void main(String[] args) throws IOException {
		try{
		String[] names = { "Kathy", "Mikki", "Shannon", "Sean", "Kent", "Rusty", "Heidi", "Randy", "Janet", "Roger" };
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter an integer");
			int input = scanner.nextInt();
			
			System.out.println(names[input]);
			scanner.close();
			
		}catch(IndexOutOfBoundsException e){
			System.out.print("Index does not exist");
		}
			
	}

}

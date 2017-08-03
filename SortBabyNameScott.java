import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortBabyNamesHaggerty {

	public static void main(String[] args) throws IOException {
		try{
		String babyNames= "babyNames.txt";
		File names = new File (babyNames);
		Scanner in = new Scanner(names);
		
		
		
		PrintWriter outToGirls = new PrintWriter("girlBabyNames.txt");
		PrintWriter outToBoys = new PrintWriter("boyBabyNames.txt");
		outToGirls.println("Kathy");
		outToBoys.println("Sean");
		
		
		//String value = "";
		
		while(in.hasNextLine()){
			String value = in.nextLine();
			System.out.print(value);
			if(value.contains("girl")){
				outToGirls.println(value);
			}else if(value.contains("boy")){
				outToBoys.println(value);
			}
			
		}
		
		
		in.close();
		outToGirls.close();
		outToBoys.close();
		
		
		}catch(IOException e){
			System.out.println("File not found");
		}
	}

}

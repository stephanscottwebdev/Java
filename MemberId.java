import java.util.Scanner;
//Stephan Scott
public class MemberId {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int stringLimit = 14;
		//I'm not sure how to limit the length of the member ID.
		
		System.out.println("Please enter your member ID.");
		String memberID = in.nextLine(); //I had the stringLimit in the () but it didnt want an int there with the String.
		
		memberID = memberID.toUpperCase();
		//Making all inputted chars upper case.
		//X-83R WS21 B3-E87 (A)
		//012345678901234567890
		String format = memberID.substring(0,1) + "-" + memberID.substring(1,4) + " " + memberID.substring(4,8) + " " + memberID.substring(8,10) + "-" + memberID.substring(10,13) + " " + "(" + memberID.substring(13) + ")";
		
		System.out.println(format);
	}
}

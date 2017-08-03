import java.util.ArrayList;
//Stephan Scott
public class ArrayList{

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		//Print empty array
		System.out.println("Names in the array before we add any " + names);
		System.out.println();
		
		//add names to the array
		names.add("Andy");
		names.add("Angela");
		names.add("Dwight");
		names.add("Erin");
		names.add("Jim");
		names.add("Michael");
		names.add("Pam");
		names.add("Toby");
		System.out.println("Names in the array " + names);
		System.out.println();
		
		// print out the array using get
		for (int i = 0; i < names.size(); i++) {
			String retval = names.get(i);
			System.out.println("Name at index " + (i) + " is: " + retval);
		}
		System.out.println();
		
		//Print the size of the array
		System.out.println("The size if the array is: " + names.size());
		System.out.println();
		
		//Change Andy to Andy Brernard
		names.set(0, "Andy Bernard");
		System.out.println("Changed Andy to Andy Bernard: " + names);
		System.out.println();
		
		//Add Kelly after Jim
		names.add(5,"Kelly");
		System.out.println("Added Kelly after Jim: " + names);
		System.out.println();
		
		//Enhanced for loop to print all names in array
		for( String array: names){
			System.out.println("Using a enhanced for loop to print out array: " + names);
			break;
		}
		System.out.println();
		
		//Create new array and copy names into that array
		ArrayList<String> names2 = new ArrayList<String>(names);
		System.out.println("Copied names into names2 array: " + names2);
		System.out.println();
		
		//Remove Andy Bernard from names but not names2
		names.remove(0);
		System.out.println("Removed Andy Bernard from names array: " + names);
		System.out.println();
		System.out.println("Andy Bernard stayed in names2 array: " + names2);
		
	}// end main

}// end class

/**
 * @author Stephan
 **/
public class stackTester {

	public static void main(String[] args) {

		scottStack<String> greeting = new StackArray<>();

		greeting.push("!").push("World").push("Hello, ");

		System.out.println(greeting.pop() + greeting.pop() + greeting.pop()); // Hello, World!
	     }

}
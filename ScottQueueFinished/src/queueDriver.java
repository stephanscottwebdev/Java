
/**
 * @author Stephan Scott
 *
 */
public class queueDriver {

	public static void main(String[] args) {
		
		queue driver = new queue();
		
		driver.enqueue("dog");
		driver.enqueue("cat");
		driver.enqueue("mouse");
		driver.enqueue("pig");
		driver.enqueue("bird");
		driver.size();
		driver.enqueue("puppy");
		driver.size();
		driver.dequeue();
		driver.dequeue();
		driver.size();
		driver.dequeue();
		driver.peek();
		driver.dequeue();
		driver.dequeue();
		driver.size();
		driver.isEmpty();
	}
}

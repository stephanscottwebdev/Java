/**
 * @author Stephan Scott
 *Create a program that will take a string and place it into a queue, remove items, print size and if its empty.
 */
public class queue {
	
	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int totalItems;
	
	/**
	 * @param s sets the maxSize of the queue.
	 */
	public void Queue(int s)
	{
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		totalItems = 0;
	}
	
	/**
	 * @param str Adds item to queue.
	 */
	public void enqueue(String str)
	{
		if (rear == maxSize-1)
			rear = -1;
		queArray[++rear] = str;
		totalItems++;
	}
				
	/**
	 * @return Removes item.
	 */
	public String dequeue()
	{
		String temp = queArray[front++];
		if (front == maxSize)
			front = 0;
		totalItems--;
		
		return temp;
	}
		
	/**
	* @return Number of items.
	*/
	public int size()
	{
		return totalItems;
	}
		
	/**
	* @return True if no space to add items.
	*/
	public boolean isFull()
	{
		return (totalItems==maxSize);
	}
		
	/**
	* @return True if no items
	*/
	public boolean isEmpty()
	{
		return (totalItems == 0);
	}
		
	/**
	* @return Front item.
	*/
	public String peek()
	{
		return queArray[front];
	}
				
}

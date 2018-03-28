import javax.xml.soap.Node;
import java.util.LinkedList;

/**
 * @author Stephan Scott, 
 *
 */
public class stackScott {
	    private int top;
	    //private String[] stackArray;
	    private int maxSize;
	    private int numItems;
	    private Node first;
	    private String ele;

	    private class Node {
	    	private Node next;
		}

	public stackScott(){ }

	    /**
	     * @param s, 
	     */
	    public stackScott push(ele) {
	    	//Initializes (Instantiates?) the stack.
			Node current = first;
			first = new Node;
			first.ele = ele;
			first.next = current;
			total++;
			return this;
	    	maxSize = s;
	        stackArray = new String[maxSize];
	        top = -1;
	        numItems = 0;
	    }
	    
	    public void push(String s) {
	    	//Adds a string from the array to the top of the stack.
	    	if (!this.isFull())
	    	{
	    		stackArray[++top] = s;
	    		numItems++;
	    	}
	    	else
	    	{
	    		System.out.println("Full Stack");
	    	}
		}

	    public void pop() {
	    	//Pulls item from the array off of the top of the stack.
	    	//numItems--;
	    	//System.out.println(stackArray[top--]);
		if (first == null) new java.util.NoSuchElementException();
		//T ele = first.ele;
		first = first.next;
		total--;
		return ele;
	    }

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		Node tmp = first;
		while (tmp != null) {
			sb.append(tmp.ele).append(", ");
			tmp = tmp.next;
		}
		return sb.toString();
	}

	    public void top() {
	    	//Returns the value at the top of the stack.
	        System.out.println(stackArray[top]);
	     }
	    
	    public boolean isEmpty() {
	    	//Checks if the stack is empty.
	        return (top == -1);
	     }
	    
	    public boolean isFull() {
	    	//Checks if the stack is full.
	        return (top == maxSize - 1);
	     }

		public int size() {
			//Returns the size of the stack.
			return numItems;
		}
}
	

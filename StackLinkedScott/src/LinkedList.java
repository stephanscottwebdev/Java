/**
 * @author Stephan
 * This class creates methods for a LinkedList.
 */
public class LinkedList {

    private static Link first;
    private static Link last;

    /**
     * Sets first and last to null
     */
    public LinkedList() {
        first = null;
        last = null;
    }

    /**
     * @return true if list is empty
     */
    public boolean isEmpty()
    {
        return (first == null);
    }

    /**
     * Displays the stack
     */
    public static void displayList()
    {
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    /**
     * @param d insert at the top
     */
    public static void insertFirst(long d)
    {
        Link newLink = new Link(d);
        newLink.next = first;
        first = newLink;
    }

    /**
     * @return deletes top item
     */
    public static long deleteStackFirst()
    {
        Link temp = first;
        first = first.next;
        return temp.data;
    }

    /**
     * @return data of the top of the stack
     */
    public long pop()
    {
        return LinkedList.deleteStackFirst();
    }

    /**
     * @param x
     */
    public void push(long x)
    {
        LinkedList.insertFirst(x);
    }

    /**
     * Prints out the stack
     */
    public void displayStack()
    {
        System.out.print("Stack ");
        LinkedList.displayList();
    }
}
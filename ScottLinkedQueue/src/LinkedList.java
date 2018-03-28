

/**
 * @author Stephan
 * This class creates methods for a LinkedList.
 */
public class LinkedList {

    private Link first;
    private Link last;

    /**
     *
     */
    public LinkedList()
    {
        first = null;
        last = null;
    }

    /**
     * @return true is List is empty
     */
    public boolean isEmpty()
    {
        return (first == null);
    }

    /**
     * @param d, inserted at top of stack
     */
    public void insert(String d)
    {
        Link newLink = new Link(d);
        newLink.next = first;
        first = newLink;
    }

    /**
     * @return first item at front of queue
     */
    public void remove()
    {
        String temp = first.data;
        if (first.next == null)
        {
            last = null;
        }
        first = first.next;
    }

    /**
     * Shows size of queue
     */
    public void size()
    {
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        //String sizeOfQueue;
        //sizeOfQueue = first.toString() + last.toString();
        //System.out.println("Size of Queue :" + Integer.parseInt(sizeOfQueue));
        System.out.println("");
    }
}

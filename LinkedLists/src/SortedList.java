/**
 * @author Stephan This will sort the list.
 */

public class SortedList {
    private Link first;

    public SortedList()
    {
        first = null;
    }

    /**
     * @return true if the first Link is empty/doesn't exist
     */
    public boolean isEmpty()
    {
        return (first==null);
    }

    /**
     * @param can, organizes cans by first character of the content, alphabetically
     */
    public void insert(can can)
    {
        String key = can.getContent();
        char temp = (key.toLowerCase().charAt(0));

        Link newLink = new Link(temp, can);
        Link previous = null;
        Link current = first;

        while (current != null && temp > current.key)
        {
            previous = current;
            current = current.next;
        }
        if (previous == null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    /**
     * @return the first Link, which is being removed
     */
    public Link remove()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    /**
     *  displays the List
     */
    public void displayList()
    {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

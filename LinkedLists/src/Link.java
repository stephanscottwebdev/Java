/**
 * @author Stephan
 * Class that holds the method for my a link.
 */

public class Link {
    public char key;
    public can data;
    public Link next;
    private Link first;

    public Link()
    {
        first = null;
    }

    /**
     * @param k
     * @param dat
     */
    public Link(char k, can dat)
    {
        key = k;
        data = dat;
    }

    /**
     *  displays the Content of the can
     */
    public void displayLink()
    {
        System.out.print("[" + data.getContent() + "]");
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

    public Link remove()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

}

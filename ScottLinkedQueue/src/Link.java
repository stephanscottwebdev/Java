/**
 * @author Stephan
 * This class creates the Link.
 */

public class Link {

    public String data;
    public Link next;


    public Link(String dat)
    {
        data = dat;
    }

    public void displayLink()
    {
        System.out.print(data + " ");
    }
}

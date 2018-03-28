import java.util.LinkedList;
/**
 * @author Stephan
 * This will insert items into my list and remove and print those items accordingly.
 */

public class LinkedListTester {
    public static void main(String[] args) {

        LinkedList test = new LinkedList();

        can SWPeaches = new can("S&W", "Peaches", 12.0, 2.39);
        can GreenGiantGreenBeans = new can("Green Giant", "Green Beans");
        can DelMonteCreamedCorn = new can("Del Monte", "Creamed Corn", 13.4, 2.49);

        test.add(SWPeaches);
        test.add(GreenGiantGreenBeans);
        test.add(DelMonteCreamedCorn);

        System.out.println("LinkedList contains : ");
        for(int i=0; i< test.size(); i++)
        {
            System.out.println(test.get(i));
        }


        System.out.println(test.remove());
        test.remove();
        test.remove();
        test.remove();



    }
}

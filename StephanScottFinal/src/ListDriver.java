
/**
@author Stephan Scott
Driver class for the LinkedList. This will get the elements that will be compared.
Then it will print the list as is, then print after the removal of duplicates.
 **/
public class ListDriver {
    public static void main(String args[]) {

        LinkedList List1 = new LinkedList();
        List1.add("Stephan");
        List1.add("Nevaeh");
        List1.add("Connor");
        List1.add("Connor");
        List1.add("Allison");
        List1.add("Mike");
        List1.add("Mike");
        List1.add("Paul");
        List1.add("Martha");
        List1.add("Jessica");
        List1.add("Jessica");

        LinkedList List2 = new LinkedList();
        List2.add("Luke");
        List2.add("Lord Vadar");
        List2.add("Leah");
        List2.add("Boba Fett");
        List2.add("R2-D2");
        List2.add("R2-D2");
        List2.add("C-3PO");
        List2.add("Chewbacca");
        List2.add("Chewbacca");
        List2.add("Chewbacca");
        List2.add("Han");

        System.out.println("");
        System.out.println("List 1 before removal of duplicates.");
        List1.printList(List1.head);
        System.out.println("");

        List1.removeDuplicates();
        System.out.println("List 1 after removal of duplicates.");
        List1.printList(List1.head);
        System.out.println("");

        List1.head = List1.mergeSort(List1.head);
        System.out.print("Sorted Linked List 1 is: \n");
        List1.printListS(List1.head);
        System.out.println("");

        System.out.println("");
        System.out.println("List 2 before removal of duplicates.");
        List2.printList(List1.head);
        System.out.println("");

        List2.removeDuplicates();
        System.out.println("List 2 after removal of duplicates.");
        List2.printList(List1.head);
        System.out.println("");

        List2.head = List2.mergeSort(List2.head);
        System.out.print("Sorted Linked List 2 is: \n");
        List2.printListS(List2.head);
    }
}




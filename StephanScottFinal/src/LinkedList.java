/**
 * @author Stephan Scott
This class will remove duplicate names from a sorted linked list.
 It will then Merge Sort the list.
 */
public class LinkedList {

    Node head = null;
    public int length;

    /**
     * Node for the LinkedList.
     */
    class Node {
        String data;
        Node next;

        Node(String d) {
            this.data = d;
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return Compares left to right in the list.
     */
    Node sortedMerge(Node a, Node b)
    {
        Node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.data == b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;

    }

    /**
     *
     * @param h
     * @return the middle node and sorts it left or right.
     */
    Node mergeSort(Node h) {
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node left = mergeSort(h);

        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    /**
     *
     * @param h
     * @return middle Node.
     */
    Node getMiddle(Node h)
    {
        //Base case
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;

        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }

    /**
     * Method that will check if the list is empty and return nothing if it is.
     * It will go through the list until the last node. While its doing that it will compare node to node.
     */
    void removeDuplicates() {
        Node current = head;
        Node next_next;
        if (head == null) return;

        while (current.next != null) {
            if (current.data == current.next.data) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            } else
                current = current.next;
        }
    }

    /**
     *
     * @param new_data Sets new data
     */
    void add(String new_data)
    {
        Node new_node = new Node(new_data);

        /* link the old list off the new node */
        new_node.next = head;

        /* move the head to point to the new node */
        head = new_node;
    }

    /**
     * Prints the data.
     * @param head finds front of Node
     */
    void printList(Node head) {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void printListS(Node headref)
    {
        while (headref != null)
        {
            System.out.print(headref.data + " ");
            headref = headref.next;
        }
    }
}


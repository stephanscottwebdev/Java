//import java.util.LinkedList;

public class LinkedQueueTester {
    public static void main(String[] args) {

        LinkedList tester = new LinkedList();

        tester.insert("dog");
        tester.insert("cat");
        tester.insert("mouse");
        tester.insert("pig");
        tester.insert("bird");
        tester.size();
        tester.insert("puppy");
        tester.size();
        tester.remove();
        tester.remove();
        tester.size();
        tester.remove();
        tester.remove();
        tester.remove();
        tester.size();
        tester.isEmpty();
    }
}

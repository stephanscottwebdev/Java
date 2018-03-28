public class LinkedTester {
    public static void main(String[] args)
    {

        LinkedList tester = new LinkedList();

        tester.push(1);
        tester.push(100);
        tester.push(1000);

        tester.displayStack();

        tester.pop();

        tester.displayStack();

        tester.pop();

        System.out.println(tester.isEmpty());
        tester.displayStack();

        tester.pop();

        System.out.println(tester.isEmpty());
    }
}

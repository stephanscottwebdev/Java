public class Node {
    String name;
    int listPlace;

    Node leftChild;
    Node rightChild;

    /**
     * @return listPlace & name in a sentence
     */
    public String displayNode()
    {
        String output = ("#" + listPlace + " is " + name);
        return output;
    }
}

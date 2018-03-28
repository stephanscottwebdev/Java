/**
 * @author Stephan
 * This is the node class the defines what items will be in the tree.
 */
public class Node {
    String sData;
    int iData;

    Node leftChild;
    Node rightChild;

    /**
     *
     * @return the names.
     */
    public String displayNode()
    {
        String output = ("#" + iData + " is " + sData);
        return output;
    }
}
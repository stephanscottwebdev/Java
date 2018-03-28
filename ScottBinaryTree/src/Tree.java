/**
 * @author Stephan
 * This is the tree that adds the data and compares.
 */
public class Tree {
    private Node root;

    public Tree()
    {
        root = null;
    }

    /**
     *
     * @param id index data
     * @param dd document data
     */
    public void insert(int id, String dd)
    {
        Node newNode = new Node();
        newNode.sData = dd;
        newNode.iData = id;

        if (root == null)
            root = newNode;
        else
        {
            Node current = root;
            Node parent;
            while (true)
            {
                parent = current;
                if (id < current.iData)
                {
                    current = current.leftChild;
                    if (current == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    current = current.rightChild;
                    if (current == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     *
     * @param key checks if the object is null/in the tree.
     */
    public void find(String key)
    {
        String output = find(root, key);

        if( output == null)
            System.out.println("No matching Node found.");
        else
            System.out.println(output);

    }

    /**
     *
     * @param localRoot compares the data to see if it matches
     * @param key
     * @return
     */
    private String find(Node localRoot, String key)
    {
        String output = null;

        if (localRoot != null)
        {
            if (key.compareToIgnoreCase(localRoot.sData) == 0)
                output = localRoot.displayNode();
            else
            {
                output = find(localRoot.rightChild, key); // this only works because i put them in
                // sequential order. i took out the
                // leftChild to save effort
            }
        }
        return output;
    }


}

public class Tree {
    private Node root;

    /**
     *
     */
    public Tree()
    {
        root = null;
    }

    /**
     * @param id, list placement for ordering
     * @param dd, name for data content
     */
    public void insert(int id, String dd)
    {
        Node newNode = new Node();
        newNode.name = dd;
        newNode.listPlace = id;

        if (root == null)
            root = newNode;
        else
        {
            Node current = root;
            Node parent;
            while (true)
            {
                parent = current;
                if (id < current.listPlace)
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
     * @param key, recieves String, translates to node searching with the key
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
     * @param localRoot, recieves a node from find(String)
     * @param key, recieves a string from find(String), compares to localRoot.name
     * @return displayNode() if matching node exists, null if not
     */
    private String find(Node localRoot, String key)
    {
        String output = null;

        if (localRoot != null)
        {
            if (key.compareToIgnoreCase(localRoot.name) == 0)
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

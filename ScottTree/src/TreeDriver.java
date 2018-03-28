public class TreeDriver {
    public static void main(String[] args)
    {

        Tree boysNameTree = new Tree();
        Tree girlsNameTree = new Tree();

        boysNameTree.insert(1, "Noah");
        boysNameTree.insert(2, "Liam");
        boysNameTree.insert(3, "Mason");
        boysNameTree.insert(4, "Jacob");
        boysNameTree.insert(5, "William");
        boysNameTree.insert(6, "Ethan");
        boysNameTree.insert(7, "James");
        boysNameTree.insert(8, "Alexander");
        boysNameTree.insert(9, "Michael");
        boysNameTree.insert(10, "Benjamin");

        boysNameTree.find("Noah");
        boysNameTree.find("Liam");
        boysNameTree.find("Mason");
        boysNameTree.find("Jacob");
        boysNameTree.find("William");
        boysNameTree.find("Ethan");
        boysNameTree.find("James");
        boysNameTree.find("Alexander");
        boysNameTree.find("Michael");
        boysNameTree.find("Benjamin");


        boysNameTree.find("Harold");
        boysNameTree.find("Eli");


        System.out.println("\n\n\n");

        girlsNameTree.insert(1, "Emma");
        girlsNameTree.insert(2, "Olivia");
        girlsNameTree.insert(3, "Sophia");
        girlsNameTree.insert(4, "Ava");
        girlsNameTree.insert(5, "Isabella");
        girlsNameTree.insert(6, "Mia");
        girlsNameTree.insert(7, "Abigail");
        girlsNameTree.insert(8, "Emily");
        girlsNameTree.insert(9, "Charlotte");
        girlsNameTree.insert(10, "Harper");

        girlsNameTree.find("Emma");
        girlsNameTree.find("Olivia");
        girlsNameTree.find("Sophia");
        girlsNameTree.find("Ava");
        girlsNameTree.find("Isabella");
        girlsNameTree.find("Mia");
        girlsNameTree.find("Abigail");
        girlsNameTree.find("Emily");
        girlsNameTree.find("Charlotte");
        girlsNameTree.find("Harper");


        girlsNameTree.find("Harold");
        girlsNameTree.find("Eli");
    }

}
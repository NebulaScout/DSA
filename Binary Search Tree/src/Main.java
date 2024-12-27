public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        // insert new nodes to the binary search tree
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

//        System.out.println("Root: " + myBST.root.value);
//        System.out.println(myBST.root.left.right.value);

        // search for a node in the binary search tree
        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(17));
    }
}
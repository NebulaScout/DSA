/**
 * This is a demonstration of the use of a binary search tree.
 * The tree consists of a parent node, and each parent has siblings(child nodes).
 */

public class BinarySearchTree {

    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

}

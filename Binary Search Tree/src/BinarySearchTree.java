/**
 * This is a demonstration of the use of a binary search tree.
 * The tree consists of a parent node, and each parent has siblings(child nodes).
 */

public class BinarySearchTree {

    private Node root;

    /**
     * This is the structure of a node in the binary search tree.
     */
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    /**
     * This method inserts a new node into the binary search tree.
     * @param value The value of the new node to be inserted.
     * @return true if the node is successfully inserted, false otherwise.
     */
    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        } // end of while loop
    }

    public boolean contains(int value){
        Node temp = root;

        while(temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}

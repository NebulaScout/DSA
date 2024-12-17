/**
 * This is a demonstration of stacks
 * implemented using the pointer-based method.
 *
 * Stacks are visualised vertically thus we will only require one pointer to refer to the top node
 * and extraction is done from top-to-bottom(LIFO), where the last item is extracted first until
 * the last item in the stack is removed.
 */

public class Stack {
    private Node top;
    private int height;

    /**
     * Creates the structure of the node
     */
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    /**
     * Initialize a new node
     * @param value the data contained in the node
     */
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


    public void printStack() {
        Node temp = top;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    /**
     * Add a node to the stack
     * @param value the data contained in the node
     */
    public void push(int value) {
        Node newNode = new Node(value);

        if(height == 0) {
            top = newNode;
        } else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
}

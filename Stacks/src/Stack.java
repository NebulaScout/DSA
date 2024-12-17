/**
 * This is a demonstration of stacks
 * implemented using the pointer-based method.
 * <p>
 * Stacks are visualised vertically thus we will only require one pointer to refer to the top node
 * and extraction is done from top-to-bottom(LIFO), where the top item is extracted first recursively
 * until the stack is empty.
 */

public class Stack {
    private Node top;
    private int height;

    /**
     * Creates the structure of the node
     */
    static class Node{
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

    /**
     * removes the last item in the stack
     * @return contains the last node in the stack
     */
    public Node pop() {
        if(top == null) return null;

        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;

        return temp;
    }
}

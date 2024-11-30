/**
 * This demonstrates the operations in a doubly linked list
 */

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    /**
     * Creates the nodes that will be used in the list
     */
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    /**
     * Constructor method that creates a new node
     * @param value the value contained in the node
     */
    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Get the value of the head pointer
     */
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    /**
     * Get the value of the tail pointer
     */
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    /**
     * Get the total length of the linked list
     */
    public void getLength() {
        System.out.println("Length of the list: " + length);
    }

    /**
     * print the contents of all items in the list
     */
    public void printList() {
        Node temp = head;

        while(temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

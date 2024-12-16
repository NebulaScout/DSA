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
    static class Node {
        int value;
        Node next;
        Node prev;

        // Constructor for the node class
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
     * print the values of all nodes in the list
     */
    public void printList() {
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     *
     * Add a new node to the linked list at the last position
     * @param value the value of the new node
     */
    public void append (int value) {
        Node newNode = new Node(value);

        if(length == 0){ // if there are no elements in the linked list
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    /**
     * Removes the last item in the linked list
     * @return the removed node
     */
    public Node removeLast() {
        if(length == 0) return null;

        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp;
    }

    /**
     * Add a new node to the beginning of the linked list
     * @param value the contents of the new node
     */
    public void prepend(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;

        return temp;
    }
}

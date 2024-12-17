/**
 * This is an implementation of the queue data structure
 * <p>
 * Queues follow the principle of FIFO where the first element that is inserted
 * will be the first one to be removed.
 */

public class Queue {
    private Node first;
    private Node last;
    private int length;

    static class Node{
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /**
     * Initialize a node
     * @param value the data contained in the node
     */
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * Add a node to the end of the queue
     * @param value the data contained in the node
     */
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if(length == 0){
            first = newNode;
            last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
}

/**
 * This program is an example of how to create a linked list.
 */

public class LinkedListExample1 {
    private Node head;
    private Node tail;
    private int length;

    /**
     * Creates a node for the linked list
     */
    class Node{
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /**
     * Instantiates the nodes on a linked list and passes values to the nodes
     * @param value the value to be passed
     */
    public LinkedListExample1(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Prints the values of the nodes on the Linked List
     */
    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * Prints the value of the head pointer to the console
     */
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    /**
     * Prints the value of the tail pointer to the console
     */
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    /**
     * Prints the length of the Linked List on the console
     */
    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * Add an item to the end of the linked list
     * @param value the item to be added
     */
    public void append(int value) {
        // Create a new node
        Node newNode = new Node(value);

        // Check if the node is empty
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++; // increment the length of the linked list
    }

    /**
     * Removes the last element from a linked list
     * @return the element to be removed
     */
    public Node removeLast() {
        // Checks if there are no elements in the linked list
        if(length == 0) return null;

        Node pre = head;
        Node temp = head;

        // Check if the second last element has been reached
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        // when the second last element is reached
        tail = pre; // Set the tail pointer to the second last element
        tail.next = null; // Remove the last element from the linked list
        length--; // Decrement the length of the linked list

        //Check if both the head and tail pointer are pointing to the same node
        // that is, if the linked list contains only one item
        if(length == 0) {
            // Remove the item
            head = null;
            tail = null;
        }
        // the removed node
        return temp;
    }

    /**
     * Adds a new node to the beginning of the list
     * @param value the node's value
     */
    public void prepend(int value) {
        // Create a new node
        // pass a value to store in the node
        Node newNode = new Node(value);

        // Check if linked list is empty
        if(length == 0) {
            // both head and tail pointer point to the same node
            head = newNode;
            tail = newNode;
        } else {
            // the new-node pointer will point to the head pointer's node
            // and append the new node to the beginning of the list
            newNode.next = head;
            head = newNode; // move the pointer to the new prepended node
        }
        length++;  // increment the length of the linked list
    }

    /**
     * Removes the first element in the linked list
     * @return the removed node
     */
    public Node removeFirst() {
        // check if the list has any nodes
        if(length == 0) return null;

        Node temp = head; // create a new pointer that points to the head  pointer's node
        head = head.next; // move the head pointer to the next node
        temp.next = null; // detach the first pointer from the linked list by pointing it to null
        length--; // decrement the linked list

        // if there are no nodes remaining after the decrement,
        // the tail pointer should point to null
        if(length == 0) {
            tail = null;
        }
        return temp;
    }

    /**
     * it gets the value of the node at a certain position
     * @param index the position of the node
     * @return the node that was speified
     */
    public Node get(int index) {
        if(index < 0 || index > length)
            return null;

        Node temp = head;
        for(int i = 0; i < index; i++)
            temp = temp.next;

        return temp;
    }

    /**
     * Modifies the value of a node in the linked list
     * @param index the index of the node
     * @param value the value to be modified
     * @return true if the operation was successful, false if failed
     */
    public boolean set(int index, int value) {
        Node temp = get(index); // Point to the node that is to be modified

        // check if the node is null
        if(temp != null ) {
            temp.value = value; // modify its value
            return true;
        }
        return false;
    }

    /**
     * Insert a new node in the linked list
     * @param index the position to insert the new node
     * @param value the node's value
     * @return true if the process was a success, false if not
     */
    public boolean insert(int index, int value) {
        // check if the index is out of bounds
        if(index < 0 || index > length)
            return false;

        // add a node to the first position in the linked list
        if(index == 0) {
            prepend(value);
            return true;
        }

        // add a node to the end of the linked list
        if(index == length) {
            append(value);
            return true;
        }

        // add a node in the middle of the list
        Node newNode = new Node(value);
        Node temp = get(index -1); // get the position of the node that comes before the indexed node
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
}
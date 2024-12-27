/**
 * This is a demonstration of the use of a hashtable.
 * A hashtable is a data structure that stores key-value pairs.
 * The key is used to access the value.
 * The key is hashed to get the index of the value in the hashtable.
 * The value is stored in the index of the hashtable.
 * If there is a collision, the table can use linear probing or separate chaining to resolve the collision.
 * In this demo, separate chaining is used to resolve collisions.
 */

public class HashTable {

    private final int SIZE = 7; // size of the hashtable
    private Node[] dataMap; // the hashtable

    /**
     * This declares the structure of a node in the hashtable.
     */
    static class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    /**
     * The constructor initializes the hashtable.
     */
    public HashTable() {
        dataMap = new Node[SIZE];
    }

    /**
     * This method prints all the items in the hashtable.
     */
    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}

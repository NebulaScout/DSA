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
     * Declare the structure of a node in the hashtable.
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
     * Initialize the hashtable.
     */
    public HashTable() {
        dataMap = new Node[SIZE];
    }

    /**
     * Print all the items in the hashtable.
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

    /**
     * Convert the key to an index for use in the hashtable.
     * @param key the string to be converted
     * @return the index of the key in the hashtable
     */
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; // get the ascii value of the character at index position i
            // compute the hash using the ascii value
            // to get the position that the item will be placed in the hashtable.
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    /**
     * Insert a new key-value pair in the hashtable.
     * @param key the key that contains the value
     * @param value the value to be stored
     */
    public void set(String key, int value) {
        int index = hash(key); // get the index of the key
        Node newNode = new Node(key, value);

        // check if the index is empty
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            // resolve collision using separate chaining
            Node temp = dataMap[index];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /**
     * Get the value of a key in the hashtable.
     * @param key the key to be searched
     * @return the value of the key
     */
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];

        while (temp != null) {
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }
}

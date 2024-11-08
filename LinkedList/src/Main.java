public class Main {
    public static void main(String[] args) {
        // Creates a new linked list
        LinkedListExample1 linkedList = new LinkedListExample1(4);
//		new LinkedListExample1(4);

//		linkedList.getHead();
//		linkedList.getTail();
//		linkedList.getLength();
        linkedList.append(2);
        linkedList.prepend(9);

        linkedList.printList();

        // Remove the first node in the linked list
//        System.out.println(linkedList.removeFirst());

        // output looks something like LinkedListExample1$Node@a09ee92
        // LinkedListExample1 is the name of the outer class
        // $Node suggests that Node is an inner class inside LinkedListExample1
        // @a09ee92 is the memory address of where the node is stored in the JVM
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeFirst().value); // use ".value" to get the actual value of the node
//        System.out.println(linkedList.removeFirst()); // when list is empty

        //Remove the last node in the linked list
//		System.out.println(linkedList.removeLast().value);
//		System.out.println(linkedList.removeLast().value);
//		System.out.println(linkedList.removeLast());

        // get the value of the node at a specific index
//        System.out.println("Node value:" + linkedList.get(2).value);
//        System.out.println("Node value:" + linkedList.get(0).value);

        System.out.println(linkedList.set(1, 29));
        linkedList.printList();

    }
}
public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(7);


//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

        myDLL.append(8);
        myDLL.append(5);

        myDLL.prepend(6);
        myDLL.prepend(1);

//        myDLL.set(1, 32); // edits the value contained in the specified node

        myDLL.insert(2, 70);

        myDLL.remove(1);

        myDLL.printList();

        // Get the value contained in specific nodes
//        System.out.println("\n\n" + myDLL.get(2).value);
//        System.out.println(myDLL.get(0).value);

        // remove items in the linked list from the first position
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst());

        // remove  items in the linked list from the last position
//        System.out.println(myDLL.removeLast().value); // last item
//        System.out.println(myDLL.removeLast().value); // second last item
//        System.out.println(myDLL.removeLast()); // third last item


    }
}
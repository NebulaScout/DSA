public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(7);


//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

        myDLL.append(8);

        myDLL.prepend(6);

        myDLL.printList();

        // removes the last items in the linked list
//        System.out.println(myDLL.removeLast().value); // last item
//        System.out.println(myDLL.removeLast().value); // second last item
//        System.out.println(myDLL.removeLast()); // third last item


    }
}
public class Main {
    public static void main(String[] args){
        DoublyLinkedList myDLL = new DoublyLinkedList(7);


//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

        myDLL.append(8);

        myDLL.printList();

        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());

    }
}
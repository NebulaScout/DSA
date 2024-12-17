public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(32);

        myQueue.enqueue(29);

        // Remove items from top-to-bottom
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

//        myQueue.getFirst();
//        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
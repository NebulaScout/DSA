public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(32);

        myQueue.enqueue(29);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
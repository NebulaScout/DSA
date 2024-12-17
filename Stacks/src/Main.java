public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(9);

        myStack.push(5);
        myStack.push(63);
        myStack.push(21);

        myStack.pop();

        myStack.getHeight();
        myStack.getTop();

        myStack.printStack();
    }
}
package src;

public class Main {
    public static void main(String[] args) {

        Stack stack = new StackLinkedList();
        stack.push("this is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty " +stack.isEmpty() );
        System.out.println("Pop = " + stack.pop());
        stack.peek();
    }
}

package Stack;

public class LinkedListStack {

    public static void main(String[] args) {

        Stack stack = new Stack();

        for(int i = 1; i <= 5; i++) {

            stack.push(i);
        }

        stack.peek();

        stack.peekAll();

        stack.pop();
    }

}
class Stack {

    Node top = null;

    public void push(int data) {

        Node newNode = new Node(data);
        if(top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public void peek() {
        System.out.println(top == null ? "Stack is Empty!" : top.data);
    }

    public void pop() {

        if(top == null) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("previous top: " + top.data + " popped");
        top = top.next;
        System.out.println("current top: " + top.data);

    }

    public void peekAll() {

        if(top == null) {
            System.out.println("Stack is Empty!");
        }

        Node temp = top;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class Node {

    int data;
    Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;
    }
}

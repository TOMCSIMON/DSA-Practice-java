package Queue;

public class LinkedListQueue {

    public static void main(String[] args) {

        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        for(int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.isEmpty());
        queue.peekAll();
        queue.peek();
        queue.dequeue();
        queue.peekAll();
    }

    private static class Queue {

        Node front;
        Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

        public void enqueue(int data) {

            Node newNode = new Node(data);

            if(front == null) {
                front = newNode;
                rear = newNode;
            }
            else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public void dequeue() {

            if(front == null) {
                System.out.println("Queue is Empty!");
            }
            else {
                System.out.println("Previous Element: " + front.data + " Eliminated!");
                front = front.next;
                if(front == null) {
                    rear = null;
                    System.out.println("Queue is Empty!");
                }else {
                    System.out.println("Current Element: " + front.data);
                }
            }
        }

        public void peek() {

            if(front == null) {
                System.out.println("Queue is Empty!");
            }
            else {
                System.out.println(front.data);
            }
        }

        public void peekAll() {
            Node temp = front;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public boolean isEmpty() {
            return front == null;
        }

    }

    private static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}


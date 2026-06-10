package Queue;

public class ArrayQueue {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        System.out.println(queue.isEmpty());
        for(int i = 1; i <= 4; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.isEmpty());
        queue.peek();
        queue.dequeue();
        queue.enqueue(5);
    }

    private static class Queue {

        int size;
        int front;
        int rear;
        int[] arr;

        public Queue(int size) {
            this.size = size;
            this.front = -1;
            this.rear = -1;
            arr = new int[size];
        }

        public void enqueue(int data) {
            if(front == -1) {
                arr[++front] = data;
                ++rear;
            }else{
                if(rear == size - 1) {
                    System.out.println("Queue Max Limit: " + size + " Reached!");
                }else {
                    arr[++rear] = data;
                }
            }
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public void peek() {
            if(front == -1) {
                System.out.println("Queue is Empty!");
            }else {
                System.out.println(arr[front]);
            }
        }

        public void dequeue() {
            System.out.println("Previous Element: " + arr[front++] + " Eliminated!");
            if(front > rear) {
                System.out.println("Queue is Empty!");
            }else {
                System.out.println("Current Element: " + arr[front]);
            }
        }
    }


}

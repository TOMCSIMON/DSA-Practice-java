package Stack;

public class ArrayStack {

    public static void main(String[] args) {


        Stack stack = new Stack(5);

        for(int i = 1; i <= 5; i++) {
           stack.push(i);
        }
        stack.peekAll();
        stack.peek();
        stack.pop();
        stack.pop();

    }

    private static  class Stack {

        int capacity;
        int top;
        int[] arr;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.top = -1;
            arr = new int[capacity];
        }

        public void push(int data) {
            arr[++top] = data;
        }

        public void peek() {
            System.out.println(arr[top]);
        }

        public void pop() {
            System.out.println("Previous value: " + arr[top--] + " Popped!");
            if(top >= 0) {
                System.out.println("Current value: " + arr[top]);
            }else {
                System.out.println("Stack is Empty Now!");
            }
        }

        public void peekAll() {

            int temp = top;
            while (temp >= 0) {
                System.out.println(arr[temp--]);
            }
        }
    }

}




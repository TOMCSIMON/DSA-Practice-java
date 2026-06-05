package LinkedList.singly;

public class SinglyLinkedList {

    Node head = null;

    // insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // insert at the start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert node at random
    public void insertAtRandom(int data, int position) {

        if(position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if(position == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete from the front
    public void deleteFromStrat(){

        if(head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        head = head.next;
    }

    // deletion from the end
    public void deleteFromEnd() {

        if(head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

   public void reverseList() {

       if (head == null || head.next == null) {
           return;
       }

       Node prev = null;
       Node current = head;
       Node next = null;

       while(current != null) {

           next = current.next;
           current.next = prev;

           prev = current;
           current = next;
       }
       head = prev;
   }
    public void display() {

        Node display = head;

        if(display == null) {
            System.out.println("Linked List is null");
        }else {
            while(display != null){
                System.out.print(display.data + "=>");
                display = display.next;
            }
            System.out.println();
        }
    }
}



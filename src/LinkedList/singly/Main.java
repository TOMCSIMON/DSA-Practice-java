package LinkedList.singly;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        for(int i = 1; i <= 5; i++) {
            singlyLinkedList.insert(i);
        }
        singlyLinkedList.display();
        singlyLinkedList.reverseList();
        singlyLinkedList.display();
        singlyLinkedList.insertAtRandom(10, 2);
        singlyLinkedList.display();
    }
}

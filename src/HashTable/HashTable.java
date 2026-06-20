package HashTable;

public class HashTable {

    public static void main(String[] args) {


        Table hashtable = new Table(10);

        hashtable.put(14, "Tom");
        hashtable.put(24, "Joe");
        hashtable.put(34, "Lee");
        hashtable.put(24, "Frank");
        hashtable.put(34, "James");
        hashtable.put(12, "Boo");

        hashtable.show();
        System.out.println(hashtable.search(24));
    }


    private static class Table {

        int size;
        Node[] arr;

        public Table(int size) {
            this.size = size;
            arr = new Node[size];
        }

        private int hashIndex(int key) {
            return key % size;
        }

        public void put(int key, String value) {

            Node newNode = new Node(key, value);
            int index = hashIndex(key);
            if(arr[index] == null) {
                arr[index] = newNode;
            }else {
                Node temp = arr[index];
                while(temp != null) {
                    if(temp.key == key) {
                        temp.value = value;
                        return;
                    }
                    if(temp.next == null) {
                        temp.next = newNode;
                        return;
                    }
                    temp = temp.next;
                }
            }
        }

        public void show() {

            for(int i = 0; i < arr.length; i++) {

                System.out.print("Bucket " + i + " : ");
                if(arr[i] == null) {
                    System.out.println("null");
                }else {
                    Node temp = arr[i];
                    while(temp != null) {
                        System.out.print("|" + temp.key + " " + temp.value + "|" + "-> ");
                        temp = temp.next;
                    }
                    System.out.println();
                }
            }
        }

        public String search(int key) {

            int index = hashIndex(key);
            if(arr[index] == null) {
                return "no value found";
            }else {
                Node temp = arr[index];
                while(temp != null) {
                    if(temp.key == key) {
                        return temp.value;
                    }
                    temp = temp.next;
                }
                return arr[index].value;
            }
        }
    }

    private static class Node {
        int key;
        String value;
        Node next;

        public Node(int key,String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}

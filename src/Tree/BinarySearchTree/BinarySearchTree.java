package Tree.BinarySearchTree;

public class BinarySearchTree {

    public static void main(String[] args) {

        BST bst = new BST();
        bst.insert(20);
        bst.insert(30);
        bst.insert(10);
        bst.preOrder();// 20 10 30
        System.out.println();
        bst.inOrder();//10 20 30
        System.out.println();
        bst.postOrder();// 10 30 20
        System.out.println();
        System.out.println("Is " + 8 + " in Tree: " + bst.search(8));// false
//        bst.delete(30);
        bst.preOrder();// 20 10


    }


    static class BST {

        Node root;

        public BST() {this.root = null;}

        // inserting
        public void insert(int data) {
            root = insertHelper(root, data);
        }
        // helper for insert
        private Node insertHelper(Node root, int data) {

            if(root == null) return new Node(data);

            if(data < root.data) {
                root.left = insertHelper(root.left, data);
            }else if(data > root.data) {
                root.right = insertHelper(root.right, data);
            }
            return root;
        }

        // preOrder
        public void preOrder() {
            preOrderHelper(root);
        }
        // preOrder helper
        private void preOrderHelper(Node root) {

            if(root == null) return;
            System.out.print(root.data + " ");
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }

        // inOrder
        public void inOrder() {
            inOrderHelper(root);
        }
        // inOrder helper
        private void inOrderHelper(Node root) {

            if(root == null) return;
            inOrderHelper(root.left);
            System.out.print(root.data + " ");
            inOrderHelper(root.right);
        }

        // postOrder
        public void postOrder() {
            postOrderHelper(root);
        }
        // postOrder helper
        private void postOrderHelper(Node root) {

            if(root == null) return;
            postOrderHelper(root.left);
            postOrderHelper(root.right);
            System.out.print(root.data + " ");
        }

        // search
        public boolean search(int data) {

            if(data == root.data) return true;
            if(data < root.data) {
                Node current = root;
                while(current != null) {
                    if(current.data == data) return true;
                    current = current.left;
                }
                return false;
            }
            else {
                Node temp = root;
                while(temp != null) {
                    if(temp.data == data) return true;
                    temp = temp.right;
                }
                return false;
            }
        }

        // delete


    }

    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}

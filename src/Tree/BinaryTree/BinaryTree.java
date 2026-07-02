package Tree.BinaryTree;

import static java.lang.Integer.*;

public class BinaryTree {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node(10);
        tree.root.left = new Node(100);
        tree.root.right = new Node(50);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(20);
        tree.root.left.left.left = new Node(30);
        tree.root.left.left.left.right = new Node(60);

        tree.preOrder(tree.root);// 10 100 40 30 60 20 50
        System.out.println();
        tree.inOrder(tree.root);// 30 60 40 100 20 10 50
        System.out.println();
        tree.postOrder(tree.root);// 60 30 40 20 100 50 10
        System.out.println();
        System.out.println("Height: " + tree.height(tree.root));// 5
        System.out.println("Count of Nodes: " + tree.count(tree.root)); // 7
        System.out.println("Count of Leaf Nodes: " + tree.countOfLeafNodes(tree.root));// 3
        System.out.println("Is l-40 in tree: " + tree.search(tree.root, 40));// true
        System.out.println("Count of Internal Nodes: " + tree.countInternalNodes(tree.root));// 4
        System.out.println("Largest Element: " + tree.findMax(tree.root));// 100
        System.out.println("Largest Element: " + tree.findMin(tree.root));// 10
        System.out.println("Count of Nodes with one  Child: " + tree.countNodesWithOneChild(tree.root));// 2
        tree.mirror(tree.root);
        tree.preOrder(tree.root); // 10 50 100 20 40 30 60
    }
}

class Tree {

    Node root;

    public Tree() {
        this.root = null;
    }

    public void preOrder(Node root) {

        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {

        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {

        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public int height(Node root) {

        if(root == null) return 0;
        int leftHeight = 1 + height(root.left);
        int rightHeight =  1 + height(root.right);
        return Math.max(leftHeight, rightHeight);
    }

    public int count(Node root) {

        if(root == null) return 0;
        int left = count(root.left);
        int right = count(root.right);
        return 1 + left + right;
    }

    public int countOfLeafNodes(Node root) {

        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return countOfLeafNodes(root.left) + countOfLeafNodes(root.right);
    }

    public boolean search(Node root, int data) {

        if(root == null) return false;
        if(root.data == data) return true;
        boolean flag =  search(root.left, data);
        return (flag) ? true : search(root.right, data);
    }

    public int countInternalNodes(Node root) {

        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + countInternalNodes(root.left) + countInternalNodes(root.right);
    }

    public int findMax(Node root) {

        if(root == null) return MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public int findMin(Node root) {

        if(root == null) return MAX_VALUE;
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public int countNodesWithOneChild(Node root) {

        if(root == null) return 0;
        int left = countNodesWithOneChild(root.left);
        int right = countNodesWithOneChild(root.right);
        if((root.left == null) != (root.right == null)) {
            return 1 + left + right;
        }
        return left + right;
    }

    public void mirror(Node root) {

        if(root == null) return;
        mirror(root.left);
        mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

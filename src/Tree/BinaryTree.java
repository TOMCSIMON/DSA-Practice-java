package Tree;

public class BinaryTree {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node("R-10");
        tree.root.left = new Node("l-100");
        tree.root.right = new Node("r-50");
        tree.root.left.left = new Node("l-40");
        tree.root.left.right = new Node("r-20");
        tree.root.left.left.left = new Node("l-30");
        
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
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
}

class Node {

    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

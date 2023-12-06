package TTT_Tutorial;

public class Main {
    public static void main(String[] args) {
        // create object of tree
        Tree tree = new Tree();

        // create nodes of the tree
        tree.root = new Node("Paiman");
        tree.root.left = new Node("Sumarto");
        tree.root.right = new Node("Musriah");
        tree.root.left.left = new Node("Dodik");
        tree.root.left.right = new Node("Sulika");
        tree.root.right.left = new Node("Bandi");
        tree.root.right.right = new Node("Endang");

        // preorder tree traversal
        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        //Binary Search TTT_Tutorial.Tree = A tree data structure, where each node is greater than it's left child,
        //		                         but less than it's right.

        //					   benefit: easy to locate a node when they are in this order

        //					   time complexity: best case  O(log n)
        //									 worst case O(n)

        //					   space complexity: O(n)

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(new Node(5));
        binarySearchTree.insert(new Node(1));
        binarySearchTree.insert(new Node(9));
        binarySearchTree.insert(new Node(2));
        binarySearchTree.insert(new Node(7));
        binarySearchTree.insert(new Node(3));
        binarySearchTree.insert(new Node(6));
        binarySearchTree.insert(new Node(4));
        binarySearchTree.insert(new Node(8));

        binarySearchTree.display();
    }
}
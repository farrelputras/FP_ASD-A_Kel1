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
    }
}
package TTT_Tutorial;

public class Tree {
    // root of TTT_Tutorial.Tree
    Node root;

    Tree() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // traverse the root node
//        System.out.print(node.item + "->");
        // traverse the left child
        preorder(node.left);
        // traverse the right child
        preorder(node.right);
    }

}
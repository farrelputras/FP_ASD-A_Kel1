package TTT_Tutorial;

public class Node {
//    int data;
//    TTT_Tutorial.Node left;
//    TTT_Tutorial.Node right;
//
//    public TTT_Tutorial.Node(int data) {
//        this.data = data;
//    }
//
//    //KIRI SELALU LEBIH DULU
//
////    IN ORDER (ROOT DI TENGAH)
//    private void traverseTreeInOrder(TTT_Tutorial.Node root) {
//        traverseTreeInOrder(root.left);
//        System.out.println(root.data);
//        traverseTreeInOrder(root.right);
//    }
//
////    POST ORDER (ROOTNYA DIKUNJUNGI YG TERAKHIR. KIRI DULU KEMUDIAN SEBELAH KANAN BARU ROOT)
//    private void traverseTreePostOrder(TTT_Tutorial.Node root) {
//        traverseTree(root.left);
//        traverseTree(root.right);
//        System.out.println(root.data);
//    }
//
////    PRE ORDER (ROOT DIKUNJUNGI PERTAMA KALI. ROOT -> KIRI -> KANAN)
//    private void traverseTreePreOrder(TTT_Tutorial.Node root) {
//        System.out.println(root.data);
//        traverseTreePreOrder(root.left);
//        traverseTreePreOrder(root.right);
//    }

    String name;
    Node left, right;

    public Node(String name) {
        this.name = name;
        left = right = null;
    }

    int data;

    public Node(int data) {
        this.data = data;
    }
}
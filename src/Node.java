public class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//
//    //KIRI SELALU LEBIH DULU
//
////    IN ORDER (ROOT DI TENGAH)
//    private void traverseTreeInOrder(Node root) {
//        traverseTreeInOrder(root.left);
//        System.out.println(root.data);
//        traverseTreeInOrder(root.right);
//    }
//
////    POST ORDER (ROOTNYA DIKUNJUNGI YG TERAKHIR. KIRI DULU KEMUDIAN SEBELAH KANAN BARU ROOT)
//    private void traverseTreePostOrder(Node root) {
//        traverseTree(root.left);
//        traverseTree(root.right);
//        System.out.println(root.data);
//    }
//
////    PRE ORDER (ROOT DIKUNJUNGI PERTAMA KALI. ROOT -> KIRI -> KANAN)
//    private void traverseTreePreOrder(Node root) {
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